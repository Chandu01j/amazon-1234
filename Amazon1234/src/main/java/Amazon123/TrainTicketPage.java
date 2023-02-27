package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TrainTicketPage {
	
	@FindBy (xpath = "(//div[@class='desktopWrapper b2887d59']//span)[2]")
	private WebElement source ;
	
	
	@FindBy (xpath = "(//div[@class='_32608d65'])[1]")
	private WebElement sourceCity ;
	
	@FindBy (xpath = "(//div[@class='desktopWrapper b2887d59']//span)[4]")
	private WebElement destination ;
	
	
	@FindBy (xpath = "(//div[@class='_32608d65'])[1]")
	private WebElement destinationCity ;
	
	@FindBy (xpath = "(//div[@class='desktopWrapper b2887d59']//span)[5]")
	private WebElement date ;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox ;
	@FindBy (xpath = "//div[@id='tr-lp-search']")
	private WebElement sarchTrain ;
	
	@FindBy (xpath = "//span[text()='Trains']")
	private WebElement train ;
	
	
	
	private WebDriver driver ;
	// Constructor : Initialization of WebElement : Amazon SignIn Page
	
		 public TrainTicketPage(WebDriver driver) {
			 PageFactory.initElements(driver, this);
			 this.driver = driver;
		 }
		 
		 
		 
		  public void clickonSource() {
			  source.click();
		  }
		  
		  public void sendSourceCity() {
			  sourceCity.click();
			  
		  }
		  

		  public void clickonDestination() {
			  destination.click();
			 }
		  
		  public void sendDestinationCity() {
			  destinationCity.click();
			 }
		  public void clickondate() {
			  date.click();
			 }
		  
		  public void clickonCheckbox() {
			  checkbox.click();
			 }
		  public void clickonSarchTrain() {
			  sarchTrain.click();
			 }
		  
		  public void clickonTrain() {
			  train.click();
			 }
		  
	
	
	
	
	
	
	

}
