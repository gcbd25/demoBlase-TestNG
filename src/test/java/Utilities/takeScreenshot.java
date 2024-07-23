package Utilities;

import Test.BaseClass;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;

public class takeScreenshot extends BaseClass {
	public takeScreenshot(WebDriver driver) {
		this.driver = driver;
	}
	
	public void screenshot (String name) throws WebDriverException, IOException {
		Allure.addAttachment(name, FileUtils.openInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)));
	}
}
