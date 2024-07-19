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

    @Test(priority = 1)
    public void verifyPageTitle(){
        String pageTitle = homepage.getPageTitle();
        Assert.assertEquals(pageTitle,"The New York Times International - Breaking News, US News, World News, Videos","Page title doesn't match");
    }

    @Test(priority = 2)
    public void verifyHeadingText(){
        String headingText = homepage.getHeadingText();
        Assert.assertEquals(headingText,"New York Times - Top Stories","Heading text doesn't match");
    }

    @Test(priority =3)
    public void verifyLanguageEdition(){
        String[] languages ={"US","International","Canada","Spanish","Chinese"};
        for(String lang : languages){
            Assert.assertTrue(homepage.languageCheck(lang),"Page might be in a different language");
        }
    }
}
