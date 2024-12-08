package PageObjects_WithoutPageFactory_Important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.TestUtilities;

public class LoginPageType3 extends TestUtilities {

	/**
	 * without page factory
	 *
	 */

	public WebElement findCurrency(String country) {
		WebElement currency = driver.findElement(By.xpath("//table[@id='countries']//tbody//tr//td//strong[text()='"
				+ country + "']/../following-sibling::td[2]"));
		return currency;
	}

	/////////////////////////////////////////////////

	public String findingCurrencyUsingCountry(String country) {
		WebElement currency = findCurrency(country);
		String text = currency.getText();
		return text;
	}

//	@Override
//	public String getDomValue(WebElement element) {
//		return super.getDomValue(element);
//	}

}
