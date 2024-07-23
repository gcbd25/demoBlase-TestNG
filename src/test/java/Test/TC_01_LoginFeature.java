package Test;

import Utilities.waitHelper;
import dataProvider.ConfigFileReader;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import pageObjects.MenuBar;
import pageObjects.ModalLogIn;

@Epic("Log in Functionality on DemoBlaze Site")
public class TC_01_LoginFeature extends setUpClass{

    @Feature("Log In Feature")
    @Story("Log In")
    @Description("Validate Log In functionality using an invalid Username")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoginWithInvalidUsername() {
        menuBar.clickLogInButton();
        modalLogIn.validateModalLogIn(configFileReader.getLogInTittle());
        modalLogIn.setInvalidUsername(configFileReader.getInvalidUsermane());
        modalLogIn.setValidPsw(configFileReader.getValidPassword());
        modalLogIn.clickLogIn();
        modalLogIn.validateAlertWithWrongUsername(configFileReader.getWrongUsernameAlert());
    }

    @Feature("Log In Feature")
    @Story("Log In")
    @Description("Validate Log In functionality using an invalid Password")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void LoginWithInvalidPassword() {
        menuBar.clickLogInButton();
        modalLogIn.validateModalLogIn(configFileReader.getLogInTittle());
        modalLogIn.setValidUsername(configFileReader.getValidUsermane());
        modalLogIn.setInvalidPsw(configFileReader.getInvalidPassword());
        modalLogIn.clickLogIn();
        modalLogIn.validateAlertWithWrongUsername(configFileReader.getWrongPasswordAlert());
    }

    @Feature("Log In Feature")
    @Story("Log In")
    @Description("Validate Log In functionality using Valid Credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void LoginWithValidCredentials() {
        menuBar.clickLogInButton();
        modalLogIn.validateModalLogIn(configFileReader.getLogInTittle());
        modalLogIn.setValidUsername(configFileReader.getValidUsermane());
        modalLogIn.setInvalidPsw(configFileReader.getValidPassword());
        modalLogIn.clickLogIn();
        menuBar.validateLogIn(configFileReader.getValidUsermane());
    }

}
