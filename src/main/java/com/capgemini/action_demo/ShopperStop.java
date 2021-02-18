package com.capgemini.action_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ShopperStop {
	
	WebDriver driver;
	ChromeOptions options=new ChromeOptions();
	Actions actions;
	WebElement email;
	WebElement password;
	WebElement signIn;
	WebElement women;
	WebElement dress;
	public ShopperStop()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		options.addArguments("--disable-notifications","start-maximized");

		driver=new ChromeDriver(options);

		driver.get("https://www.shoppersstop.com/#login");
		
		actions=new Actions(driver);
		System.out.println("Title of the Page : "+driver.getTitle());		
		
	}
	
	public void enterEmail()
	{
		email=driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
		
		email.sendKeys("priyashi3026@gmail.com");
		email.click();
		System.out.println(email.getText());
	}
	
	public void enterPassword()
	{
		password=driver.findElement(By.xpath("//*[@id=\"j_password\"]"));
		password.sendKeys("Priyashi@2627");
		password.click();
	}
	
	public void clickSignIn()
	{
		signIn=driver.findElement(By.xpath("//*[@id=\"loginajax\"]"));
		signIn.click();
		driver.findElement(By.xpath("//*[@id=\"member-scroller\"]/span")).click();
	}
	
	public void hoverMouseWomen()
	{
		women=driver.findElement(By.xpath("/html/body/main/div[1]/nav/div[1]/div/ul/li[2]/a"));
		actions.moveToElement(women).perform();
	}
	
	public void clickDress()
	{
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Indian wear')]"))).perform();
		dress=driver.findElement(By.linkText("Kurtas"));
		dress.click();
		
	}
	
	public void selectDressImg() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"primaryImage\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/div[3]/section[1]/div/div[2]/div/div[2]/div[2]/div/div[6]/div/div[4]/ul/li[1]/button")).click();
	}

}
