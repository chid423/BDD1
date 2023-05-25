package stepDefinition;


import io.cucumber.java.en.*;

import library.Constants;
import pages.Login_Page;
import utility.BaseUtil;
import static org.junit .Assert.assertEquals;

import org.openqa.selenium.By;
public class Login_Test extends BaseUtil  {
	
	private BaseUtil base;
	public Login_Test (BaseUtil base)
	{
		this.base = base;
	}
	
	// Scenario: User to be able to login with correct username and password
	
	 
		  
	@Given ("user open url")
	  public void  user_open_url() {
		base.driver.get(Constants.URL);
	}
	  
	   @ When ("user enter valid username")
	   public void user_enter_valid_username() {
		   Login_Page login = new Login_Page(base);
		   login.enterUsername(Constants.STANDARD_USER);
		   
	   }
	    
	    
	    
	    
	    
	   @ And ("user enter valid password")
	   public void user_enter_valid_password() {
		   
		   Login_Page login = new Login_Page(base);
		   login.enterPassword(Constants.PASSWORD);
		   
		   
	   }
	   
	    @Then ("user clicks on login button")
	    public void  user_clicks_on_login_button() {
	    	
	    	 Login_Page login = new Login_Page(base);
	    	login.clickLoginButton();
	    }
	    
	    
	   @ And ("user see homepage")
	   public void user_see_homepage() {
		   Login_Page login = new Login_Page(base);
		   String actualURL = base.driver.getCurrentUrl();
		   String expectedURL = Constants.HomePage_URL;
			assertEquals(expectedURL, actualURL);	   
	   }

	
	   @Given ("user logs in as locked user")
	   public void   user_logs_in_as_locked_user()
	   {base.driver.get(Constants.URL);
		   Login_Page login = new Login_Page(base);
		  login.enterUsername(Constants.LOCKED_OUT_USER);
		  login.enterPassword(Constants.PASSWORD);
	   }
		
	   
	  @ Given ("user logs in as a problem user")  
		public void  user_logs_in_as_a_problem_user() {
		  base.driver.get(Constants.URL);
		  Login_Page login = new Login_Page(base);
		  login.enterUsername(Constants.PROBLEM_USER);
		  login.enterPassword(Constants.PASSWORD);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  @Given ("user is on product page")
		
		public void   user_is_on_product_page()
		{
			base.driver.get(Constants.URL);
		
		}
		
		
	       @When ("user select product")
	       public void  user_select_product	()       
		   
		   { Login_Page login = new Login_Page(base);
			   //Login_Page login = new Login_Page(base);
			   
			   //login.enterUsername(Constants.STANDARD_USER);
			  // login.enterPassword(Constants.PASSWORD);
			   
			  // login.ClickSauceLabsBackpack();
			base.  driver.get(Constants.HomePage_URL);
			  
			 
			  
			 	  
			  
	           String text =		  base.driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
				
			System.out.println(text);   
				
		  
			//a[@id = 'item_4_title_link']/div"
		   
		   /**@Then ("user see item page ")
		   public void user_see_item_page()
		   {
			   Login_Page login = new Login_Page(base);
			   
			   String actualURL = base.driver.getCurrentUrl();
			   String expectedURL = Constants.HomePage_URL;
			 assertEquals(actualURL, expectedURL);
		   }
		   
		   */
		
		
	

		   }
}
	 