package PageObjects_AllTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.TestUtilities;

public class LoginPageType5 extends TestUtilities{
	/**
	 * without page factory
	 *
	 */

	
	By usernameLocator = By.xpath("//input[@id='email']");// presence of element located
	String usernameLocat ="//input[@id='email']";
	
	By passwordLocator = By.xpath("//input[@id='pass']");
	String passwordLocat ="//input[@id='pass']";
	
	By loginButtonLocator = By.xpath("//button[@name='login']");
	String loginButtonLocat = "//button[@name='login']"; 
	
	By forgetPassLocator = By.linkText("Forgotten password?");
	By fingUserLocator = By.id("identify_email");
	By cancelLocator = By.xpath("//a[text()='Cancel']");
	By searchLocator = By.xpath("//button[@id='did_submit']");
	
	////////////////////////////////////////////////
	
	public void performLogin(String user,String pass) {
//		WebElement element = getElement("xpath", usernameLocat);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(usernameLocator)).sendKeys(user);
		
//		getElement("xpath", passwordLocat);
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOf(getElement("xpath", passwordLocat))).sendKeys(user);
		
		getElement("xpath", loginButtonLocat).click();
	}
	
	public void performLogin1(String user,String pass) {
		getElementBy("xpath",usernameLocator ).sendKeys(user);
		getElementBy("xpath",passwordLocator ).sendKeys(pass);
		getElementBy("xpath",loginButtonLocator ).click();

	}
	
	

}
