package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SubscriptionPage;

public class SubscriptionPageTest extends BaseTest{
    private HomePage homepage;
    private LoginPage loginpage;
    private SubscriptionPage subscriptionPage;

    @BeforeClass
    public void setupPage(){
        homepage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void verifyLoginPageTitle(){
        loginpage = homepage.clickLoginBtnHomePage();
        subscriptionPage = loginpage.loginAccount();
        subscriptionPage.navigationToSubscriptionPage();
        String pageTitle = subscriptionPage.getPageTitle();
        Assert.assertEquals(pageTitle,"The New York Times: Digital and Home Delivery Subscriptions","Page title doesn't match");
    }
}
