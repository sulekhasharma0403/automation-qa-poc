package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
    public String getAttributeValue(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }
}
