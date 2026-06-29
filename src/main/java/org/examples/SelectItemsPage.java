package org.examples;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SelectItemsPage extends BasePage{


    public List<String> selectedTitles = new ArrayList<>();
    public SelectItemsPage(WebDriver driver) {
        super(driver);
    }



    public void clickAddToCart(int noOfProducts) {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[.//img[@alt='add-to-cart']]"));
        for (int i = 0; i < noOfProducts ; i++) {
            WebElement button = addToCartButtons.get(i);
            wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        }

    }

    public void pickItems(int  noOfProducts) {

        clickAddToCart(noOfProducts);

    }
    public void clickRemoveItem(int locationInCart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        List <WebElement> removeButtons = driver.findElements(By.xpath(
                "//button[@data-qa='cart-remove_item']"));

            WebElement button = removeButtons.get(locationInCart);
            wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
            wait.until(ExpectedConditions.stalenessOf(button));
    }

    public void removeItem(int locationInCart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//div[normalize-space()='Order Summary']")));
        clickRemoveItem(locationInCart);

    }
}
