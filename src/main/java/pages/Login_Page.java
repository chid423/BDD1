package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import utility.BaseUtil;

public class Login_Page extends BaseUtil {

	
	private BaseUtil base;
	public Login_Page(BaseUtil base) {
	this.base = base;}
	
	
	/**@FindBy (id = "user-name")
	WebElement usernameField ;
	
	@FindBy(id= "password")
	WebElement passwordField;
	
	@FindBy(id ="login-button")
	WebElement loginButtonField;
	
	public void EnterUsername(String username)
	{
		usernameField.sendKeys("");}
	
	
		
		
		
		public void EnterPassword(String password) {
		passwordField.sendKeys("");}
		
		public void ClickOnTheLoginButton()
		{		loginButtonField.click();
		
		*/
	
	
	
	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");
	
	
	
	
	public void enterUsername(String username) 
	{
		base.driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		
		base.driver.findElement(passwordField).sendKeys(password);
	}
	
	
	public void clickLoginButton()
	{
		base.driver.findElement(loginButton).click();
	}

	
	
	{
	}
  public void logingInToWebsite(String username,String password) {
	  base.driver.findElement(usernameField).sendKeys(username);
	  base.driver.findElement(passwordField).sendKeys(password);
	  base.driver.findElement(loginButton).click();
  }
	
	}	
	
	
	


