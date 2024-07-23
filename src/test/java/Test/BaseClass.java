package Test;

import Utilities.Locators.locatorsMenuBar;
import Utilities.Locators.locatorsModalLogIn;
import Utilities.Locators.locatorsModalSignUp;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import dataProvider.ConfigFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.MenuBar;
import pageObjects.ModalLogIn;
import pageObjects.ModalSignUp;

public class BaseClass {
    //File reader
    public ConfigFileReader configFileReader;
    //Webdriver
    public WebDriver driver;
    //Wait
    public waitHelper wait;
    //Screenshot
    public takeScreenshot screen;
    //Locators
    public locatorsMenuBar locMenu;
    public locatorsModalLogIn locModalLogIn;
    public locatorsModalSignUp locModalSignUp;
    //PageObjects
    public MenuBar menuBar;
    public ModalLogIn modalLogIn;
    public ModalSignUp modalSignUp;
}
