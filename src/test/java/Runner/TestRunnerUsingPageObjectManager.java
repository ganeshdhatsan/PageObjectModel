package Runner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectManager.PageManager;
import PageObjects_AllTypes.LoginPageType1;
import PageObjects_AllTypes.LoginPageType2;
import PageObjects_AllTypes.LoginPageType3;
import PageObjects_AllTypes.LoginPageType4;
import PageObjects_AllTypes.LoginPageType5;
import Utilities.TestUtilities;

public class TestRunnerUsingPageObjectManager extends TestUtilities{
	@Test
	private void validateLoginType1() throws InterruptedException {
		browserLaunch();
		launchUrl("https://www.facebook.com/");
	    implicitWait();
	    PageManager.getInstance().loginPage1.performLogin("selenium", "j");
	}
	
	@Test
	private void validateLoginType2() throws InterruptedException {
		browserLaunch();
		launchUrl("https://www.facebook.com/");
	    implicitWait();
	    PageManager.getInstance().loginPage2.performLogin("java", "selenium");
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
