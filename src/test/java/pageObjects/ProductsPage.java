package pageObjects;

import Test.BaseClass;
import Utilities.Locators.locatorsHomepage;
import Utilities.Locators.locatorsProductPage;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductsPage extends BaseClass {
    public ProductsPage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        wait = new waitHelper(driver);
        screen = new takeScreenshot(driver);
        locProdPage = new locatorsProductPage();
    }

    @Step("Validate User Lands on Selected Product")
    public boolean validateUserLandedOnCorrectProductPage(String mobile) {
        try {
            wait.waitVisibilityOfElementLocated(locProdPage.productName);
            Assert.assertEquals(driver.findElement(locProdPage.productName).getText(), mobile);
            screen.screenshot("Validate Landed on Product Page");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Step("Validate Price Is Consistent in Homepage and Product Page")
    public boolean validatePriceBetweenHomePageAndProduct(String price) {
        try {
            priceInProductPage = driver.findElement(locProdPage.prodPrice).getText().substring(0,driver.findElement(locProdPage.prodPrice).getText().indexOf('*')-1);
            Assert.assertTrue(driver.findElement(locProdPage.prodPrice).getText().contains(price));
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Click Add To Cart Button")
    public boolean clickAddToCart() {
        try {
            driver.findElement(locProdPage.btnAddToCart).click();
            screen.screenshot("Click Add to cart");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate And Close Alert")
    public boolean validateAndCloseAlert(String alertMsg){
        try {
            Assert.assertEquals(driver.switchTo().alert().getText(), alertMsg);
            driver.switchTo().alert().accept();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
