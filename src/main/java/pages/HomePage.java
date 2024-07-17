package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By headingLocator = By.xpath("//main/div/div/h1");
    public HomePage(WebDriver driver){
        super(driver);
    }

    public String getHeadingText(){
        WebElement heading = driver.findElement(headingLocator);
        return heading.getText();
    }
}
