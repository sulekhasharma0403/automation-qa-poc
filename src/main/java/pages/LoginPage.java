package pages;

import config.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class LoginPage {
    WebDriver driver;
    Properties prop = new Properties();
    WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
    WebElement emailText = driver.findElement(By.xpath("//input[@id='email']"));
    WebElement continueBtn = driver.findElement(By.xpath("//button[text()='Continue']"));
    WebElement createAccountBtn = driver.findElement((By.xpath("//span[text()='Create Account']")));
    WebElement passwordText = driver.findElement(By.xpath("//input[@id='password')"));

    public void clickLoginBtn(){
        loginBtn.click();
        System.out.println("Clicked on Login Button");
    }

    public void createAccount(){
        clickLoginBtn();
        emailText.sendKeys("Sulekha.sharma@nagarro.com");
        continueBtn.click();
        passwordText.sendKeys("Pass@123test");
        createAccountBtn.click();


    }
}
