 package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageAmazon {
	
	

	@FindBy (xpath = "//span[text()='Account & Lists']")
	private WebElement accountAndLists ; 
	
	@FindBy (xpath = "(//a[text()='Start here.'])[1]")
	private WebElement starthere ; 
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTab ;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTab1 ; 
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTab2 ;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton ;
	
	@FindBy (xpath = "(//span[text()='Amazon Pay'])[2]")
	private WebElement amazonpayButton ;
	
	
	
	@FindBy (xpath = "//select[@id='searchDropdownBox']")
	private WebElement searchDrop ; 
	
	@FindBy (xpath = "(//div[@class='nav-left'])[3]")
	private WebElement manuButton ; 
	
	@FindBy (xpath = "(//a[text()='Best Sellers'])[2]")
	private WebElement bestSeller ;
	

	@FindBy (xpath = "(//div[contains(@id,'CardInstance')]//div)[28]")
	private WebElement bestSellerFirstProSel ;
	
	
	
	@FindBy (xpath = "(//a[text()='New Releases'])[2]")
	private WebElement newReleases ;
	
	@FindBy (xpath = "(//div[@id='anonCarousel1']//div)[7]")
	private WebElement newReleasesSecondProSel ;
	
	@FindBy (xpath = "(//a[text()='Customer Service'])[1]")
	private WebElement customerService ;
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement proAddToCart ;
	
	@FindBy (xpath = "//a[text()='Amazon miniTV']")
	private WebElement amazonMiniTVButton ;
	
	@FindBy (xpath = "(//div[contains(@class,' ThumbnailCarouse')]//img)[1]")
	private WebElement topTreadeingfirstvideoplay ;
	
	@FindBy (xpath = "//button[@type='button']")
	private WebElement videoPlayButton ;
	
	@FindBy (xpath = "(//div[@role='button']//img)[19]")
	private WebElement playButton ;
	
	@FindBy (xpath = "//a[contains(text(),'Today')]")
	private WebElement todayDeal ;
	
	@FindBy (xpath = "(//div[@aria-label='Deals grid']//div)[12]")
	private WebElement selectcategary ;
	
	@FindBy (xpath = "(//div[@data-testid='grid-deals-container']//div)[9]")
	private WebElement selectpro ;
	
	@FindBy (xpath = "(//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//span)[12]")
	private WebElement selectpro1 ;
	@FindBy (xpath = "(//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']//a)[2]")
	private WebElement selectprotoday ;
	
	
	@FindBy (xpath = "//span[text()='Your Account']")
	private WebElement yourAcc ;
	
	@FindBy (xpath = "(//div[@class='a-container']//h2)[4]")
	private WebElement yourAddress ;
	@FindBy (xpath = "(//div[@id='nav-al-your-account']//span)[13]")
	private WebElement signOut ;
	
	@FindBy (xpath = "((//div[@data-index='2'])[1]//span)[11]")
	private WebElement proselect ; 
	
	@FindBy (xpath = "(//div[@class='Tooltip_container__GylyW'])[1]")
	private WebElement amazonsymbol ; 
	
	@FindBy (xpath = "((//div[@data-index='0'])[1]//img)")
	private WebElement amazonMiniTvClick ; 
	
//	@FindBy (xpath = "//span[text()='Electricity']")
//	private WebElement electricity ;
//	

	@FindBy (xpath = "//span[text()='Trains']")
	private WebElement train ;
	


	
	
private WebDriver driver ;
	
	
	// Constructor : Initialization of WebElement : Amazon SignIn Page
	
	 public HomePageAmazon(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	 //Methods : Action on WebElement : Amazon SignIn Page
	   
	  public void clickonAccountAndLists() {
		  accountAndLists.click();
		 }
	  
	  public void clickonStarthere() {
		  starthere.click();
		  
		 }
	  
	  public void sendSearchTab(String searchT) {
		  searchTab.click();
		  searchTab.sendKeys(searchT);
		 }
	  
	  public void sendSearchTab1(String searchTa) {
		  searchTab1.click();
		  searchTab1.sendKeys(searchTa);
		 }
	  
	  public void sendSearchTab2(String searchTab) {
		  searchTab2.click();
		  searchTab2.sendKeys(searchTab);
		 }
	  
	  public void clickonSearchButton() {
		  searchButton.click();
		 }
	  
	  public void clickonAmazonpayButton() {
		  amazonpayButton.click();
		 }
	  
	  public void clickonsearchDrop() {
		  searchDrop.click();
		 }
	  
	  public void clickonBestSeller() {
		  bestSeller.click();
		 }
	  
	  public void clickonBestSellerFirstProSel() {
		  bestSellerFirstProSel.click();
		 }
	  
	  
	  
	  public void clickonmanuButton() {
		  manuButton.click();
		 }
	  
	  public void clickonNewReleases() {
		  newReleases.click();
		 }
	  
	  public void clickonNewReleasesSecondProSel() {
		  newReleasesSecondProSel.click();
		 }
	  
	  public void clickonCustomerService() {
		  customerService.click();
		 }
	  
	  public void clickonProAddToCart() {
		  proAddToCart.click();
		 }
	  public void clickonAmazonMiniTVButton() {
		  amazonMiniTVButton.click();
		 }
	  
	  public void clickonTopTreadeingfirstvideoplay() {
		  topTreadeingfirstvideoplay.click();
		 }
	  
	  public void clickonVideoPlayButton() {
		  videoPlayButton.click();
		 }
	  
	  public void clickPlayButton() {
		  playButton.click();
		 }
	  
	  public void clickonTodayDeal() {
		  Actions act = new Actions(driver);
		act.moveToElement(todayDeal).click().perform();
		 }
	  public void clickonselectcategary() {
		  selectcategary.click();
		 }
	  public void clickonselectpro() {
		  selectpro.click();
		 }
	  
	  public void clickonselectpro1() {
		  selectpro1.click();
		 }
	  
	  public void clickonSelectprotoday() {
		  selectprotoday.click();
		 }
	  public void clickonYourAcc() {
		  Actions act = new Actions(driver);
		  act.moveToElement(accountAndLists).moveToElement(yourAcc).click().build().perform();
	  }
	//  public void PointerOnCrNewAcc() {
		//  Actions act = new Actions(driver);
		//  act.moveToElement(accountAndLists).moveToElement(signOut).click().build().perform();
	//  }
	  
	  public void clickonYourAddress() {
		  yourAddress.click();
	  }
	  
      public void clickonSignOut() {
	  Actions act = new Actions(driver);
	  act.moveToElement(accountAndLists).moveToElement(signOut).click().build().perform();
	  }
      
      public void clickonProselect() {
    	  proselect.click();
	  }
      
      public void clickonAmazonsymbol() {
    	  amazonsymbol.click();
	  }
      
      public void clickonAmazonMiniTvClick() {
    	  amazonMiniTvClick.click();
	  }


}
