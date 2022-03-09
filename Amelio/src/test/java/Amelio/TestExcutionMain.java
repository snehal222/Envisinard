package Amelio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.ApplicationHeaderPage;
import Pom.LoginPage;

public class TestExcutionMain {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://merchant.amealio.com");
	 LoginPage loginpage =new LoginPage(driver);
	 loginpage.sendUserName();
	 loginpage.sendPassWord();
	 loginpage.clickOnSubmit();
	 
	 ApplicationHeaderPage applicationheaderpage = new ApplicationHeaderPage();
	
	 
	 
	 

	}

}
