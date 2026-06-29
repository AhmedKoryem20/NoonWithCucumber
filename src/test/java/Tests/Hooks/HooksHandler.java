package Tests.Hooks;

import Tests.BaseTest.BaseTest;
import Tests.Drivers.WebDriverFactory;
import Tests.JSONFileManager;
import Tests.ScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.examples.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class HooksHandler extends BaseTest {
    public Logger log = LogManager.getLogger(HooksHandler.class);

    @Before
    public void setUp() {
        jsonFileManager = new JSONFileManager("src/main/resources/Data.json");
        driver = WebDriverFactory.getDriver(jsonFileManager.getValue("browser"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        softAssert = new SoftAssert();
        log.debug("Assertion Manager Initialized");
        openNoonPage = new OpenNoonPage(driver);
        samsungCategoryPage = new SamsungCategoryPage(driver);
        filterByRangeAndRatingsPage = new FilterByRangeAndRatingsPage(driver);
        selectItemsPage = new SelectItemsPage(driver);
        goToCartPage = new GoToCartPage(driver);
        verifyOrderDetailsPage = new VerifyOrderDetailsPage(driver);
        searchForHeadPhonesPage = new SearchForHeadPhonesPage(driver);
    }

    @After
    public void teardown() {
        try {
            Allure.addAttachment("log File", new FileInputStream("logs/application.log"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterStep
    public void checkFail(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            File scrshoot = ScreenShot.takeScreenShot(driver, "screenshots/"+scenario.getName()+".png");
            Allure.addAttachment("ScreenShot" , new FileInputStream(scrshoot));
        }
    }

}
