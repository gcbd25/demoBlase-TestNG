package Test;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Create Account Functionality on DemoBlaze Site")
public class TC_03_CartFeature extends setUpClass{
    @Feature("Cart Feature")
    @Story("Cart")
    @Description("E2E Purchase Flow")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void purchaseFlow() {
        homepage.selectPhoneCategory();
        homepage.selectProduct(configFileReader.getDevice());
        prodPage.validateUserLandedOnCorrectProductPage(configFileReader.getDevice());
        prodPage.validatePriceBetweenHomePageAndProduct(priceInHP);
        prodPage.clickAddToCart();
        prodPage.validateAndCloseAlert(configFileReader.getProductAddedAlert());
        menuBar.clickCartButton();
        cartPage.validateProductOnCart(configFileReader.getDevice());
        cartPage.validateProductPrice(priceInProductPage);
        cartPage.clickPlacerOrder();
        cartPage.sendName(configFileReader.getName());
        cartPage.sendCountry(configFileReader.getCountry());
        cartPage.sendCity(configFileReader.getCity());
        cartPage.sendCC(configFileReader.getCC());
        cartPage.sendMonth(configFileReader.getMonth());
        cartPage.sendYear(configFileReader.getYear());
        cartPage.clickPurchase();
        cartPage.validateConfMsg(configFileReader.getConfMessage());
    }

    @Feature("Cart Feature")
    @Story("Cart")
    @Description("User is able to delete products from cart")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void deleteProductsFromCart() {
        homepage.selectPhoneCategory();
        homepage.selectProduct(configFileReader.getDevice());
        prodPage.validateUserLandedOnCorrectProductPage(configFileReader.getDevice());
        prodPage.clickAddToCart();
        prodPage.validateAndCloseAlert(configFileReader.getProductAddedAlert());
        menuBar.clickCartButton();
        cartPage.validateProductOnCart(configFileReader.getDevice());
        cartPage.clickDelete();

    }
}
