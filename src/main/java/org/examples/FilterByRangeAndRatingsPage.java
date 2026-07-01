package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FilterByRangeAndRatingsPage extends  BasePage {
    private By Price = By.xpath("//h3[normalize-space()='Price']");
    private By rating = By.xpath("//button[.//span[normalize-space()='Sort By:']]");
    private By minimumAmountOfMoney = By.xpath("//input[@data-qa='filter-min-input']");
    private By maxmimumAmountOfMoney = By.xpath("//input[@data-qa='filter-max-input']");
    private By goSearchButton = By.xpath("//button[normalize-space()='Go']");
    private By bestRated = By.xpath("//a[normalize-space()='Best Rated']");
    private By productPrice = By.xpath("//strong[contains(@class,'Price-module')]");

    public FilterByRangeAndRatingsPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnFilterByPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Price));
        findElement(Price).click();
    }

    public void clickOnFilterByRating() {
        findElement(rating).click();
    }

    public void provideAmountOfMoney(String MIN, String MAX) {
        findElement(minimumAmountOfMoney).click();
        findElement(minimumAmountOfMoney).clear();
        findElement(minimumAmountOfMoney).sendKeys(String.valueOf(MIN));
        findElement(maxmimumAmountOfMoney).click();
        findElement(maxmimumAmountOfMoney).clear();
        findElement(maxmimumAmountOfMoney).sendKeys(String.valueOf(MAX));
        findElement(goSearchButton).click();
    }

    public void selectFilterByCustomerRatings() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(bestRated));
        findElement(bestRated).click();

    }

    public boolean verifyProductsPricesAreInRange(String minPrice, String maxPrice) {
        int min = Integer.parseInt(minPrice);
        int max = Integer.parseInt(maxPrice);
        List<WebElement> prices = driver.findElements(productPrice);
        for (WebElement price : prices) {
            String priceText = price.getText().replaceAll("[^0-9]", "").trim();
            int actualPrice = Integer.parseInt(priceText);
            if (actualPrice < min || actualPrice > max) {
                return false;
            }
        }
        return true;
    }

    public String getValidationError(String expectedError) {
        By errorMessage = By.xpath("//p[contains(@class,'error') and normalize-space()='" + expectedError + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement error =  wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return error.getText();
    }


    public void provideAmountOfMoneyWithInvalidCredentials(String min, String max) {
    WebElement minInput = findElement(minimumAmountOfMoney);
    WebElement maxInput = findElement(maxmimumAmountOfMoney);
    minInput.click();
    minInput.sendKeys(Keys.CONTROL, "a");
    minInput.sendKeys(Keys.DELETE);
    if (!min.isBlank()) {
        minInput.sendKeys(min);
    }
    minInput.sendKeys(Keys.TAB);

    maxInput.click();
    maxInput.sendKeys(Keys.CONTROL, "a");
    maxInput.sendKeys(Keys.DELETE);

    if (!max.isBlank()) {
        maxInput.sendKeys(max);
    }

    maxInput.sendKeys(Keys.TAB);
}


}

