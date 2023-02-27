package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon123.AmazonSignInPage;
import Amazon123.HomePageAmazon;

public class TestAmazonMiniTvTopVideoplay {
	
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.amazon.in/");
		
		HomePageAmazon homePageAmazon = new HomePageAmazon(driverTest);
		homePageAmazon.clickonAccountAndLists();
		
		AmazonSignInPage amazonSignInPage = new AmazonSignInPage(driverTest);
		amazonSignInPage.login();
		
		
		homePageAmazon.clickonAmazonMiniTVButton();
		homePageAmazon.clickonTopTreadeingfirstvideoplay();
		homePageAmazon.clickonVideoPlayButton();
		Thread.sleep(5000);
		homePageAmazon.clickPlayButton();
		
	  driverTest.navigate().back();
	  homePageAmazon.clickonAmazonsymbol();
		
}
}