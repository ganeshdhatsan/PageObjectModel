package PageObjects_AllTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.TestUtilities;

public class LoginPageType1 extends TestUtilities{

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

	public WebElement userName() {
		WebElement username = driver.findElement(usernameLocator);
		return username;
	}

	public WebElement passWord() {
		WebElement password = driver.findElement(passwordLocator);
		return password;
	}

	public WebElement loginButton() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		return loginButton;
	}

	private WebElement forgottonPasswordLink() {
		WebElement forgetPassword = driver.findElement(forgetPassLocator);
		return forgetPassword;
	}

	private WebElement findUserName() {
		WebElement findUser = driver.findElement(fingUserLocator);
		return findUser;

	}

	private WebElement cancelButton() {
		WebElement cancel = driver.findElement(cancelLocator);
		return cancel;

	}

	private WebElement searchButton() {
		WebElement search = driver.findElement(searchLocator);
		return search;

	}

	/////////////////////////////////////////////////

	public void performLogin(String user, String pass) {
		userName().sendKeys(user);
		passWord().sendKeys(pass);
		loginButton().click();

	}
	
	private void searchUser(String user) {
		forgottonPasswordLink().click();
		findUserName().sendKeys(user);
		searchButton().click();

	}

	private void cancelUser(String user) {
		forgottonPasswordLink().click();
		findUserName().sendKeys(user);
		cancelButton().click();

	}

}
