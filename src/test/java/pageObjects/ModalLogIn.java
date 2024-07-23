package pageObjects;

import Test.BaseClass;
import Utilities.Locators.locatorsMenuBar;
import Utilities.Locators.locatorsModalLogIn;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ModalLogIn extends BaseClass {
    public ModalLogIn(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        wait = new waitHelper(driver);
        screen = new takeScreenshot(driver);
        locModalLogIn = new locatorsModalLogIn();
    }

    @Step("Validate User Opens LogIn Modal")
    public boolean validateModalLogIn(String tittleName) {
        try {
            wait.waitPresenceOfElementLocated(locModalLogIn.modalTitle);
            Assert.assertEquals(driver.findElement(locModalLogIn.modalTitle).getText(), tittleName);
            screen.screenshot("Validate LogIn Modal is Opened");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter an Invalid Username")
    public boolean setInvalidUsername(String username) {
        try {
            driver.findElement(locModalLogIn.inpUsername).clear();
            driver.findElement(locModalLogIn.inpUsername).sendKeys(username);
            screen.screenshot("Send Invalid Username");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter an Invalid Password")
    public boolean setInvalidPsw(String psw) {
        try {
            driver.findElement(locModalLogIn.inpPassword).clear();
            driver.findElement(locModalLogIn.inpPassword).sendKeys(psw);
            screen.screenshot("Send Invalid Password");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter a Valid Username")
    public boolean setValidUsername(String username) {
        try {
            driver.findElement(locModalLogIn.inpUsername).clear();
            driver.findElement(locModalLogIn.inpUsername).sendKeys(username);
            screen.screenshot("Send Valid Username");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Enter a Valid Password")
    public boolean setValidPsw(String psw) {
        try {
            driver.findElement(locModalLogIn.inpPassword).clear();
            driver.findElement(locModalLogIn.inpPassword).sendKeys(psw);
            screen.screenshot("Send Valid Password");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("User Click LogIn Button")
    public boolean clickLogIn() {
        try {
            driver.findElement(locModalLogIn.btnLogIn).click();
            screen.screenshot("Click LogIn Button");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Alert of Wrong Username")
    public boolean validateAlertWithWrongUsername(String alertMsg){
        try {
            Assert.assertEquals(driver.switchTo().alert().getText(), alertMsg);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Alert of Wrong Password")
    public boolean validateAlertWithWrongPassword(String alertMsg){
        try {
            Assert.assertEquals(driver.switchTo().alert().getText(), alertMsg);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
