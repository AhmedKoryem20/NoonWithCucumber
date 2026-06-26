package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchForHeadPhonesPage extends BasePage {
    private By searchBar = By.xpath("//*[@id=\"search-input\"]");
    private By searchResult = By.xpath("//h1[normalize-space()= 'headphones']");

    public SearchForHeadPhonesPage(WebDriver driver) {
        super(driver);
    }
    public void searchForHeadPhone(String headPhones) {
        findElement(searchBar).click();
        findElement(searchBar).sendKeys(headPhones);
        doEnterAction();
    }
    public void doEnterAction() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
    }
    public String isHeadPhonesDisplayed() {
        return findElement(searchResult).getText();
    }


}
