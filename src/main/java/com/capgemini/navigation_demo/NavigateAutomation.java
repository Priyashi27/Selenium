package com.capgemini.navigation_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAutomation {
	
	WebDriver driver;
	WebElement search;
	
	public NavigateAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Page : "+driver.getTitle());
		
		System.out.println("URL of the Page : "+driver.getCurrentUrl());
		
	}
	
	public void searchText()
	{
		search=driver.findElement(By.name("q"));
		search.sendKeys("Capgemini India");
		search.submit();
		System.out.println("Title : "+driver.getTitle());
	}
	
	public void moveBack()
	{
		driver.navigate().back();
		System.out.println("After Moving Back : "+driver.getTitle());
	}
	
	public void moveForward()
	{
		driver.navigate().forward();
		System.out.println("After Moving Forward : "+driver.getTitle());
	}
	
	public void navigateRefresh()
	{
		driver.navigate().refresh();
		System.out.println("After Refreshing : "+driver.getTitle());
	}
	
	public void navigateTo()
	{
		driver.navigate().to("https://app.pluralsight.com/library/");
		System.out.println("Title : "+driver.getTitle());
	}

}
