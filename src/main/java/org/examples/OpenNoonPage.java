package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenNoonPage extends BasePage {
private By searchBar = By.xpath("//*[@id=\"search-input\"]");
    public OpenNoonPage(WebDriver driver)
    {
        super(driver);
    }
    public WebElement getNoonPage()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
    }

}
