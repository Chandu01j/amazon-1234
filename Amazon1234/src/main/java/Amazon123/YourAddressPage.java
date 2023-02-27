package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressPage {
	
	
	// Variable : WebElement :Amazon SignIn Page
	@FindBy (xpath = "//h2[text()='Add address']")
	private WebElement addnewaddress ; 

	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[1]")
	private WebElement fullName ; 

	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[2]")
	private WebElement mobileNumber ; 

	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[3]")
	private WebElement pincode ; 

	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[4]")
	private WebElement flatOrHouseNo ; 
	
	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[5]")
	private WebElement areaOrStreetOrVillage ;
	
	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[6]")
	private WebElement landmark ;
	
	@FindBy (xpath = "(//div[contains(@class,'a-input-t')]//input)[7]")
	private WebElement townOrCity ;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox ;
	
	@FindBy (xpath = "(//span[@data-action='a-dropdown-button'])[8]")
	private WebElement clickondropdown ;
	
	@FindBy (xpath = "(//div[@id='a-popover-4']//a)[2]")
	private WebElement selectdropdownvalue ;
	
	@FindBy (xpath = "(//input[@class='a-button-input'])[8]")
	private WebElement addNewAddButton ;
	
	private WebDriver driver ;
	
	// Constructor : Initialization of WebElement : Amazon SignIn Page
	
	 public YourAddressPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	 //Methods : Action on WebElement : Amazon SignIn Page
	 public void clickaddnewaddress() {
		 addnewaddress.click();
		 }
	  
	  public void sendFullName() {
		  fullName.sendKeys("pawan dhawale");
		 }
	  
	  public void sendMobileNumber() {
		  mobileNumber.sendKeys("9096286380");
		  
		 }
	  
	  public void sendPincode() {
		  pincode.sendKeys("431603");
		 }
	  
	  public void sendFlatOrHouseNo() {
		  flatOrHouseNo.sendKeys("flat no. 108 omkar nivas");
		 }
	  
	  public void sendAreaOrStreetOrVillage() {
		  areaOrStreetOrVillage.sendKeys("Hudco New Nanded");
		 }
	  
	  public void sendLandmark() {
		  landmark.sendKeys("Near hunuman madhir");
		 }
	  
	  public void sendTownOrCity() {
		  townOrCity.sendKeys("Nanded");
		 }
	  
	  public void clickonCheckbox() {
		  checkbox.click();
		 }
	  
	  public void clickonclickondropdown() {
		  clickondropdown.click();
		 }
	  
	  public void clickonselectdropdownvalue() {
		Actions act = new Actions(driver);
		act.moveToElement(selectdropdownvalue).click().build().perform();
		 }
	  public void clickonAddAddButton() {
		  addNewAddButton.click();
		 }

}
