package testNgTest;

import java.sql.Driver;
import java.util.ArrayList;
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
import Amazon123.ElectricityPage;
import Amazon123.HomePageAmazon;
import Amazon123.MobileRechargeAm;
import Amazon123.ProductAddToCart;
import Amazon123.ProductBuyNow;
import Amazon123.ShopingCartPage;
import Amazon123.TrainTicketPage;
import browser.BrowserSetUp;

public class TestNgClass1 extends BrowserSetUp {
	
   WebDriver driver ;
	
	HomePageAmazon homePageAmazon ;
	AmazonSignInPage amazonSignInPage ;
	MobileRechargeAm mobileRechargeAm ;
	ElectricityPage electricityPage ;
	TrainTicketPage trainTicketPage ;
	
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
		mobileRechargeAm = new MobileRechargeAm(driver);
		electricityPage = new ElectricityPage(driver);
		trainTicketPage = new TrainTicketPage(driver);
		
		
	}
	@BeforeMethod
	public void goToHomePage()
	{
		driver.get("https://www.amazon.in/");
		
	//	HomePageAmazon homePageAmazon = new HomePageAmazon(driver);   
		homePageAmazon.clickonAccountAndLists();
		
	//	AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driver);
		amazonSignInPage.sendemailAndPhoneNo("chandrakantbharsawde04@gmail.com");
		amazonSignInPage.clickonNextButton();
		amazonSignInPage.sendpassword("Chandu@123");
		amazonSignInPage.clickonSignInButton();
		
		homePageAmazon.sendSearchTab1("amazon pay");
		homePageAmazon.clickonSearchButton();
		homePageAmazon.clickonAmazonpayButton();
		
	}
	
	@Test
	public void VerifyMobileRechagre() throws InterruptedException
	{
	//	MobileRechargeAm mobileRechargeAm = new MobileRechargeAm(driver);
		mobileRechargeAm.clickonMobilerecharge();
		mobileRechargeAm.sendmobileNumber();
		mobileRechargeAm.clickonEdit();
		Thread.sleep(3000);
		mobileRechargeAm.clickonAirtel();
		Thread.sleep(2000);
		mobileRechargeAm.clickonCircle();
		Thread.sleep(2000);
		mobileRechargeAm.sendAmounttext();
	
	}
	
	@Test
	public void VerifyElectricityBill() throws InterruptedException
	
	{
	
	//	ElectricityPage electricityPage = new ElectricityPage(driver);
		electricityPage.clickonElectricity();
		Thread.sleep(3000);
		electricityPage.clickonstateElectricity();
		Thread.sleep(3000);
		electricityPage.clickonelectricityBoard();
		electricityPage.sendConsumerNo();
		electricityPage.sendBillingUnit();
		electricityPage.clickFetchBillButton();
		Thread.sleep(3000);
	//	electricityPage.clickPaymentIdButton();
	}
	
	@Test
	public void VerifyTrainTicket() throws InterruptedException {
	//	TrainTicketPage trainTicketPage = new TrainTicketPage(driver);
		trainTicketPage.clickonTrain();
		trainTicketPage.clickonSource();
		trainTicketPage.sendSourceCity();
		trainTicketPage.clickonDestination();
		trainTicketPage.sendDestinationCity();
		Thread.sleep(2000);
	//	trainTicketPage.clickonCheckbox();
		trainTicketPage.clickonSarchTrain();
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
			mobileRechargeAm = null ;
			electricityPage = null ;
			trainTicketPage = null ;
		}
		
		@AfterTest 
		public void closedbrowser() {
			driver.quit();
			driver = null ;
			
			System.gc();
		}
	
	

}
