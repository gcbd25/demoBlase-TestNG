package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test.BaseClass;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import Utilities.Locators.locatorsModalLogIn;
import Utilities.Locators.locatorsModalSignUp;
import io.qameta.allure.Step;

public class ModalSignUp extends BaseClass{
	public ModalSignUp(WebDriver rdriver) {
		driver = rdriver;
        PageFactory.initElements(driver, this);
        wait = new waitHelper(driver);
        screen = new takeScreenshot(driver);
        locModalSignUp = new locatorsModalSignUp();
	}
	
	@Step("Validate User Opens Sign Up Modal")
    public boolean validateModalSignUp(String tittleName) {
        try {
            wait.waitPresenceOfElementLocated(locModalSignUp.modalTitle);
            Assert.assertEquals(driver.findElement(locModalSignUp.modalTitle).getText(), tittleName);
            screen.screenshot("Validate LogIn Modal is Opened");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Click Sign Up button")
    public boolean clickSignUp() {
        try {
            driver.findElement(locModalSignUp.btnSignUp).click();
            screen.screenshot("Click Sign Up");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Alert of Empty Form")
    public boolean validateAlerrtOfEmptyForm(String alertMsg){
        try {
            Assert.assertEquals(driver.switchTo().alert().getText(), alertMsg);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Input An Existing Username")
    public boolean setExistingUser(String user){
        try {
            driver.findElement(locModalSignUp.inpUser).sendKeys(user);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Input a password")
    public boolean setPassword(String psw){
        try {
            driver.findElement(locModalSignUp.inpPsw).sendKeys(psw);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Alert of Empty Form")
    public boolean validateAlerrtOfEExistingUser(String alertMsg){
        try {
            Assert.assertEquals(driver.switchTo().alert().getText(), alertMsg);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Step("Validate Alert of Success")
    public boolean validateAlertOfSuccess(String alertMsg){
        try {
            Assert.assertEquals(driver.switchTo().alert().getText(), alertMsg);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
