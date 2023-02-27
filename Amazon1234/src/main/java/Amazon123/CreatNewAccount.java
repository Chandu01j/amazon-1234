package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewAccount {
	

	// Variable : WebElement :Amazon Sign In
	
	
			@FindBy (xpath = "//input[@id='ap_customer_name']")
			private WebElement yourName ; 

			@FindBy (xpath = "//input[@id='ap_phone_number']")
			private WebElement mobileNo ; 

			@FindBy (xpath = "//input[@id='ap_password']")
			private WebElement password ; 
			
			@FindBy (xpath = "//input[@id='continue']")
			private WebElement submit ;
			
			// Constructor : Initialization of WebElement : Amazon Sign In
			
			 public CreatNewAccount(WebDriver driver) {
				 PageFactory.initElements(driver, this);
			 }
	
			 //Methods : Action on WebElement : Amazon Sign In
			 
			  public void sendYourName() {
				  yourName.click();
				  yourName.sendKeys("Rudu Patil");
				 }
			  
			  public void sendMobileNo() {
				  mobileNo.click();
				  mobileNo.sendKeys("8378833734");
				 }
			  
			  public void sendPassword() {
				  password.click();
				  password.sendKeys("Rudu@123");
				 }
			  
			  public void clickonSubmit() {
				  submit.click();
				 }
			  

}
	
	
	
	
	
	


