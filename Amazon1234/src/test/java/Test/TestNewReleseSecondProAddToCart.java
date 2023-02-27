package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;
import Amazon123.ProductAddToCart;
import Amazon123.ShopingCartPage;

public class TestNewReleseSecondProAddToCart {
	
	
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
		homePageAmazon.clickonNewReleases();
		homePageAmazon.clickonNewReleasesSecondProSel();
		Thread.sleep(3000);
	//	homePageAmazon.clickonProAddToCart();
		
		 ProductAddToCart productAddToCart = new ProductAddToCart(driverTest);
		 productAddToCart.clickonAddToCart();
		 productAddToCart.clickonCart();
		
//		ShopingCartPage shopingCartPage = new ShopingCartPage(driverTest);
//		Thread.sleep(2000);
//		shopingCartPage.clickonGoToCart();
}

}
