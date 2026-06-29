package Tests.VerificationOfUpdatingInvoice;

import Tests.BaseTest.BaseTest;
import Tests.Drivers.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class VerificationOfUpdatingInvoiceStepDef extends BaseTest {
    private static final Logger log = LogManager.getLogger(VerificationOfUpdatingInvoiceStepDef.class);
    double sumTotalPriceAfterRemovingItem;

    @Given("noon website opened")
    public void noonWebSiteOpened() {
        log.info("Opening website");
        WebDriverFactory.getDriver("chrome").get(jsonFileManager.getValue("url"));
        openNoonPage.getNoonPage();
        log.info("Noon website opened");
    }

    @When("user is searching for product")
    public void userIsSearchingForProduct() {
        log.info("Checking for product");
        searchForHeadPhonesPage.searchForHeadPhone("headphones");
        softAssert.assertEquals(searchForHeadPhonesPage.isHeadPhonesDisplayed(),
                "headphones","Wrong search result");
        softAssert.assertAll();
        log.info("headphones result is true");
    }

    @And("user added some items to cart")
    public void userAddedSomeItemsToCart() {
        log.info("User is adding items to cart");
        selectItemsPage.pickItems(3);
        log.info("Items added successfully");
    }

    @And("user navigate cart page")
    public void userNavigateCartPage() {
        log.info("Navigating cart page");
        goToCartPage.moveToCartPage();
        log.info("Navigated to Cart page");
    }

    @And("user removed item")
    public void userRemovedItem() throws InterruptedException {
        log.info("User is removed items from cart");
        selectItemsPage.removeItem(2);
        log.info("Getting the sum of products after removing item");
        sumTotalPriceAfterRemovingItem = verifyOrderDetailsPage.getTheSumOfProducts();
        log.info("Items removed successfully");
    }

    @Then("verify that the invoice updated")
    public void verifyThatTheInvoiceUpdated() {
        log.info("Verifying that the invoice updated");
        double updatedInvoiceTotalPrice = verifyOrderDetailsPage.getTotalPrice();
        log.info("Getting the total invoice to compare " +
                "it with the sum of products after removing item");

        softAssert.assertEquals(updatedInvoiceTotalPrice,sumTotalPriceAfterRemovingItem,0.01,
                "The updated invoice is miscalculated");
        softAssert.assertAll();

        log.info("Invoice updated successfully");
    }


}
