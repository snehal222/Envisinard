package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationHeaderPage {

	@FindBy (xpath ="//input[@id='outlined-error-helper-text']")
	private WebElement Seating;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement Pending;
	
}
