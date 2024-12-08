package PageObjects_WithPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestUtilities;

public class LoginPage extends TestUtilities{
	/**
	 * With FageFactory
	 */
	
	/**
	 * Rules 
	 * 1. create a page class 
	 * 2. find the elements using annotations(@FindBy,@FindBys,@FindAll,@CacheLookup) 
	 * 3. create a constructor 
	 * 4. call PageFactory.initElements(driver,Currentclass(this)) method inside the constructor
	 * 5. create corresponding methods
	 * 
	 */

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='email']")
	private WebElement usernameLocator;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordLocator;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginButtonLocator;
	
	// using POJO Class (Encapsulation)
	
	public WebElement getUsernameLocator() {
		return usernameLocator;
	}
	
	public WebElement getPasswordLocator() {
		return passwordLocator;
	}
	public WebElement getLoginButtonLocator() {
		return loginButtonLocator;
	}
	
	/////////////////////////////////////////////////

	public void performFaceBookLogin_Type01(String user,String pass) {
		usernameLocator.sendKeys("");
		passwordLocator.sendKeys("");
		loginButtonLocator.click();
	}
	
	// OR
	
	public void performFaceBookLogin_Type02(String user,String pass) {
		getUsernameLocator().sendKeys("");
		getPasswordLocator().sendKeys("");
		getLoginButtonLocator().click();

	}
	
	
	

}
