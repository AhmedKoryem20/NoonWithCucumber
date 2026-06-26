package Tests.FilterByPriceAndRecommendations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Tests/FilterByPriceAndRecommendations",
        glue = {"Tests"},
        plugin = {"pretty" ,
                "html:target/cucumber-reports.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class FilterByPriceAndRecommendationsRunnerTest extends AbstractTestNGCucumberTests {
}
