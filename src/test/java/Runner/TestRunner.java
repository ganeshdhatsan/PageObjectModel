package Runner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects_AllTypes.LoginPageType1;
import PageObjects_AllTypes.LoginPageType2;
import PageObjects_AllTypes.LoginPageType3;
import PageObjects_AllTypes.LoginPageType4;
import PageObjects_AllTypes.LoginPageType5;
import Utilities.TestUtilities;

public class TestRunner extends TestUtilities{

	LoginPageType1 loginPage1 = new LoginPageType1();
	LoginPageType2 loginPage2 = new LoginPageType2();
	LoginPageType3 loginPage3 = new LoginPageType3();
	LoginPageType4 loginPage4 = new LoginPageType4();
	LoginPageType5 loginPage5 = new LoginPageType5();
	@Test
	private void validateLoginType1() throws InterruptedException {
		
		browserLaunch();
		launchUrl("https://www.facebook.com/");
	    implicitWait();
		loginPage1.performLogin("java", "selenium");
	}
	
	@Test
	private void validateLoginType2() throws InterruptedException {
		browserLaunch();
		launchUrl("https://www.facebook.com/");
	    implicitWait();
		loginPage2.performLogin("java", "selenium");
	}
	
	@Test
	private void validateCurrencyType3() throws InterruptedException {
		browserLaunch();
		launchUrl("https://cosmocode.io/automation-practice-webtable/");
	    implicitWait();
		String currencyUsingCountry = loginPage3.findingCurrencyUsingCountry("Angola");
		Assert.assertEquals(currencyUsingCountry, "Kwanza");
	}
	
	@Test
	private void validateLoginType4() throws InterruptedException {
		browserLaunch();
		launchUrl("https://www.facebook.com/");
	    implicitWait();
	    loginPage4.userName("java")
	    .passWord("selenium")
	    .loginButton();
	}
	
	@Test
	private void validateLoginType5() throws InterruptedException {
		browserLaunch();
		launchUrl("https://www.facebook.com/");
	    implicitWait();
//	    loginPage5.performLogin("java", "selenium");
	    loginPage5.performLogin1("java", "selenium");
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
