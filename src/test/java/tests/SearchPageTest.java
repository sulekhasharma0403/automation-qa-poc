package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import utils.DataProviders;

public class SearchPageTest extends BaseTest{
    private HomePage homepage;
    private SearchPage searchpage;

    @BeforeClass
    public void setupPage(){
        homepage = new HomePage(driver);
    }

    @Test(priority = 1,dataProvider = "excelDataProvider",dataProviderClass = DataProviders.class)
    public void verifySearchAttribute(String term){
        searchpage = homepage.clickAndEnterSearchButton(term);
        String attributeValue = searchpage.getAttributeValueOfSearchText();
        Assert.assertEquals(attributeValue,term);
    }
    @Test(priority = 2,dependsOnMethods = "verifySearchAttribute",dataProvider = "excelDataProvider",dataProviderClass = DataProviders.class)
    public void verifyPageTitle(String term){
        String pageTitle = searchpage.getPageTitle();
        Assert.assertEquals(pageTitle,"The New York Times - Search","Page title doesn't match");
    }
}
