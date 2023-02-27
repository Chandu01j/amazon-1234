package testNgTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Amazon123.AmazonSignInPage;
import Amazon123.ElectricityPage;
import Amazon123.HomePageAmazon;
import Amazon123.MobileRechargeAm;
import Amazon123.ProductAddToCart;
import Amazon123.ProductBuyNow;
import Amazon123.ShopingCartPage;
import Amazon123.TrainTicketPage;
import browser.BrowserSetUp;

public class TestNgClass2 extends BrowserSetUp {
	
	     WebDriver driver ;
		
		 HomePageAmazon homePageAmazon ;
		 AmazonSignInPage amazonSignInPage ;
		 ProductAddToCart productAddToCart ;
		 ProductBuyNow productBuyNow ;
		
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
			productBuyNow = new ProductBuyNow(driver);
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
		
		
		
	}
	
	@Test (priority = 1)
	public void VerifyAddToCart() throws InterruptedException
	{
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
		
		homePageAmazon.sendSearchTab("mobile");
		homePageAmazon.clickonSearchButton();
		Thread.sleep(2000);
//		String acturl =driver.getCurrentUrl();
//		String exurl = "https://www.amazon.in/s?k=mobile&crid=3KRVZER3A4RZZ&sprefix=mobile%2Caps%2C366&ref=nb_sb_noss_2";
//		Assert.assertEquals(acturl, exurl , "Verify the URL");
//		
		String acttitle =driver.getTitle();
		String exurltitle = "Amazon.in : mobile";
		Assert.assertEquals(acttitle, exurltitle , "Verify the Title");
		homePageAmazon.clickonProselect();
		
		
		
		
	//    ProductAddToCart productAddToCart = new ProductAddToCart(driver);
	    Thread.sleep(3000);
	    ArrayList<String> addr1 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(addr1.get(1));//switch to child browser
	 //   ShopingCartPage shopingCartPage = new ShopingCartPage(driver);
		productAddToCart.clickonAddToCart();
		
		productAddToCart.clickonCart();
		
		
	}
	
	@Test  (priority = 2)
	public void VerifyBuyNow() throws InterruptedException
	
	{
	
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driverTest);
		
		homePageAmazon.sendSearchTab("mobile");
		homePageAmazon.clickonSearchButton();
		Thread.sleep(2000);
//		String acturl =driver.getCurrentUrl();
//		String exurl = "https://www.amazon.in/s?k=mobile&crid=3KRVZER3A4RZZ&sprefix=mobile%2Caps%2C366&ref=nb_sb_noss_2";
//		Assert.assertEquals(acturl, exurl , "Verify the URL");
//		
//		String acttitle =driver.getTitle();
//		String exurltitle = "Amazon in : mobile";
//		Assert.assertEquals(acttitle, exurltitle , "Verify the Title");
//		
		

		
	//	homePageAmazon.clickonProselect();
//		ArrayList<String> addr1 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(addr1.get(1));//switch to child browser
//		
//		String acttitle1 =driver.getTitle();
//		String exurltitle1 = "";
//		Assert.assertEquals(acttitle1, exurltitle1 , "Verify the Title");
//		
		
	
		
	//	productBuyNow.clickonBuyNowButton();
		
	}
	
	@AfterMethod
	public void LogOutPage() {
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);   
	
		homePageAmazon.clickonSignOut();
		
		
		
	}
	
	@AfterClass
	public void clearPOMObjects() {
		homePageAmazon = null ;	
		amazonSignInPage = null ;
		productAddToCart = null ;
		productBuyNow = null ;
	}
	
	@AfterTest 
	public void closedbrowser() {
		driver.quit();
		driver = null ;
		
		System.gc();
	}
	
	

}
