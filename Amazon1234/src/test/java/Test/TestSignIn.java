package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;

public class TestSignIn {
	
	
public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.amazon.in/");
		
		HomePageAmazon homePageAmazon = new HomePageAmazon(driverTest);
		homePageAmazon.clickonAccountAndLists();
	//	homePageAmazon.clickonStarthere();
		
		AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driverTest);
//		amazonSignInPage.sendemailAndPhoneNo();
//		amazonSignInPage.clickonNextButton();
//		amazonSignInPage.sendpassword();
//		amazonSignInPage.clickonSignInButton();
		
         //  OR
		amazonSignInPage.login();
		
}
}