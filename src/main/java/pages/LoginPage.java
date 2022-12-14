package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "")
	WebElement user;
	
	@FindBy(css = "")
	WebElement pass;
	
	@FindBy(id = "")
	WebElement submit;
	public void doLogin(String username, String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
		
	}

	
	public void verifyForgotPassword()
	{
		
		
		
	}
	
	
	public void veryifyCreateAnOpenCartAccountLink()
	{
		
	}
}
