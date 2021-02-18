package com.capgemini.switch_demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAutomation {
	
	WebDriver driver;
	WebElement men;
	WebElement women;
	WebElement kids;
	WebElement home;
	WebElement offer;
	
	
	public SwitchAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Page : "+driver.getTitle());		
		
	}
	
	public void menTab()
	{
		men=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	
	
	
	public void womenTab()
	{
		women=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		women.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	
	
	
	public void kidsTab()
	{
		kids=driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[3]/div[1]/a[1]"));
		kids.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	
	
	
	public void homeTab()
	{
		home=driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[4]/div[1]/a[1]"));
		home.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	
	public void switchTabs()
	{
		ArrayList<String>array=new ArrayList<String>(driver.getWindowHandles());
		int count=0;
		for(int i=0;i<array.size();i++)
		{
		
			driver.switchTo().window(array.get(i));
			
			System.out.println(driver.getTitle());
			count++;
		}
		System.out.println("No. of Tabs : "+count);
	}
	
	
	
}
