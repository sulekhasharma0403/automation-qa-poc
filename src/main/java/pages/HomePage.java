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
    private By usEditionMenuLocator = By.xpath("//ul[contains(@data-testid,\"edition-menu\")]/li/a[contains(text(),\"U.S.\")]");
    private By internationalEditionMenuLocator = By.xpath("//li[contains(@data-testid,\"international\")]/a");
    private By canadaEditionMenuLocator = By.xpath("//li[contains(@data-testid,\"canada\")]/a");
    private By spanishEditionMenuLocator = By.xpath("//li[contains(@data-testid,\"spanish\")]/a");
    private By chineseEditionMenuLocator = By.xpath("//li[contains(@data-testid,\"chinese\")]/a");
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

    public boolean languageCheck(String languageToCheck){
        WebElement usEditionMenu = driver.findElement(usEditionMenuLocator);
        WebElement internationalEditionMenu = driver.findElement(internationalEditionMenuLocator);
        WebElement canadaEditionMenu = driver.findElement(canadaEditionMenuLocator);
        WebElement spanishEditionMenu = driver.findElement(spanishEditionMenuLocator);
        WebElement chineseEditionMenu = driver.findElement(chineseEditionMenuLocator);
        boolean flag=false;
        switch (languageToCheck.toLowerCase()) {
            case "us":
                flag = getAttributeValue(usEditionMenu,"lang").contentEquals("en-US");
                break;
            case "international":
                flag = getAttributeValue(internationalEditionMenu,"lang").contentEquals("en");
                break;
            case "canada":
                flag = getAttributeValue(canadaEditionMenu,"lang").contentEquals("en-CA");
                break;
            case "spanish":
                flag = getAttributeValue(spanishEditionMenu,"lang").contentEquals("es-ES");
                break;
            case "chinese":
                flag = getAttributeValue(chineseEditionMenu,"lang").contentEquals("zh-hans");
                break;
        }
        return flag;
    }
}
