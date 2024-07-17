package tests;

import config.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{
    private WebDriver driver;
    private HomePage homepage;

    private String baseUrl = "https://www.nytimes.com/international/";

    @BeforeClass
    public void setupPage(){
        driver = WebDriverSetup.getDriver();
        homepage = new HomePage(driver);
    }

    @Test
    public void verifyPageTitle(){
        driver.get(baseUrl);
        String pageTitle = homepage.getPageTitle();
        Assert.assertEquals(pageTitle,"The New York Times International - Breaking News, US News, World News, Videos","Page title doesn't match");
    }
}
