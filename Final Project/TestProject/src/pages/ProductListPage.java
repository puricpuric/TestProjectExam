package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends BasePage{
    public ProductListPage(WebDriver driver){
        super(driver);
    }

    By popularTitle = By.xpath("//*[@id='home-page-tabs']/li[1]/a");
    By bestSellersTitle = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By numberOfItemsBy = By.xpath("//*[@class='replace-2x img-responsive']");
    String baseUrl = "http://automationpractice.com/index.ph";
  
    public ProductListPage basePage(){
        driver.get(baseUrl);
        return this;
    } 

    public ProductListPage validateItemTitles(String expectedText1, String expectedText2){
        String categoryTitleP = readText(popularTitle);
        assertStringEquals( categoryTitleP, expectedText1 );

        String categoryTitleBs = readText(bestSellersTitle);
        assertStringEquals( categoryTitleBs, expectedText2 );
        return this;
    }


    public ProductListPage checkNumberOfProductsPopular(int expectedNumberOfProducts){
        int actualnumberOfAllItems = locateElements(numberOfItemsBy).size();
        assertIntegerEquals(expectedNumberOfProducts, actualnumberOfAllItems);
        return this;
    }
    public ProductListPage checkNumberOfProductsBestSeller(int expectedNumberOfProducts){
        int actualnumberOfAllItems = locateElements(numberOfItemsBy).size();
        assertIntegerEquals(expectedNumberOfProducts, actualnumberOfAllItems);
        return this;
    }
    public static void basePage() {
    }
    
}

