package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;
import Amazon123.YourAddressPage;

public class TestAddNewAddress {
	
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.amazon.in/");
		
		HomePageAmazon homePageAmazon = new HomePageAmazon(driverTest);
		homePageAmazon.clickonAccountAndLists();
		//homePageAmazon.clickonYourAcc();
		
		
		AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driverTest);
		amazonSignInPage.login();
		
		homePageAmazon.clickonYourAcc();
		homePageAmazon.clickonYourAddress();
		
		
		YourAddressPage yourAddressPage = new YourAddressPage(driverTest);
		yourAddressPage.clickaddnewaddress();
		yourAddressPage.sendFullName();
		yourAddressPage.sendMobileNumber();
		yourAddressPage.sendPincode();
		yourAddressPage.sendFlatOrHouseNo();
		yourAddressPage.sendAreaOrStreetOrVillage();
		yourAddressPage.sendLandmark();
		yourAddressPage.sendTownOrCity();
		yourAddressPage.clickonCheckbox();
		yourAddressPage.clickonclickondropdown();
		
		Thread.sleep(3000);
		yourAddressPage.clickonselectdropdownvalue();
		yourAddressPage.clickonAddAddButton();
		
		homePageAmazon.clickonSignOut();


}
}