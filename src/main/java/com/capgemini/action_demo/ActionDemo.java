package com.capgemini.action_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	
	WebDriver driver;
	WebElement men;
	Actions actions;
	WebElement bag;
	ChromeOptions options=new ChromeOptions();

	public ActionDemo()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		options.addArguments("--disable-notifications","start-maximized");

		driver=new ChromeDriver(options);

		driver.get("https://www.myntra.com/");
		
		actions=new Actions(driver);
		System.out.println("Title of the Page : "+driver.getTitle());		
		
	}
	
	public void hoverMouse()
	{
		men=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		actions.moveToElement(men).perform();
	}
	
	public void clickBags() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[14]/a")).click();
		Thread.sleep(2000);
	}
	
	public void clickBagPacks()
	{
		List<WebElement> t=driver.findElements(By.xpath("//ul[@class='categories-list']//child::li"));

		System.out.println(t.size());
		
		for(WebElement e:t)
		{
			System.out.println(e.getText());
			if(e.getText().contains("Backpacks"))
			{
				actions.moveToElement(e.findElement(By.tagName("input"))).click().perform();
			}
		

		}
	}
	
	
}
