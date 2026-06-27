package Tests.AddMultipleProductsToCart;
import Tests.BaseTest.BaseTest;
import Tests.Drivers.WebDriverFactory;
import Tests.GetSamsungCategory.GetSamsungCategoryStepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddMultipleProductsToCartStepDef extends BaseTest {
    private static final Logger log = LogManager.getLogger(AddMultipleProductsToCartStepDef.class);
    @Given("open the noon website")
    public void openNoonWebsite() {
        log.info("Opening Noon website");
        WebDriverFactory.getDriver("chrome").get(jsonFileManager.getValue("url"));
        openNoonPage.getNoonPage();
        log.info("Noon website opened successfully");
    }
    @When("type headphones in search field")
    public void typeHeadphonesInSearchField() {
        log.info("Searching for headphones in search field");
        searchForHeadPhonesPage.searchForHeadPhone("headphones");
        softAssert.assertEquals(searchForHeadPhonesPage.isHeadPhonesDisplayed(),
                "headphones","Wrong search result");
        softAssert.assertAll();
        log.info("headphones result is true");
    }
    @And("add {string} and {string} and {string}")
    public void AddAndAnd(String item1, String item2, String item3) {
        log.info("Adding items to cart");
        selectItemsPage.pickItems(jsonFileManager.getValue(item1)
                , jsonFileManager.getValue(item2),
                jsonFileManager.getValue(item3));
        log.info("Items added successfully");
    }

    @And("go to cart page")
    public void goToCartPage() {
        log.info("Going to cart page");
        goToCartPage.moveToCartPage();
        softAssert.assertEquals(goToCartPage.isCartDisplayed(),"Order Summary",
                "Wrong Navigated page");
        softAssert.assertAll();
        log.info("Navigated to cart page successfully");
    }
    @Then("verify added items in cart with details")
    public void verifyAddedItemsInCartWithDetails() {
        log.info("Verifying added products invoice");
        double sumOfProductsPrice = verifyOrderDetailsPage.getTheSumOfProducts();
        double invoiceTotalPrice = verifyOrderDetailsPage.getTotalPrice();
        log.info("Verifying Order details");
        softAssert.assertEquals(sumOfProductsPrice,invoiceTotalPrice,0.01,"Total price is incorrect");
        softAssert.assertAll();
        log.info("Order Summary is successfully verified");
    }

}
