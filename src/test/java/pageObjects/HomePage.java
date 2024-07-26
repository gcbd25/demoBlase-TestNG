package pageObjects;

import Test.BaseClass;
import Utilities.Locators.locatorsHomepage;
import Utilities.Locators.locatorsModalSignUp;
import Utilities.takeScreenshot;
import Utilities.waitHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;


public class HomePage extends BaseClass{
    public HomePage(WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(driver, this);
        wait = new waitHelper(driver);
        screen = new takeScreenshot(driver);
        locHomepage = new locatorsHomepage();
    }

    @Step("Select Phones Category")
    public boolean selectPhoneCategory() {
        try {
            wait.waitVisibilityOfElementLocated(locHomepage.catPhones);
            driver.findElement(locHomepage.catPhones).click();
            screen.screenshot("Click Phones Category");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Step("Select Product from Product Grid")
    public boolean selectProduct(String mobile) {
        try {
            wait.waitVisibilityOfElementLocated(locHomepage.catPhones);
            List<WebElement> products = driver.findElements(locHomepage.allProdutcs);
            List<WebElement> price = driver.findElements(locHomepage.priceProducts);
            for (WebElement webElement : products) {
                switch (mobile) {
                    case "Samsung galaxy s6":
                        priceInHP = price.getFirst().getText();
                        products.getFirst().click();
                        break;
                    case "Nokia lumia 1520":
                        priceInHP = price.get(1).getText();
                        products.get(1).click();
                        break;
                    case "Nexus 6":
                        priceInHP = price.get(2).getText();
                        products.get(2).click();
                        break;
                    case "Samsung galaxy s7":
                        priceInHP = price.get(3).getText();
                        products.get(3).click();
                        break;
                    case "Iphone 6 32gb":
                        priceInHP = price.get(4).getText();
                        products.get(4).click();
                        break;
                    case "Sony xperia z5":
                        priceInHP = price.get(5).getText();
                        products.get(5).click();
                        break;
                    case "HTC One M9":
                        priceInHP = price.get(6).getText();
                        products.get(6).click();
                        break;
                    default:
                        break;
                }
                break;
            }
            screen.screenshot("Selected one product");
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
