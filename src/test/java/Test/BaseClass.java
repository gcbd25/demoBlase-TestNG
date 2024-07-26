package Test;

import Utilities.Locators.*;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

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
    public locatorsHomepage locHomepage;
    public locatorsProductPage locProdPage;
    public locatorsCartPage locCartPage;
    //PageObjects
    public MenuBar menuBar;
    public ModalLogIn modalLogIn;
    public ModalSignUp modalSignUp;
    public HomePage homepage;
    public ProductsPage prodPage;
    public CartPage cartPage;
    //Global variables
    public static String priceInHP;
    public static String priceInProductPage;
}
