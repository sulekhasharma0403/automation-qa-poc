package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By headingLocator = By.xpath("//main//h1[contains(text(),\"New\")]");
    private By loginBtnLocator = By.xpath("//span[text()='Log in']");
    public HomePage(WebDriver driver){
        super(driver);
    }

    public String getHeadingText(){
        WebElement heading = driver.findElement(headingLocator);
        return heading.getText();
    }
    public LoginPage clickLoginBtnHomePage(){
        WebElement loginBtn = driver.findElement(loginBtnLocator);
        loginBtn.click();
        System.out.println("Clicked on Login Button");
        return new LoginPage(driver);
    }
}
