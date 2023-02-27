package Amazon123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPage {
	
	
	// Variable : WebElement :Add To Cart
	@FindBy (xpath = "//div[@id='sw-atc-buy-box']//a")
	private WebElement goToCart ; 
	
	@FindBy (xpath = "(//span[@class='a-button-inner'])[5]")
	private WebElement proceedsToBuy ;
	
	
	// Constructor : Initialization of WebElement : Amazon SignIn Page
	
		 public ShopingCartPage(WebDriver driver) {
			 PageFactory.initElements(driver, this);
		 }
		 
		 //Methods : Action on WebElement : Add To Cart
		 
			  public void clickonGoToCart() {
				  goToCart.click();
				 }

			  public void clickonProceedsToBuy() {
				  proceedsToBuy.click();
					 }

}
