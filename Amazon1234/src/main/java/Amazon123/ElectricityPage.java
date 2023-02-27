package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ElectricityPage {

	@FindBy (xpath = "//span[text()='Electricity']")
	private WebElement electricity ;
	
	
	@FindBy (xpath = "//select[@id='ELECTRICITY']")
	private WebElement stateElectricity ;
	
	
	@FindBy (xpath = "//select[@id='ELECTRICITY>hfc-states-maharashtra']")
	private WebElement electricityBoard ;
	
	@FindBy (xpath = "//input[@id='Consumer No']")
	private WebElement consumerNo ;
	
	
	@FindBy (xpath = "//input[@id='BU']")
	private WebElement billingUnit ;
	
	@FindBy (xpath = "//button[@id='fetchBillActionId-announce']")
	private WebElement fetchBillButton ;
	
	@FindBy (xpath = "//button[@id='paymentBtnId-announce']")
	private WebElement paymentIdButton ;
	

	@FindBy (xpath = "(//div[@id='nav-al-your-account']//span)[13]")
	private WebElement signOut ;
	
	
	private WebDriver driver ;
	// Constructor : Initialization of WebElement : Amazon SignIn Page
	
		 public ElectricityPage(WebDriver driver) {
			 PageFactory.initElements(driver, this);
			 this.driver = driver;
		 }
		 
		 
		 
		  public void clickonstateElectricity() {
			  Select s = new Select(stateElectricity);
			  s.selectByVisibleText("Maharashtra");
		  }
		  
		  public void clickonelectricityBoard() {
			  Select s = new Select(electricityBoard);
			  s.selectByVisibleText("Maharashtra State Electricity Distribution Company Ltd ( MSEDCL)/ Mahavitran");
		  }
		  

		  public void sendConsumerNo() {
			  consumerNo.sendKeys("550010420245");
			 }
		  
		  public void sendBillingUnit() {
			  billingUnit.sendKeys("4724");
			 }
		  public void clickFetchBillButton() {
			  fetchBillButton.click();
			 }
		  
		  public void clickPaymentIdButton() {
			  paymentIdButton.click();
			 }
		  
		  public void clickonElectricity() {
			  electricity.click();
		  }
		  
		  public void clickonSignOut() {
			  signOut.click();
		  }

		  
	

}
