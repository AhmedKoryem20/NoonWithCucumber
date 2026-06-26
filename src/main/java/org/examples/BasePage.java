package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement findElement (By locator){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20)) ;
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void moveToSpecificItem(By  locator1){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(locator1);
        actions.moveToElement(element).perform();
    }
}
