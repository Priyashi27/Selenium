package com.capgemini.switch_alert_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchAlertComedy {
WebDriver driver;
WebElement id;
WebElement title;
WebElement date;
WebElement comd;
WebElement durtn;
	
	public SwitchAlertComedy()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRIYTOMA/Desktop/Selenium/ComedyShow.html");
		driver.manage().window().maximize();
		System.out.println("Title of the Page : "+driver.getTitle());
		
		
	}
	// Show id
	public void comedyShowId()
	{
		id=driver.findElement(By.xpath("//*[@id=\"Text24\"]"));
		id.sendKeys("101");
		id.click();
	}
	
	//show title
	public void comedyShowTitle()
	{
		title=driver.findElement(By.xpath("//*[@id=\"Text1\"]"));
		title.sendKeys("TKSS");
		title.click();
	}
	
	//release date
	public void releaseDate()
	{
		date=driver.findElement(By.xpath("//*[@id=\"Text12\"]"));
		date.sendKeys("16/01/2000");
		date.click();
	}
	
	//comedian
	public void comedian()
	{
		comd=driver.findElement(By.xpath("//*[@id=\"Text14\"]"));
		comd.sendKeys("Kapil Sharma");
		comd.click();
		
	}
	
	//duration
	public void duration()
	{
		durtn=driver.findElement(By.xpath("//*[@id=\"Text15\"]"));
		durtn.sendKeys("9:00 - 11:00");
		durtn.click();
	}
	
	//language dropdown
	public void languageDropDown()
	{
		Select lang=new Select(driver.findElement(By.xpath("//*[@id=\"Select12\"]")));
		lang.selectByVisibleText("Hindi");
	}
	
	//comedy rating show
	public void comedyShowRating()
	{
		Select rate=new Select(driver.findElement(By.xpath("//*[@id=\"Select9\"]")));
		rate.selectByVisibleText("5");
	}
	
	//clicking button without filling id
	public void clickBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"Button4\"]")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.dismiss();
	}

}
