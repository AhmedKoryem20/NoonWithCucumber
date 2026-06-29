package Tests.FilterByPriceWithInvalidCredentials;

import Tests.BaseTest.BaseTest;
import Tests.Drivers.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FilterByPriceWithInvalidCredentialsStepDef extends BaseTest {
    private static final Logger log =  LogManager.getLogger(FilterByPriceWithInvalidCredentialsStepDef.class);

@Given("opening noon site")
public void openNoonSite() {
    log.info("Open noon website");
    WebDriverFactory.getDriver("chrome").get(jsonFileManager.getValue("url"));
    openNoonPage.getNoonPage();
    log.info("Open noon page successful");
}

@When("go to samsung category")
public void goToSamsungCategory() {
    log.debug("Move to category option");
    log.info("Wait until category menu is open");
    samsungCategoryPage.hoverOnElectronicsCategory();
    log.debug("Click Samsung in brand");
    samsungCategoryPage.clickSamsungCategory();
    softAssert.assertEquals(samsungCategoryPage.getSearchResult(),
            "Samsung Electronics & Mobiles",
            "Wrong search result");
    softAssert.assertAll();
    log.info("Move to category option successful");
}
@And("select filter by price")
    public void selectFilterByPrice() {
    log.info("Select filter by price");
    filterByRangeAndRatingsPage.clickOnFilterByPrice();
}

@And("provide invalid price range {string} {string}")
    public void provideInvalidPriceRange(String invalidMin, String invalidMax) {
    log.info("provide invalid price range");
    filterByRangeAndRatingsPage.provideAmountOfMoneyWithInvalidCredentials(jsonFileManager.getValue(invalidMin),
            jsonFileManager.getValue(invalidMax));
}

@Then("verify error messages {string}")
    public void verifyErrorMessage(String message) {
    log.info("Verifying error message");
    String errorMessage = filterByRangeAndRatingsPage.getValidationError(message);
    softAssert.assertEquals(errorMessage, message);
    softAssert.assertAll();
    log.info("Verify error message successful");
}


}
