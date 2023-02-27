package testNgTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;
import Amazon123.ProductAddToCart;
import Amazon123.ProductBuyNow;
import Amazon123.ShopingCartPage;
import browser.BrowserSetUp;

public class TestNgClass3 extends BrowserSetUp {
	
	WebDriver driver ;
	
	HomePageAmazon homePageAmazon ;
	AmazonSignInPage amazonSignInPage ;
	 ProductAddToCart productAddToCart ;
	 ShopingCartPage shopingCartPage ;
	
	@Parameters ("browser")
	@BeforeTest
	public void LauchBrowser(String browserName) {
		
		if(browserName.equals("Chrome"))
		{
			driver = openChromeBrowser();	
		}
		
		if(browserName.equals("Edge"))
		{
			 driver = openEdgeBrowser();
		}
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void ctreatePOMObjects() {
		homePageAmazon = new HomePageAmazon(driver);
		amazonSignInPage = new AmazonSignInPage(driver);
		productAddToCart = new ProductAddToCart(driver);
		shopingCartPage = new ShopingCartPage(driver);
		
	}
	
	@BeforeMethod
	public void goToHomePage()
	{
		driver.get("https://www.amazon.in/");
		
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);   
		homePageAmazon.clickonAccountAndLists();
		
	//	AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driver);
		
	//	amazonSignInPage.login();
		amazonSignInPage.sendemailAndPhoneNo("chandrakantbharsawde04@gmail.com");
		amazonSignInPage.clickonNextButton();
		amazonSignInPage.sendpassword("Chandu@123");
		amazonSignInPage.clickonSignInButton();
		
		
		homePageAmazon.clickonmanuButton();
		
	}
	
	@Test (priority = 2)
	public void VerifyBestSellerFirstProAddToCart() throws InterruptedException
	{
		//HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
		homePageAmazon.clickonBestSeller();
		homePageAmazon.clickonBestSellerFirstProSel();
		Thread.sleep(3000);
		
	//    ProductAddToCart productAddToCart = new ProductAddToCart(driver);
	    
	    productAddToCart.clickonAddToCart();
	//    productAddToCart.clickonCart();
	 //   ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		Thread.sleep(2000);
	//	ArrayList<String> addr1 = new ArrayList<String> (driver.getWindowHandles());
	//	driver.switchTo().window(addr1.get(1));//switch to child browser

		try {
			 productAddToCart.clickonCart();
			}
			catch (NoSuchElementException f) {
				shopingCartPage.clickonGoToCart();
			}	
	}
	
	@Test (priority = 1)
	public void VerifyNewReleseSecondProAddToCart() throws InterruptedException
	
	{
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
		homePageAmazon.clickonNewReleases();
		homePageAmazon.clickonNewReleasesSecondProSel();
		Thread.sleep(3000);
	//	homePageAmazon.clickonProAddToCart();
		
	//	 ProductAddToCart productAddToCart = new ProductAddToCart(driver);
		 productAddToCart.clickonAddToCart();
	//	 productAddToCart.clickonCart();
	//	 ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		Thread.sleep(2000);
	//	ArrayList<String> addr1 = new ArrayList<String> (driver.getWindowHandles());
	//	driver.switchTo().window(addr1.get(1));//switch to child browser

	//	shopingCartPage.clickonGoToCart();
		try {
		 productAddToCart.clickonCart();
		}
		catch (NoSuchElementException f) {
			shopingCartPage.clickonGoToCart();
		}
	}
	
	@AfterMethod
	public void LogOutPage() {
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);   
	
		homePageAmazon.clickonSignOut();
			
	}
	@AfterClass
	public void clearPOMObjects() {
		homePageAmazon = null ;
		productAddToCart = null ;
		shopingCartPage = null ;
		amazonSignInPage = null ;
	}
	
	@AfterTest 
	public void closedbrowser() {
		driver.quit();
		driver = null ;
		
		System.gc();
	}
	
	

}
