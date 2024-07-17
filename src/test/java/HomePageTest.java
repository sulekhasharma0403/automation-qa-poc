import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePageTest {
    private WebDriver driver;
    private String baseUrl = "https://www.nytimes.com/international/";

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sulekhasharma\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver =new ChromeDriver();
    }

    @Test
    public void verifyPageTitle(){
        driver.get(baseUrl);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"The New York Times International - Breaking News, US News, World News, Videos");
    }

    @AfterClass
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
