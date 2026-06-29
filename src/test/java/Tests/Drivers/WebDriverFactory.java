package Tests.Drivers;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private static WebDriver  driver;

    public  static WebDriver getDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = ChromeDriverClass.getChromeDriver();
                break;
            case "firefox":
                driver = FireFoxDriverClass.getFireFoxDriver();
                break;
            case "edge":
                driver = EdgeDriverClass.getEdge();
                break;
            default:throw new IllegalArgumentException("Browser not supported");
        }
        return driver;
    }
public  static void setDriver(WebDriver newDriver) {
        driver = newDriver;
}

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
            ChromeDriverClass.resetDriver();
        }
    }
}
