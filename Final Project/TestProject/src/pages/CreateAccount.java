package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount extends BasePage {
    public CreateAccount(WebDriver driver) {
        super(driver);
    }
// kreiranje naloga
    By emailBy = By.id("email_create");
    By createAccountButtonBy = By.id("SubmitCreate");
    

    String baseURL = "http://automationpractice.com/index.php";

    public CreateAccount basePage(){
        driver.get(baseURL);
        return this;
    }
    public CreateAccount basePage(String email){
        writeText(emailBy);
        click(createAccountButtonBy);
        return this;
    }

}