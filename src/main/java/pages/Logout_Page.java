package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	
	WebDriver ldriver ;
	
	public Logout_Page (WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
	}

	
	
	
	
	
	
	
}
