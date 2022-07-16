package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CreateAccountTest {
    public WebDriver driver;

    String validEmail= "puricpuric91@gmail.com";

    @Before 
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Final Project\\TestProject\\lib\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}