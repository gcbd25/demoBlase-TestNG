package Test;

import dataProvider.ConfigFileReader;
import io.qameta.allure.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.MenuBar;
import pageObjects.ModalLogIn;

@Epic("Create Account Functionality on DemoBlaze Site")
public class TC_02_SignupFeature extends setUpClass{
    @Feature("Sign Up Feature")
    @Story("Sign Up")
    @Description("Validate Sign Up with empty Information")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void CreateAccountWithEmptyInformation() {
        menuBar.clickSignUpButton();
        modalSignUp.validateModalSignUp(configFileReader.getSignUpTittle());
        modalSignUp.clickSignUp();
        modalSignUp.validateAlerrtOfEmptyForm(configFileReader.getEmptyAlert());
    }
}

