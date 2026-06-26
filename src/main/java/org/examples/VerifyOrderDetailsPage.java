package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyOrderDetailsPage extends BasePage {
    private By firstItemPrice = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/span/span");
    private By secondItemPrice = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/span/span");
    private By thirdItemPrice = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/span/span");
    private By firstItemName = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[1]/a/div/span/semibold");
    private By secondItemName = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/a/div/span/semibold");
    private By thirdItemName = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/a/div/span/semibold");
    private By totalPrice = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/div[2]/div[3]/div[2]/medium/b");
    public  VerifyOrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean getFirstItemPrice(String productPrice) {
        return findElement(firstItemPrice).isDisplayed();
    }
    public  boolean getSecondItemPrice(String productPrice) {
        return findElement(secondItemPrice).isDisplayed();
    }
    public  boolean getThirdItemPrice(String productPrice) {
        return findElement(thirdItemPrice).isDisplayed();
    }
    public boolean getFirstItemName(String productName) {
        return findElement(firstItemName).isDisplayed();
    }
    public  boolean getSecondItemName(String productName) {
        return findElement(secondItemName).isDisplayed();
    }
    public boolean getThirdItemName(String productName) {
        return findElement(thirdItemName).isDisplayed();
    }
    public boolean getTotalPrice(String totalPrice1) {
        return findElement(totalPrice).isDisplayed();
    }




}
