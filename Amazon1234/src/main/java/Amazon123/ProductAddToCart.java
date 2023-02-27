package Amazon123;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAddToCart {
	
	
	
	// Variable : WebElement :Add To Cart
	
		   @FindBy (xpath = "(//div[@data-asin='B0BMGC6LHP']//span)[11]")
			private WebElement product ; 

				@FindBy (xpath = "//input[@id='add-to-cart-button']")
				private WebElement addToCart ;
				
				@FindBy (xpath = "//span[@id='attach-sidesheet-view-cart-button']")
				private WebElement cart ; 


				// Constructor : Initialization of WebElement : Add  To Cart
				
				 public ProductAddToCart(WebDriver driver) {
					 PageFactory.initElements(driver, this);
				 }
				 
				 //Methods : Action on WebElement : Add To Cart
				 
				
				  
				  public void clickonProduct() {
					  product.click();
					 
					 }
				
				  
		         public void clickonAddToCart() {
		        	 addToCart.click();
					 }
		         
		         public void clickonCart() {
		        	  cart.click();
					 }

	}


