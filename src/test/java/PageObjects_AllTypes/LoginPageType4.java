package PageObjects_AllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.TestUtilities;

public class LoginPageType4 extends TestUtilities{

	/**
	 * without page factory
	 *
	 */

	
	By usernameLocator = By.xpath("//input[@id='email']");
	By passwordLocator = By.xpath("//input[@id='pass']");
	By loginButtonLocator = By.xpath("//button[@name='login']");
	By forgetPassLocator = By.linkText("Forgotten password?");
	By fingUserLocator = By.id("identify_email");
	By cancelLocator = By.xpath("//a[text()='Cancel']");
	By searchLocator = By.xpath("//button[@id='did_submit']");

	/////////////////////////////////////////////////


	public LoginPageType4 userName(String text) {
		driver.findElement(usernameLocator).sendKeys(text);
		return this;
	}
	
	public LoginPageType4 passWord(String pass) {
		driver.findElement(passwordLocator).sendKeys(pass);
		return this;
	}

	public LoginPageType4 loginButton() {
		driver.findElement(loginButtonLocator).click();
		return this;
	}
	

}
