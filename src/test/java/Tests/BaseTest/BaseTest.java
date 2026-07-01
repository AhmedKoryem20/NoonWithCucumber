package Tests.BaseTest;


import Tests.JSONFileManager;
import org.examples.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BaseTest{
    protected static WebDriverWait wait;
    protected static SoftAssert softAssert;
    public static JSONFileManager jsonFileManager;
    protected static WebDriver driver;
    protected static OpenNoonPage openNoonPage;
    protected static SamsungCategoryPage samsungCategoryPage;
    protected static FilterByRangeAndRatingsPage filterByRangeAndRatingsPage;
    protected static SearchForHeadPhonesPage searchForHeadPhonesPage;
    protected static SelectItemsPage selectItemsPage;
    protected static GoToCartPage goToCartPage;
    protected static VerifyOrderDetailsPage verifyOrderDetailsPage;

    }



