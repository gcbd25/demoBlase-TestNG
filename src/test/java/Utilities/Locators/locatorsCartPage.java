package Utilities.Locators;

import org.openqa.selenium.By;

public class locatorsCartPage {
    public By productName = By.cssSelector("td:nth-child(2)");
    public By procuctPrice = By.xpath("//h3[@id='totalp']");
}
