package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import freemarker.ext.beans._MethodUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties data;
	public static Actions action;
	public static TakesScreenshot takeScreenshot;
	public WebDriver initailizeDriver() throws IOException
	{
		data = new Properties();
		FileInputStream fis = new FileInputStream("E:\\workspace\\2022\\class10AM\\openCart\\src\\main\\resources\\data.properties");
		data.load(fis);	
		String test_browser = data.getProperty("browser");
		if(test_browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();			
			driver = new ChromeDriver();
			action= new Actions(driver);
			takeScreenshot = (TakesScreenshot)driver;
		}
		else if(test_browser.equalsIgnoreCase("firefox"))
		{
			
		}
		else
		{
			
			
			
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		return driver;
	}
	
	
	public void openApplication()
	{
		driver.get(data.getProperty("url"));
	}
	
	
	public void takeScreenshoot()
	{
		
	}
	
	

}


