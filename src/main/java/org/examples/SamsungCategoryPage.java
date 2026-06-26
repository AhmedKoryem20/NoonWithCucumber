package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SamsungCategoryPage extends BasePage {
    private By electronicsCategory = By.xpath("//*[@id=\"default-header-desktop\"]/div[1]/div/div/div/div/div/div[2]/ul/li[1]/a");
    private By samsungCategory = By.xpath("//*[@id=\"default-header-desktop\"]/div[1]/div/div/div/div/div/div[2]/ul/li[1]/div/div/div[3]/div/ul/li[2]/a/img");
    private By title = By.xpath("//*[@id=\"catalog-page-container\"]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/h1");
    public SamsungCategoryPage(WebDriver driver) {
        super(driver);
    }

    public void hoverOnElectronicsCategory() {
         moveToSpecificItem(electronicsCategory);
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(samsungCategory));
    }
    public  void clickSamsungCategory(){
        driver.findElement(samsungCategory).click();
    }
    public  WebElement getCategory(){
        return driver.findElement(electronicsCategory);
    }
public String getSearchResult(){
        return findElement(title).getText();
    }

}
