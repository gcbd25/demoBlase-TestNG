package Utilities.Locators;

import org.openqa.selenium.By;

public class locatorsModalLogIn {
    public By modalTitle = By.xpath("//h5[@id='logInModalLabel']");
    public By inpUsername = By.xpath("//input[@id='loginusername']");
    public By inpPassword = By.xpath("//input[@id='loginpassword']");
    public By btnLogIn = By.xpath("//button[normalize-space()='Log in']");

}

