package PageObjectsTheory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Theory {
	/**
	 * The Page Object Model (POM) is a design pattern in software testing, 
	 * particularly used for creating maintainable and scalable test automation frameworks. 
	 * It is commonly implemented in UI testing for web applications, mobile apps, or desktop applications.
	 */
	
	/**
	Concepts of POM:
	Page Class for Each Page: Each web page, screen, or component of the application is represented 
	as a separate class in the automation code. 
	This class acts as an interface for interacting with the elements on that page.

	Separation of Concerns: The page classes encapsulate the logic for locating elements (locators) 
	and interacting with them. Test scripts only interact with the methods in these page classes, 
	ensuring that UI details are abstracted from the tests.

	Reusability: By reusing page classes across multiple test cases, 
	POM avoids redundancy and reduces maintenance overhead.

	Maintainability: If the UI changes (e.g., element locators or behaviors), 
	the corresponding page class is updated without affecting the test scripts.
	*/
	
	/**
	Structure of a Page Class
	A page class typically consists of:

	1.Locators: Definitions of the web elements (e.g., buttons, text boxes) 
	using selectors like XPath, CSS, or IDs.
	
	2.Corresponding Methods: Actions or operations that can be performed on those elements 
	(e.g., clickButton, enterText).
	
	*/
	
	/**
	 * Types of POM
	 * 1. without PageFactory
	 * 2. with PageFactory
	 * PageFactory is a class available in selenium just like Actions
	 * PageFactory class having annotations , using these annotation we are handing the webelements
	 * 
	 */
	/**
	 * Advantages of POM 1.The Page Object Model (POM) is a design pattern in
	 * Selenium WebDriver. 2.It improves code readability(understanding) and
	 * maintainability. 3.It helps to separate the test scripts from the
	 * corresponding web elements, 4.making test scripts cleaner and more reusable.
	 */
	/**
	 * Rules 1. create a page class 2. find the elements using
	 * annotations(@FindBy,@FindBys,@FindAll) 3. create a constructor 4. call
	 * initelements methods inside the constructor 5. create corresponding methods
	 * 
	 */

	/**
	 * Advantages of PageFactory Define web elements using @FindBy.
	 * Use PageFactory.initElements() to initialize the web elements to avoid stale
	 * element reference exception
	 */
	
	/**
	 * Annotations for finding webelements
	 * 1. @FindBy
	 * use to locate the elements using a single locator to find Single or Multiple web elements.
	 * 2. @FindBys
	 * Use to locate elements that match all conditions just like AND operator.
	 * 3. @FindAll
	 * Use to locate elements that match any one of the conditions just like OR operator.
	 * 4. @CacheLookup
	 * Use to cache the web element for better performance if the element does not change.
	 */

	
	/**
	 * Various POM Design Patterns
	1. Standard Page Object Model
	Description: Each web page or component is represented as a separate class, 
	encapsulating the locators and interaction methods.
	Structure:
	One class per page.
	Methods represent user actions on the page elements (e.g., clickLoginButton()).
	Use Case: Suitable for small to medium-sized projects with straightforward UI structures.
	Example:

	public class LoginPage {
	    By usernameField = By.id("username");
	    By passwordField = By.id("password");
	    By loginButton = By.id("login");

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }
	}
	2. Enhanced Page Object Model
	Description: Extends the standard model by including reusable components
	(e.g., headers, footers, or menus) as separate classes or objects.
	Structure:
	Composite design: Individual components like Header, Footer, or Sidebar are separate classes.
	Pages use these components.
	Use Case: Suitable for complex UIs with reusable sections.
	Example:
	public class HeaderComponent {
	    By logo = By.id("site-logo");

	    public void clickLogo() {
	        driver.findElement(logo).click();
	    }
	}

	public class LoginPage {
	    HeaderComponent header = new HeaderComponent();

	    By usernameField = By.id("username");

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }
	}
	3. Factory Design with PageFactory
	Description: Utilizes Selenium's PageFactory for dynamic element initialization using annotations.
	Structure:
	Uses @FindBy annotations for element locators.
	Elements are initialized when the page object is instantiated.
	Use Case: Suitable for projects requiring cleaner and more concise element definitions.
	Example:
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	    @FindBy(id = "username")
	    WebElement usernameField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "login")
	    WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    public void login(String username, String password) {
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }
	}
	4. Fluent Page Object Model
	Description: Follows a "fluent interface" pattern, 
	enabling method chaining for cleaner test scripts.
	Structure:
	Methods return the instance of the page object.
	Promotes a readable flow in test cases.
	Use Case: Best for test scripts requiring multiple sequential actions.
	
	Example:
	public class LoginPage {
	    By usernameField = By.id("username");
	    By passwordField = By.id("password");

	    public LoginPage enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	        return this;
	    }

	    public LoginPage enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	        return this;
	    }

	    public HomePage clickLogin() {
	        driver.findElement(By.id("login")).click();
	        return new HomePage(driver);
	    }
	}
	Test Script:
	loginPage.enterUsername("user")
	         .enterPassword("pass")
	         .clickLogin();
	
	5. Singleton Page Object Model
	Description: Ensures a single instance of a page object is created for use across multiple tests, 
	following the Singleton design pattern.
	Structure:
	Page classes provide a static method to get the single instance.
	Use Case: Used in frameworks where test cases share state across multiple steps.
	Example:
	public class LoginPage {
	    private static LoginPage instance;
	    private WebDriver driver;

	    private LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public static LoginPage getInstance(WebDriver driver) {
	        if (instance == null) {
	            instance = new LoginPage(driver);
	        }
	        return instance;
	    }
	}
	6. Service Page Object Model
	Description: Focuses on separating business logic into service layers 
	while keeping UI interactions minimal.
	Structure:
	Page objects handle element interactions.
	Service classes encapsulate complex workflows.
	Use Case: Suitable for enterprise-level projects with complex workflows.
	Example:
	// Page Object
	public class LoginPage {
	    By usernameField = By.id("username");
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }
	}

	// Service Class
	public class LoginService {
	    LoginPage loginPage = new LoginPage();

	    public void performLogin(String username, String password) {
	        loginPage.enterUsername(username);
	        loginPage.enterPassword(password);
	        loginPage.clickLogin();
	    }
	}
	7. Dynamic Page Object Model
	Description: Dynamically adjusts to handle UI components with 
	varying structures (e.g., dynamic tables or forms).
	Structure:
	Uses generic methods and dynamic locators.
	Use Case: For highly dynamic web applications with frequently changing UIs.
	Example:
	public class DynamicPage {
	    public WebElement getElementByDynamicLocator(String locatorType, String locatorValue) {
	        return driver.findElement(By.locatorType(locatorValue));
	    }
	}
	
	*/

	
	
	
	
	
	
	
	
	
	
	
	

}
