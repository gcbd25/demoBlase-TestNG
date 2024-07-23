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

}
