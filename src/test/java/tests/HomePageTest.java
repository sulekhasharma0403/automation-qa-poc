package tests;

import config.ConfigLoader;
import config.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{
    private HomePage homepage;

    @BeforeClass
    public void setupPage(){
        homepage = new HomePage(driver);
    }

    @Test
    public void verifyPageTitle(){
        String pageTitle = homepage.getPageTitle();
        Assert.assertEquals(pageTitle,"The New York Times International - Breaking News, US News, World News, Videos","Page title doesn't match");
    }

    @Test
    public void verifyHeadingText(){
        String headingText = homepage.getHeadingText();
        Assert.assertEquals(headingText,"New York Times - Top Stories","Heading text doesn't match");
    }
}
