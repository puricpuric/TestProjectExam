package tests;

import org.junit.Test;

import pages.BasePage;
import pages.ProductListPage;

public class ProductListPageTest extends BaseTest{

    public BasePage basePage;
    public ProductListPage productListPage;
    

    int numberOfAllItems = 7;
    String popularCategoryTitle = "POPULAR";
    String bestSellersTitle = "BEST SELLERS";


@Test
    public void navigateToUrl(){
    ProductListPage productListPage = new ProductListPage(driver);

    productListPage.basePage();
    
    try {
        Thread.sleep(3000); 
    } catch (InterruptedException exception) {
        exception.printStackTrace();
    }
    
    }

    @Test
    public void validateItemTitles(){
    productListPage = new ProductListPage(driver);

    productListPage.basePage();
    productListPage.validateItemTitles(popularCategoryTitle,bestSellersTitle);
    
    try {
        Thread.sleep(3000); 
    } catch (InterruptedException exception) {
        exception.printStackTrace();
    }
    
    }

@ Test
    public void checkNumberOfProductsPopular(){
    productListPage = new ProductListPage(driver);

    productListPage.basePage();
    productListPage.checkNumberOfProductsPopular(numberOfAllItems);
    
    try {
        Thread.sleep(3000); 
    } catch (InterruptedException exception) {
        exception.printStackTrace();
    }

    }

@Test
    public void checkNumberOfProductsBestSeller(){
    productListPage = new ProductListPage(driver);

    productListPage.basePage();
    productListPage.checkNumberOfProductsBestSeller(numberOfAllItems);
    
    try {
        Thread.sleep(3000); 
    } catch (InterruptedException exception) {
        exception.printStackTrace();
    }

    }

}