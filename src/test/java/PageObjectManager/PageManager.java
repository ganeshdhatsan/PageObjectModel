package PageObjectManager;

import PageObjects_AllTypes.LoginPageType1;
import PageObjects_AllTypes.LoginPageType2;
import PageObjects_AllTypes.LoginPageType3;
import PageObjects_AllTypes.LoginPageType4;
import PageObjects_AllTypes.LoginPageType5;

public class PageManager {
	// define a page object manager class as Singleton class
	
	// rule -01 - private static variable
	private static PageManager pageManager;
	
	
	public LoginPageType1 loginPage1;
	public LoginPageType2 loginPage2;
	public LoginPageType3 loginPage3;
	public LoginPageType4 loginPage4;
	public LoginPageType5 loginPage5;
	
	// rule-02 -private constructor for current class
	private PageManager() {
		loginPage1= new LoginPageType1();
		loginPage2= new LoginPageType2();
		loginPage3= new LoginPageType3();
		loginPage4= new LoginPageType4();
		loginPage5= new LoginPageType5();
	}
	
	// rule-03-public static method 
     public static PageManager getInstance() {
		if(pageManager==null) {
			 pageManager= new PageManager();
		}
       return pageManager;
	}
	
	
}
