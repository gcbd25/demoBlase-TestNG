package Utilities.Locators;

import org.openqa.selenium.By;

public class locatorsCartPage {
    public By productName = By.cssSelector("td:nth-child(2)");
    public By procuctPrice = By.xpath("//h3[@id='totalp']");
    public By btnPlaceOrder = By.xpath("//button[normalize-space()='Place Order']");
    public By inpName = By.xpath("//input[@id='name']");
    public By inpCountry = By.xpath("//input[@id='country']");
    public By inpCity = By.xpath("//input[@id='city']");
    public By inpCard = By.xpath("//input[@id='card']");
    public By inpMonth = By.xpath("//input[@id='month']");
    public By inpYear = By.xpath("//input[@id='year']");
    public By btnPurchase = By.xpath("//button[normalize-space()='Purchase']");
    public By confMessage = By.xpath("//h2[normalize-space()='Thank you for your purchase!']");
    public By btnDelete = By.xpath("//a[normalize-space()='Delete']");
    public By tableProducts = By.xpath("//tr[@class='success']");

}

