package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.ElectricityPage;
import Amazon123.HomePageAmazon;

public class TestElectricityBillPay {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
				WebDriver driverTest = new ChromeDriver();
				driverTest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driverTest.manage().window().maximize();
				
				driverTest.get("https://www.amazon.in/");
				
				HomePageAmazon homePageAmazon = new HomePageAmazon(driverTest);   
				homePageAmazon.clickonAccountAndLists();
				
				AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driverTest);
				amazonSignInPage.login();
				
				
				homePageAmazon.sendSearchTab1("amazon pay");
				homePageAmazon.clickonSearchButton();
				homePageAmazon.clickonAmazonpayButton();
			//	homePageAmazon.clickonElectricity();
				
				ElectricityPage electricityPage = new ElectricityPage(driverTest);
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
				
		//		homePageAmazon.clickonAccountAndLists();
				homePageAmazon.clickonSignOut();

}
}