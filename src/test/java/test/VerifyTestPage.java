package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import util.BrowserFactory;
import variousConcepts.VerifyPage;


public class VerifyTestPage {
	
	WebDriver driver;
	@Test
	public void validateCheckBox() {
		driver = BrowserFactory.init();
		//driver = BrowserFactory.tearDown();
		 
		VerifyPage verifyPage = PageFactory.initElements(driver, VerifyPage.class);
		verifyPage.clickCheckBox();
		verifyPage.RemoveButton();
		verifyPage.ComboKeys();
		
	}

}
