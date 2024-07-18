package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverSetup {
    protected static WebDriver driver;

    public static void setupDriver() {
        String browser = ConfigLoader.getProperty("browser");
        boolean headless = ConfigLoader.getBooleanProperty("headless", false);

        switch (browser.toLowerCase()) {
            case "edge":
                System.setProperty("webdriver.edge.driver", ConfigLoader.getProperty("edgeDriverPath"));
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--inprivate");
                edgeOptions.addArguments("--start-maximized");
                if (headless) {
                    edgeOptions.addArguments("--headless");
                }
                driver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", ConfigLoader.getProperty("chromeDriverPath"));
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("--start-maximized");
                if (headless) {
                    chromeOptions.addArguments("--headless");
                }
                driver = new ChromeDriver(chromeOptions);
                break;
        }
    }

    public static void tearDownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
