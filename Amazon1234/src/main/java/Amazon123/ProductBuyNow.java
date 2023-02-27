package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductBuyNow {
	
	// Variable : WebElement :Add To Cart
	
	

//	@FindBy (xpath = "(//div[@data-asin='B09QS9X16F']//span)[11]")
//	private WebElement product ; 

	@FindBy (xpath = "//input[@id='buy-now-button']")
	private WebElement buyNowButton ; 

	// Constructor : Initialization of WebElement : Add  To Cart
	
	 public ProductBuyNow(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 //Methods : Action on WebElement : Add To Cart
	 
	
	  
	//  public void clickonProduct() {
	//	  product.click();
	//	 }

	  public void clickonBuyNowButton() {
		  buyNowButton.click();
			 }


}
