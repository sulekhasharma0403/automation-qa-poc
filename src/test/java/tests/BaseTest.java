package tests;

import config.WebDriverSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setup(){
        WebDriverSetup.setupDriver();
    }

    @AfterClass
    public void teardown(){
        WebDriverSetup.tearDownDriver();
    }
}
