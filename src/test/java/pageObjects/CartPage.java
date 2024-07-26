package pageObjects;

import Test.BaseClass;
import Utilities.Locators.locatorsCartPage;
import Utilities.Locators.locatorsMenuBar;
import Utilities.Locators.locatorsProductPage;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends BaseClass {
    public CartPage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        wait = new waitHelper(driver);
        screen = new takeScreenshot(driver);
        locCartPage = new locatorsCartPage();
    }
    @Step("Validate Product Has Been Added to Cart")
    public boolean validateProductOnCart(String mobile) {
        try {
            wait.waitVisibilityOfElementLocated(locCartPage.productName);
            Assert.assertEquals(driver.findElement(locCartPage.productName).getText(), mobile);
            screen.screenshot("Validate Product Added To Cart");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Product Price on Cart")
    public boolean validateProductPrice(String price) {
        try {
            Assert.assertEquals("$".concat(driver.findElement(locCartPage.procuctPrice).getText()), price);
            screen.screenshot("Validate Product Price");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
