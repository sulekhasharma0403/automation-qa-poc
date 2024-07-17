package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
    private HomePage homepage;
    private LoginPage loginpage;

    @BeforeClass
    public void setupPage(){
        homepage = new HomePage(driver);
    }

    @Test
    public void verifyLoginPageTitle(){
        loginpage = homepage.clickLoginBtnHomePage();
        String pageTitle = loginpage.getPageTitle();
        Assert.assertEquals(pageTitle,"Enter email - The New York Times","Page title doesn't match");
    }
}
