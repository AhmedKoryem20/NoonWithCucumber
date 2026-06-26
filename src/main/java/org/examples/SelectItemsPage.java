package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SelectItemsPage extends BasePage{
    private By Item1 = By.xpath("//h2[contains(@title,'ONIKUMA K9')]/following::button[contains(@class,'atcCta')][3]");
    private By Item2 = By.xpath("//h2[contains(@title,'onikuma X15')]/following::button[contains(@class,'atcCta')][7]");
    private By Item3 = By.xpath("//h2[contains(@title,'ONIKUMA K9')]/following::button[contains(@class,'atcCta')][16]");
    public List<String> selectedTitles = new ArrayList<>();
    public SelectItemsPage(WebDriver driver) {
        super(driver);
    }

    public void pickItems(){

            selectedTitles.add(clickAndGetTitle(Item1));
            selectedTitles.add(clickAndGetTitle(Item2));
            selectedTitles.add(clickAndGetTitle(Item3));
    }

    private String clickAndGetTitle(By itemButton) {

        WebElement button = findElement(itemButton);

        WebElement productCard = button.findElement(
                By.xpath("./ancestor::div[.//h2[@data-qa='plp-product-box-name']][1]")
        );

        String title = productCard.findElement(
                By.xpath(".//h2[@data-qa='plp-product-box-name']")
        ).getText().trim();

        button.click();
        return title;
    }
}
