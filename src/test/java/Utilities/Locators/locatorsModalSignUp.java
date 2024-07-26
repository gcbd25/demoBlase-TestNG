package Utilities.Locators;

import org.openqa.selenium.By;

public class locatorsModalSignUp {
	public By modalTitle = By.xpath("//h5[@id='signInModalLabel']");
	public By btnSignUp = By.xpath("//button[normalize-space()='Sign up']");
	public By inpUser = By.xpath("//input[@id='sign-username']");
	public By inpPsw = By.xpath("//input[@id='sign-password']");
}