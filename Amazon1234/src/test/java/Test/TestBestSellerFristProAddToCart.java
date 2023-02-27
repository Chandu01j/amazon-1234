package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;
import Amazon123.ProductAddToCart;
import Amazon123.ShopingCartPage;

public class TestBestSellerFristProAddToCart {
	
	
	
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
		
		
		homePageAmazon.clickonmanuButton();
		homePageAmazon.clickonBestSeller();
		homePageAmazon.clickonBestSellerFirstProSel();
		Thread.sleep(3000);
		
	//	homePageAmazon.clickonProAddToCart();
		
		 ProductAddToCart productAddToCart = new ProductAddToCart(driverTest);
//		 ArrayList<String> addr1 = new ArrayList<String> (driverTest.getWindowHandles());
//			driverTest.switchTo().window(addr1.get(1));//switch to child browser
			Thread.sleep(2000);
		 productAddToCart.clickonAddToCart();	
	//	 productAddToCart.clickonCart();
		ShopingCartPage shopingCartPage = new ShopingCartPage(driverTest);
		Thread.sleep(2000);
		shopingCartPage.clickonGoToCart();
		
}	
}