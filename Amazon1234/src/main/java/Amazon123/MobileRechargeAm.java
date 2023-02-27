package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileRechargeAm {
	
	
	// Variable : WebElement :Add To Cart
	
	
//	@FindBy (xpath = "(//span[text()='Amazon Pay'])[2]")
//	private WebElement amazonpay ; 

	@FindBy (xpath = "//span[text()='Mobile Recharge']")
	private WebElement mobilerecharge ;
	
	@FindBy (xpath = "//input[@id='mobileNumberTextInputId']")
	private WebElement mobileNumber ;
	
	@FindBy (xpath = "//a[@id='operatorCircleLink']")
	private WebElement edit ;
	
	@FindBy (xpath = "//span[text()='Airtel']")
	private WebElement airtel ;
	
	@FindBy (xpath = "//span[text()='Maharashtra & Goa']")
	private WebElement circle ;
	
	@FindBy (xpath = "//a[@id='viewPlanTriggerId']")
	private WebElement viewPlan ;
	
	@FindBy (xpath = "//input[@id='amountTextInputId']")
	private WebElement amounttext ;
	
	
	@FindBy (xpath = "(//input[@name='choosePlanButton'])[1]")
	private WebElement choosePlanButton ;
	
	@FindBy (xpath = "//span[@id='payButtonText']")
	private WebElement payButton ;
	
	

	// Constructor : Initialization of WebElement : Add  To Cart
	
	 public MobileRechargeAm(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods : Action on WebElement : Add To Cart
	 
	 
	  
	//  public void clickonAmazonpay() {
	//	  amazonpay.click();
	//	 }
	
	  
     public void clickonMobilerecharge() {
    	 mobilerecharge.click();
		 }
     
     public void sendmobileNumber() {
    	 mobileNumber.click();
    	 mobileNumber.sendKeys("9404743373");
		 }
     
     public void clickonEdit() {
    	 edit.click();
		 }
     
     public void clickonAirtel() {
    	 airtel.click();
		 }
     public void clickonCircle() {
    	 circle.click();
		 }
     
     public void sendAmounttext() {
    	 amounttext.click();
    	 amounttext.sendKeys("10");
     }
		
     public void clickonViewPlan() {
    	 viewPlan.click();
		 }
     public void clickonChoosePlanButton() {
    	 choosePlanButton.click();
		 }
     
     public void clickonPayButton() {
    	 payButton.click();
		 }
    



}
