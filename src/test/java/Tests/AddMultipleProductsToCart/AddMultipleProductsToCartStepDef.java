package Tests.AddMultipleProductsToCart;
import Tests.BaseTest.BaseTest;
import Tests.Drivers.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

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
    @And("add your items")
    public void addYourItems() {
        log.info("Adding items to cart");
        selectItemsPage.pickItems(3);
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
    @And("verify added items in cart with cost details")
    public void verifyAddedItemsInCartWithCostDetails() {
        log.info("Verifying added products invoice");
        double sumOfProductsPrice = verifyOrderDetailsPage.getTheSumOfProducts();
        double invoiceTotalPrice = verifyOrderDetailsPage.getTotalPrice();
        log.info("Verifying Order details");
        softAssert.assertEquals(sumOfProductsPrice,invoiceTotalPrice,0.01,"Total price is incorrect");
        softAssert.assertAll();
        log.info("Order Summary is successfully verified");
    }
    @Then("verify products selected are shown in cart")
    public void verifyProductsSelectedAreShownInCart() {
        log.info("Verifying selected items are shown in cart page");
        List<String> itemsAdded = new ArrayList<>(selectItemsPage.getSelectedTitles());
        List<String> itemsInCart = new ArrayList<>(goToCartPage.getSelectedTitlesInCart());
        softAssert.assertTrue(verifyOrderDetailsPage.areAllProductsInCart(itemsAdded,itemsInCart),
                "Selected titles are incorrect");
        softAssert.assertAll();
        log.info("Products verified successfully");
    }

}
