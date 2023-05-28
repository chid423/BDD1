package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login_pages2;

public class Web_Table {
	
	public WebDriver driver;
	

	 public Login_pages2  login2;
		 
		
	
	
	  
		@Given("User navigate to url {string}")
		public void user_navigate_to_url(String urlt) throws InterruptedException {
		    Thread.sleep(3000);
		    
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    login2 = new  Login_pages2(driver);
		    
		    
		this.driver.navigate().to(urlt);
		
		Thread.sleep(3000);
			
		}	
			
		    
		

	//	@When("User click on a button")
	//	public void user_click_on_a_button() {
	//		 login2.clickOnSliderBar();
	//	}
		
		
		@When("User click on Customers")
		public void user_click_on_customers() throws InterruptedException {
			 login2.getAllLi();
			 Thread.sleep(3000);
		}

		@When("User click on Customers role")
		public void user_click_on_customers_role() throws InterruptedException {
			 login2.getAllLi();
			 Thread.sleep(3000);
		}

		
			
		}

		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

