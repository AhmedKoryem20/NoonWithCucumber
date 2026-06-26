package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToCartPage extends BasePage{
    private By cartIcon = By.xpath("//*[@id=\"default-header-desktop\"]/header/div[2]/a[3]");
    private By OrderSummary = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[1]");
    public GoToCartPage(WebDriver driver) {
        super(driver);
    }

    public void moveToCartPage(){
        findElement(cartIcon).click();
    }

    public String isCartDisplayed() {
        return findElement(OrderSummary).getText();
    }
}
