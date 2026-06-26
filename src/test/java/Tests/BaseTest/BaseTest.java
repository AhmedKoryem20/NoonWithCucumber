package Tests.BaseTest;

import Tests.ConfigHandler;
import Tests.JSONFileManager;
import org.examples.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BaseTest{
    protected static WebDriverWait wait;
    protected static SoftAssert softAssert;
    protected static ConfigHandler configHandler;
    public static JSONFileManager jsonFileManager;
    protected static WebDriver driver;
    protected static OpenNoonPage openNoonPage;
    protected static SamsungCategoryPage samsungCategoryPage;
    protected static FilterByRangeAndRatingsPage filterByRangeAndRatingsPage;
    public By productPrice = By.xpath("//strong[contains(@class,'Price-module')]");

    }



