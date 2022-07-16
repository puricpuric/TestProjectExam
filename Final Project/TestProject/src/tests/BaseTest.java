package tests;


import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
    public WebDriver driver;
    public FirefoxOptions options;
    

@Before
public void setup(){
    System.setProperty( "webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Final Project\\TestProject\\lib\\geckodriver.exe ");
    driver = new FirefoxDriver();
    driver.get("http://automationpractice.com/index.ph")

    driver.manage().window().maximize();
}

@After
public void teardown(){
    driver.quit();
}

}
