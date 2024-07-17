package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By headingLocator = By.xpath("//main//h1[contains(text(),\"New\")]");
    private By loginBtnLocator = By.xpath("//span[text()='Log in']");
    private By searchBtnLocator = By.xpath("//button[contains(@data-testid,\"search\")]");
    private By searchTextLocator = By.xpath("//input[contains(@data-testid,\"search\")]");
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

    public SearchPage clickAndEnterSearchButton(String termToSearch){
        WebElement searchBtn = driver.findElement(searchBtnLocator);
        searchBtn.click();
        WebElement searchText = driver.findElement(searchTextLocator);
        searchText.sendKeys(termToSearch);
        searchText.sendKeys(Keys.RETURN);
        return new SearchPage(driver);
    }
}
