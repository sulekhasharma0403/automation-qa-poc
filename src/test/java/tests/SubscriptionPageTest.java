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

}
