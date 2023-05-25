package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.Login_pages2;
import pages.Logout_Page;

public class Long_Test2 {

	public WebDriver driver;
	public Login_pages2  login2;
	public Logout_Page logout;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager .chromedriver().setup();
	    driver = new ChromeDriver();
	    login2 = new Login_pages2(driver);
	    logout = new Logout_Page(driver);
	}

	@When("User open Url{string}")
	public void user_open(String Url) {
	    driver.get(Url);
	}

	@When("^User enter email and password$")
	public void user_enter_email_and_password(DataTable dataTable) {
	 List<List<String>> values =dataTable.cells();
	  String e =values.get(0).get(0);
	  String t = values.get(0).get(1);
	  login2.setEmail(e);
	  login2.setPassword(t);
	}

	@And ("User click on login")
	public void User_click_on_login() {
	login2.clickOnLogin();
	
}
	
	
	
	@Then("Page Title should be {string}")
	public void Page_title_should_be(String title) {
	  if(driver.getPageSource().contains("Login was unsuccessful")) {
		  driver.close();
		  Assert.assertTrue(false);
	  }
	  
	  else {
		  Assert.assertEquals(title,driver.getTitle());
	  
	  }
	}

	
	
	
	
	
	
	
		
		
		
	
	

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	  
		 login2 .ClickOnlogout();
		Thread.sleep(3000);}
	
	
	
	
	
	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	   if(driver.getPageSource().contains("Dashboard"))
	   {
		   Assert.assertTrue(true);
	   }
	   
	   else {
		   Assert.assertTrue(false);
	   }
	}
	
	
	
	
	
	
	
	
	
	
	

	@Then("close browser")
	public void close_browser() {
	   
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
