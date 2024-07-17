package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SubscriptionPage extends BasePage{

    private By continueWithoutSubscriptionBtnLocator = By.xpath("//a[contains(text(),\"Continue without subscribing\")]");
    public SubscriptionPage(WebDriver driver){
        super(driver);
    }

    public void navigationToSubscriptionPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueWithoutSubscriptionBtnLocator));
    }

    public HomePage continueWithoutSubscribingClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueWithoutSubscriptionBtnLocator));
        WebElement continueWithoutSubscriptionBtn = driver.findElement(continueWithoutSubscriptionBtnLocator);
        continueWithoutSubscriptionBtn.click();
        System.out.println("Clicked Continue Without Subscribing Button");
        return new HomePage(driver);
    }
}
