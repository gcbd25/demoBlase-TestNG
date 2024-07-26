package Utilities.Locators;

import org.openqa.selenium.By;

public class locatorsProductPage {
    public By productName = By.xpath("//h2[@class='name']");
    public By prodPrice = By.xpath("//h3[@class='price-container']");
    public By btnAddToCart = By.xpath("//a[normalize-space()='Add to cart']");
}
