package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Base;

public class LoginPageTest  extends Base{
	
	@BeforeSuite
	public void doInitialization()
	{
		try {
			driver = initailizeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Test
	public void verifyLogin(String userName, String password)
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(data.getProperty("username"), data.getProperty("password"));
		
	}
	

}
