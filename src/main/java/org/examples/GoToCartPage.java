package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoToCartPage extends BasePage{
    private By cartIcon = By.xpath("//*[@id=\"default-header-desktop\"]/header/div[2]/a[3]");
    private By OrderSummary = By.xpath("//div[normalize-space()='Order Summary']");
    public GoToCartPage(WebDriver driver) {
        super(driver);
    }

    public void moveToCartPage(){
        findElement(cartIcon).click();
    }

    public String isCartDisplayed() {
        return findElement(OrderSummary).getText();
    }

    public List<String> getSelectedTitlesInCart() {
        List<WebElement> titleElement;
        titleElement = driver.findElements(By.xpath(
                "//a[contains(@class,'titleLink')]//div[contains(@class,'title')]"));

        List<String> productTitlesInCart = new ArrayList<>();
        for (WebElement title : titleElement) {
            productTitlesInCart.add(normalizeText(title.getText()));
        }
        return productTitlesInCart;
    }
}

