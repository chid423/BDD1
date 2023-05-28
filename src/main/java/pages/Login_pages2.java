package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login_pages2 {

	
public WebDriver driver;
	
	public Login_pages2(WebDriver rdriver) {
		
	driver=rdriver;
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



@FindBy(how = How.LINK_TEXT,using = "Logout")	
@CacheLookup
WebElement logoutButton;



	






	
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
	
	
	
	
	
	
	public void ClickOnlogout() {
		logoutButton.click();
	}
	
	public  String getTitle() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	public String gettitlet() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@FindBy(id = "nopSideBarPusher")
	//@CacheLookup
	//WebElement slideBarPush;

	
	
	/*@FindBy(how=How.PARTIAL_LINK_TEXT,using ="Customers")
	@CacheLookup
	WebElement selectcustomers;

	@FindBy(how=How.PARTIAL_LINK_TEXT,using= " Customer roles")
	@CacheLookup
	WebElement customerRole;
*/
	

	
	By allLi=By.className("nav-item has-treeview");
	
	
	
	//@FindBy(how=How.CLASS_NAME ,using = "nav-item has-treeview")
	//@CacheLookup
	//WebElement selectcustomers;

	
	
	@FindBy(xpath = "//*[@id=\"customerroles-grid\"]/tbody/tr")
	@CacheLookup
	List<WebElement> tableRow;

	@FindBy(xpath = "//*[@id=\"customerroles-grid\"]/tbody/tr/td")
	@CacheLookup
	List<WebElement> tableColumn;

	//public void clickOnSliderBar() {
	//    slideBarPush.click();
	//}

	/*public void selectCustomersRoleFromCustomers() {
	    Select select = new Select(selectcustomers);
	    select.selectByVisibleText("Customer roles");
	}

	public void clickOnCustomersRole() {
	    customerRole.click();
	}
*/
	//public void getNoOfLi() {
	
	//	selectcustomers.getSize();
	//}
	

	public void getAllLi() {
		
	System.out.println(	driver.findElements(allLi).size());
	}
	
	
	
	
	
	
	
	public int getNoOfRows() {
	    return tableRow.size();
	}

	public int getNoOfColumns() {
	    return tableColumn.size();
	}

	public void processTableData() {
	    for (int i = 1; i <= getNoOfRows(); i++) {
	        for (int j = 1; j <= getNoOfColumns(); j++) {
	            System.out.print (driver.findElement(By.xpath("//*[@id=\"customerroles-grid\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()+(""));
	            // Process the table data as needed
	        }
	        System.out.println("");
	    }
	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
