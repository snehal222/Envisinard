package Amelio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.ApplicationHeaderPage;
import Pom.LoginPage;

public class TestClass {
	private WebDriver driver;
	private LoginPage loginpage;
	//private ApplicationHeaderPage applicationheaderpage;
	@BeforeClass
	public void launchBrowser() 
	{
		System.out.println("LaunchBrowsr");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loginToApplication()
	{
		System.out.println("loginToApplication");
		driver.get("https://merchant.amealio.com");
		LoginPage loginpage =new LoginPage(driver);
		loginpage.sendUserName();
		loginpage.sendPassWord();
		loginpage.clickOnSubmit();
		
	
		
		
	}
	@Test
	public void verifyUserTab()
	{
		System.out.println("verifyUserTab");
	}
	
	@Test
	public void verifyReportButton()
	{
		System.out.println("verifyReportButton");
	}
	@AfterMethod
	public void lagOut()
	{
		System.out.println("logOut");
	}
	
	@AfterClass
	public void closedbrowser()
	{
		System.out.println("ClosedBrowsr");
	}
	
	
}

