package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_pages2 {

	
	public WebDriver ldriver;
	
	
	public Login_pages2(WebDriver rdriver) {
		
	ldriver=rdriver;
		PageFactory. initElements(rdriver,this);	
		
	}

@FindBy(id = "Email")
@CacheLookup
WebElement emailTextBox;
	

@FindBy(id="Password")
@CacheLookup
WebElement passwordTextBox;


@FindBy(how = How.XPATH,using ="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button" )	
@CacheLookup
WebElement loginButton;
	
	

	
	
	
public void setEmail(String email)
{ 
	emailTextBox.clear();
	emailTextBox.sendKeys(email);
	
	}
	
	
public void setPassword(String password) {
	passwordTextBox.clear();
	passwordTextBox.sendKeys(password);
}	
	
	
	public void clickOnLogin() {
	
		loginButton.click();
	
	}
	
	
	
	
	@FindBy(how = How.LINK_TEXT,using = "Logout")	
	@CacheLookup
	WebElement logoutButton;
	
	public void ClickOnlogout() {
		logoutButton.click();
	}
	
	public  String getTitle() {
		return ldriver.getTitle();
	}
	
	
	
	
	
	
	
	
	
}
