package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    private By searchTextHeadingLocator = By.xpath("//input[contains(@data-testid,\"search\")]");
    public SearchPage(WebDriver driver){
        super(driver);
    }

   public String getAttributeValueOfSearchText(){
        WebElement searchTextHeading = driver.findElement(searchTextHeadingLocator);
        return getAttributeValue(searchTextHeading,"value");
   }
}
