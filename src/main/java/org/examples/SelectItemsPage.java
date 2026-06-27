package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SelectItemsPage extends BasePage{


    public List<String> selectedTitles = new ArrayList<>();
    public SelectItemsPage(WebDriver driver) {
        super(driver);
    }



    public void clickAddToCart(String productKeyword) {
        driver.findElement(By.xpath(
                "//div[contains(@data-qa,'" + productKeyword + "')]//button[.//img[@alt='add-to-cart']]"
        )).click();
    }

    public void pickItems(String item1 , String item2, String item3) {

        clickAddToCart(item1);
        clickAddToCart(item2);
        clickAddToCart(item3);

    }


}
