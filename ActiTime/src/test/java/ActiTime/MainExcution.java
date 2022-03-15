package ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainExcution {

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method..");
	}
	
	@Test
	public void test() {
		System.out.println("test method..");
	}

}
