package PageObjects_WithPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import Utilities.TestUtilities;

public class UsingAnnotations extends TestUtilities {
	
	/**
	 * Annotations for finding webelements
	 * 1. @FindBy
	 * use to locate the elements using a single locator to find Single or Multiple web elements.
	 * 2. @FindBys
	 * Use to locate element using multiple locators and all locators should match just like AND operator.
	 * 3. @FindAll
	 * Use to locate elements that match any one of the conditions just like OR operator.
	 * 4. @CacheLookup
	 * Use to cache the web element for better performance if the element does not change.
	 */
	
	
	//1. @FindBy
	
	@FindBy(xpath="//strong[text()='Afghanistan']")
	private WebElement country;
	
	@FindBy(xpath="//strong[text()='Afghanistan']//following::td")
	private List<WebElement> countries;
	

	@FindBys({@FindBy(xpath="//input[@id='email']")
	,@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")})
	private WebElement userNameLocator;
	
	@FindBys({@FindBy(xpath="//input[@id='email']")
	,@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")})
	private List<WebElement> countries1;
	
	
	@FindAll({@FindBy(xpath="//input[@id='email']")
	,@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")})
	private WebElement userNameLocator1;
	
	@FindAll({@FindBy(xpath="//input[@id='email']")
	,@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")})
	private List<WebElement> userNameLocator2;
	
	
	@FindBy(xpath="//strong[text()='Afghanistan']")
	@CacheLookup
	private WebElement country1;
	
	@FindBy(xpath="//strong[text()='Afghanistan']")
	@CacheLookup
	private List<WebElement> country3;
	
	public WebElement findCurrency(String country) {
		WebElement currency = driver.findElement(By.xpath("//table[@id='countries']//tbody//tr//td//strong[text()='"
				+ country + "']/../following-sibling::td[2]"));
		return currency;
	}
	
	
	
	
	
	
	
	
	
	
	

}
