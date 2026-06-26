package Tests.GetSamsungCategory;
import Tests.BaseTest.BaseTest;
import Tests.Drivers.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class GetSamsungCategoryStepDef extends BaseTest {
    private static final Logger log = LogManager.getLogger(GetSamsungCategoryStepDef.class);



    @Given("open noon website")
    public void openNoonWebsite() {
        WebDriverFactory.getDriver("chrome").get(jsonFileManager.getValue("url"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
        log.debug("Open noon website");
    }

    @When("move to category option")
    public void moveToCategoryOption() {
        log.debug("Move to category option");
        log.info("Wait until category menu is open");
        samsungCategoryPage.hoverOnElectronicsCategory();
    }

    @Then("click samsung")
    public void clickSamsung() {
        log.debug("Click Samsung in brand");
        samsungCategoryPage.clickSamsungCategory();
        softAssert.assertEquals(samsungCategoryPage.getSearchResult(),
                "Samsung Electronics & Mobiles",
                "Wrong search result");
    }
}
