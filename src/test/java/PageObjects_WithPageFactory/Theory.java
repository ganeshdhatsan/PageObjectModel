package PageObjects_WithPageFactory;

public class Theory {

	/**
	 * Advantages of POM 1.The Page Object Model (POM) is a design pattern in
	 * Selenium WebDriver. 2.It improves code readability(understanding) and
	 * maintainability. 3.It helps to separate the test scripts from the
	 * corresponding web elements, 4.making test scripts cleaner and more reusable.
	 */
	/**
	 * Rules 
	 * 1. create a page class 
	 * 2. find the elements using annotations(@FindBy,@FindBys,@FindAll) 
	 * 3. create a constructor 
	 * 4. call initelements methods inside the constructor 5. create corresponding methods
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

	/////// locators///////////////////

	/////////// methods //////////////

}
