package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;
import Amazon123.TrainTicketPage;

public class TestTrainTicket {
	
	
	
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
		
				
				TrainTicketPage trainTicketPage = new TrainTicketPage(driverTest);
				trainTicketPage.clickonTrain();
				trainTicketPage.clickonSource();
				trainTicketPage.sendSourceCity();
				trainTicketPage.clickonDestination();
				trainTicketPage.sendDestinationCity();
				Thread.sleep(2000);
			//	trainTicketPage.clickonCheckbox();
				trainTicketPage.clickonSarchTrain();
			//	homePageAmazon.clickonAccountAndLists();
				homePageAmazon.clickonSignOut();

	}
}
