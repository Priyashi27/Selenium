package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import exception.BrowserNotCompatableException;

public class TestBase {
	public static WebDriver driver;
	Actions action;
	Properties prop;
	
	public TestBase()
	{
		prop=new Properties();
		try {
			prop.load(new FileInputStream("config//config.properties"));
			String browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else
			{
				throw new BrowserNotCompatableException("Application not supported in this browser");
			}
		}  catch (IOException e) {
			e.printStackTrace();
		} catch (BrowserNotCompatableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadPage()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

	}

}
