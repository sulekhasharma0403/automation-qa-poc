package tests;

import config.ConfigLoader;
import config.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected String baseUrl;
    @BeforeClass
    public void setup(){

        WebDriverSetup.setupDriver();
        driver = WebDriverSetup.getDriver();
        baseUrl = ConfigLoader.getProperty("baseUrl");
        driver.get(baseUrl);
    }
    @AfterClass
    public void teardown(){
        WebDriverSetup.tearDownDriver();
    }
}
