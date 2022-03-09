package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy (xpath ="//input[@id='outlined-error-helper-text']")
	private WebElement UserName;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement PassWord;
	
	@FindBy (xpath ="//button[@type='Submit']")
	private WebElement Login;
	private WebDriver driver;
	private WebDriverWait wait;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,4);
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		UserName.sendKeys("9158893844");
	}
	public void sendPassWord()
	{
		PassWord.sendKeys("Lotusdeck@123");
	}
	
	public void clickOnSubmit() 
	{
		wait.until(ExpectedConditions.visibilityOf(Login));
		Login.click();
	}

}
