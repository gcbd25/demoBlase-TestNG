package pageObjects;

import Test.BaseClass;
import Utilities.Locators.locatorsMenuBar;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenuBar extends BaseClass {
    public MenuBar(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        wait = new waitHelper(driver);
        screen = new takeScreenshot(driver);
        locMenu = new locatorsMenuBar();
    }

    @Step("Click Log In Button on Menu Bar")
    public boolean clickLogInButton() {
        try {
            wait.waitPresenceOfElementLocated(locMenu.btnLogIn);
            driver.findElement(locMenu.btnLogIn).click();
            screen.screenshot("Click Log In Button on Menu Bar");
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Step("User Validates a successful login")
    public boolean validateLogIn(String username){
        try {
            wait.waitVisibilityOfElementLocated(locMenu.username);
            Assert.assertEquals(driver.findElement(locMenu.username).getText(), "Welcome " +username);
            screen.screenshot("Log in completed");
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Step("Click Log In Button on Menu Bar")
    public boolean clickSignUpButton() {
        try {
            wait.waitPresenceOfElementLocated(locMenu.btnSignUp);
            driver.findElement(locMenu.btnSignUp).click();
            screen.screenshot("Click Sign Up Button");
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Step("Click Cart Button on Menu Bar")
    public boolean clickCartButton() {
        try {
            wait.waitPresenceOfElementLocated(locMenu.btnCart);
            driver.findElement(locMenu.btnCart).click();
            screen.screenshot("Click Cart Button");
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
