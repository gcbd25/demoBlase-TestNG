package pageObjects;

import Test.BaseClass;
import Utilities.Locators.locatorsCartPage;
import Utilities.Locators.locatorsMenuBar;
import Utilities.Locators.locatorsProductPage;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @Step("Click Place Order Button")
    public boolean clickPlacerOrder() {
        try {
            driver.findElement(locCartPage.btnPlaceOrder).click();
            screen.screenshot("Click Place Order");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter Name on Place Order Modal")
    public boolean sendName(String name) {
        try {
            wait.waitVisibilityOfElementLocated(locCartPage.inpName);
            driver.findElement(locCartPage.inpName).clear();
            driver.findElement(locCartPage.inpName).sendKeys(name);
            screen.screenshot("Send Name");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter Country on Place Order Modal")
    public boolean sendCountry(String Country) {
        try {
            driver.findElement(locCartPage.inpCountry).clear();
            driver.findElement(locCartPage.inpCountry).sendKeys(Country);
            screen.screenshot("Send Country");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter City on Place Order Modal")
    public boolean sendCity(String city) {
        try {
            driver.findElement(locCartPage.inpCity).clear();
            driver.findElement(locCartPage.inpCity).sendKeys(city);
            screen.screenshot("Send City");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter CC on Place Order Modal")
    public boolean sendCC(String CC) {
        try {
            driver.findElement(locCartPage.inpCard).clear();
            driver.findElement(locCartPage.inpCard).sendKeys(CC);
            screen.screenshot("Send CC");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter Month on Place Order Modal")
    public boolean sendMonth(String Month) {
        try {
            driver.findElement(locCartPage.inpMonth).clear();
            driver.findElement(locCartPage.inpMonth).sendKeys(Month);
            screen.screenshot("Send Month");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter Year on Place Order Modal")
    public boolean sendYear(String Year) {
        try {
            driver.findElement(locCartPage.inpYear).clear();
            driver.findElement(locCartPage.inpYear).sendKeys(Year);
            screen.screenshot("Send Year");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Click Purchase Button")
    public boolean clickPurchase() {
        try {
            driver.findElement(locCartPage.btnPurchase).click();
            screen.screenshot("Click Purchase");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Confirmation Message on Purchase")
    public boolean validateConfMsg(String message) {
        try {
            wait.waitVisibilityOfElementLocated(locCartPage.confMessage);
            Assert.assertEquals(driver.findElement(locCartPage.confMessage).getText(), message);
            screen.screenshot("Validate Confirmation Message");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Click Delete Button")
    public boolean clickDelete() {
        try {
            driver.findElement(locCartPage.btnDelete).click();
            wait.waitInvisibilityOfElementLocated(locCartPage.tableProducts);
            screen.screenshot("Click Delete");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
