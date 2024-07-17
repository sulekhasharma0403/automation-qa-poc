package pages;

import config.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class LoginPage extends BasePage {
    private By emailTextLocator = By.xpath("//input[@id='email']");
    private By continueBtnLocator = By.xpath("//button[text()='Continue']");
    private By loginAccountBtnLocator = By.xpath("//button[text()='Log In']");
    private By passwordTextLocator = By.xpath("//input[@id='password']");

    public LoginPage(WebDriver driver){
        super(driver);
    }
    public SubscriptionPage loginAccount(){
        WebElement emailText = driver.findElement(emailTextLocator);
        emailText.sendKeys(ConfigLoader.getProperty("Username"));
        WebElement continueBtn = driver.findElement(continueBtnLocator);
        continueBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextLocator));
        WebElement passwordText = driver.findElement(passwordTextLocator);
        passwordText.sendKeys(ConfigLoader.getProperty("Password"));
        WebElement loginAccountBtn = driver.findElement(loginAccountBtnLocator);
        loginAccountBtn.click();
        return new SubscriptionPage(driver);
    }
}
