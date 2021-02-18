package com.capgemini.switch_alert_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlertDemo {
	
WebDriver driver;
	
	public SwitchAlertDemo()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println("Title of the Page : "+driver.getTitle());
		
		System.out.println("URL of the Page : "+driver.getCurrentUrl());
		
	}
	
	public void clickBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		alt.dismiss();
		
	}
	


}
