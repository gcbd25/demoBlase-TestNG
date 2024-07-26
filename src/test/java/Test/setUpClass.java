package Test;

import io.cucumber.java.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import dataProvider.ConfigFileReader;
import pageObjects.*;

public class setUpClass extends BaseClass {
	@BeforeTest
    public void setUp() {
        configFileReader= new ConfigFileReader();
        switch (configFileReader.getBrowser()) {
            case "Chrome": {
                //Ubicacion del driver Por si se necesita
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;
            }
            case "Edge": {
                //Ubicacion del driver
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--start-maximized");
                driver = new EdgeDriver(options);
                break;
            }
            case "Firefox": {
                //Ubicacion del driver
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--start-maximized");
                driver = new FirefoxDriver(options);
                break;
            }
            default:
                driver.quit();
                break;
        }
        //Page Objects
        menuBar = new MenuBar(driver);
        modalLogIn = new ModalLogIn(driver);
        modalSignUp = new ModalSignUp(driver);
        homepage = new HomePage(driver);
        prodPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

    @BeforeClass
    public void OpenLink() {
        driver.get(configFileReader.getURL());
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
