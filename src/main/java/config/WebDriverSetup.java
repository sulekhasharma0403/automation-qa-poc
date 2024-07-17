package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetup {
    protected static WebDriver driver;

    public static void setupDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sulekhasharma\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver =new ChromeDriver(options);
    }

    public static void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
