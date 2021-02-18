package com.capgemini.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	WebDriver driver;
	
	public GoogleAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Page : "+driver.getTitle());
		
		System.out.println("URL of the Page : "+driver.getCurrentUrl());
		
	}
	
//	public void searchTextField()
//	{
//		WebElement search=driver.findElement(By.name("q"));
//		search.sendKeys("Capgemini");
//		search.submit();
//	}
//	
//	public void searchImageLink()
//	{
//		driver.findElement(By.linkText("Images")).click();
//		
//		System.out.println("----------------------------");
//		
//		System.out.println("Title of the page : "+driver.getTitle());
//	}
	
	public void searchAllTags()
	{

		List<WebElement> links=driver.findElements(By.tagName("input"));
		int count=links.size();
		System.out.println("No. of tags named input : "+count);
		
		
	
	}

}
