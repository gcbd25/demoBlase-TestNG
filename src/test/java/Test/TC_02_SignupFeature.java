package Test;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Create Account Functionality on DemoBlaze Site")
public class TC_02_SignupFeature extends setUpClass{
    @Feature("Sign Up Feature")
    @Story("Sign Up")
    @Description("Validate Sign Up with empty Information")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void CreateAccountWithEmptyInformation() {
        menuBar.clickSignUpButton();
        modalSignUp.validateModalSignUp(configFileReader.getSignUpTittle());
        modalSignUp.clickSignUp();
        modalSignUp.validateAlerrtOfEmptyForm(configFileReader.getEmptyAlert());
    }

    @Feature("Sign Up Feature")
    @Story("Sign Up")
    @Description("Validate Sign Up with empty Information")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void CreateAccountWithRepeatedEmail() {
        menuBar.clickSignUpButton();
        modalSignUp.validateModalSignUp(configFileReader.getSignUpTittle());
        modalSignUp.setExistingUser(configFileReader.getValidUsermane());
        modalSignUp.setPassword(configFileReader.getValidPassword());
        modalSignUp.clickSignUp();
        modalSignUp.validateAlerrtOfEExistingUser(configFileReader.getExistingUserAlert());
    }

    @Feature("Sign Up Feature")
    @Story("Sign Up")
    @Description("Validate Sign Up")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void CreateAccount() {
        menuBar.clickSignUpButton();
        modalSignUp.validateModalSignUp(configFileReader.getSignUpTittle());
        modalSignUp.setExistingUser(configFileReader.getValidUsermane() + (Math.random() * 10000) + 1);
        modalSignUp.setPassword(configFileReader.getValidPassword());
        modalSignUp.clickSignUp();
        modalSignUp.validateAlertOfSuccess(configFileReader.getSuccessAlert());
    }
}

