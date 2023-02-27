package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage {
	
	// Variable : WebElement :Amazon SignIn Page
	
				@FindBy (xpath = "//input[@id='ap_email']")
				private WebElement emailAndPhoneNo ; 

				@FindBy (xpath = "//input[@id='continue']")
				private WebElement nextButton ; 

				@FindBy (xpath = "//input[@id='ap_password']")
				private WebElement password ; 

				@FindBy (xpath = "//input[@id='signInSubmit']")
				private WebElement signInButton ; 
				
				@FindBy (xpath = "//a[@id='createAccountSubmit']")
				private WebElement creatNewAccountButton ;
				
				// Constructor : Initialization of WebElement : Amazon SignIn Page
				
				 public AmazonSignInPage(WebDriver driver) {
					 PageFactory.initElements(driver, this);
				 }
				 
				 //Methods : Action on WebElement : Amazon SignIn Page
				   
				  public void sendemailAndPhoneNo(String emailid) {
					
					  emailAndPhoneNo.sendKeys(emailid);
					 }
				  
				  public void clickonNextButton() {
					  nextButton.click();
					 }
				  
				  public void sendpassword(String pass) {
					
					  password.sendKeys(pass);
					 }
				  
				  public void clickonSignInButton() {
					  signInButton.click();
					 }
				  
				  public void clickonCreatNewAccountButton() {
					  creatNewAccountButton.click();
					 }
				  
				  public void login() {
					  emailAndPhoneNo.sendKeys("chandrakantbharsawde04@gmail.com");
					  nextButton.click();
					  password.sendKeys("Chandu@123");
					  signInButton.click();
				  }
				  
				  

}
