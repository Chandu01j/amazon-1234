package testNgTest;

import java.util.concurrent.TimeUnit;

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
import Amazon123.ShopingCartPage;
import browser.BrowserSetUp;

public class TestNgclass4 extends BrowserSetUp {
	
	
	WebDriver driver ;
	HomePageAmazon homePageAmazon ;
	AmazonSignInPage amazonSignInPage ;
	
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

	@Test  (priority = 1)
	public void VerifyAmazonMiniTvTopVideoPlay() throws InterruptedException
	
	{
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
	//	homePageAmazon.clickonAmazonMiniTVButton();
		homePageAmazon.sendSearchTab2("amazonminiTv");
		
		homePageAmazon.clickonSearchButton();
		homePageAmazon.clickonAmazonMiniTvClick();
		homePageAmazon.clickonTopTreadeingfirstvideoplay();
		homePageAmazon.clickonVideoPlayButton();
		Thread.sleep(5000);
		homePageAmazon.clickPlayButton();
		driver.navigate().back();
		homePageAmazon.clickonAmazonsymbol();
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
	}
	
	@AfterTest 
	public void closedbrowser() {
		driver.quit();
		driver = null ;
		
		System.gc();
	}
	
	

}
