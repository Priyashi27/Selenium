package com.capgemini.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAutomation {
	
	WebDriver driver;
	
	public RegisterAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
		//driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Priyashi");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Tomar");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("117 SarvSampanna Nagar, Indore");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("priyashi.tomar@capgemini.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8770027515");
	
	}
	
	public void selectRadioButton()
	{
		List<WebElement> radio=driver.findElements(By.name("radiooptions"));
		for(WebElement gender:radio)
		{
			if(gender.getAttribute("value").equalsIgnoreCase("female"))
			{
				gender.click();
			}
		}
	}
	
	public void selectCheckBox()
	{
		List<WebElement> check=driver.findElements(By.xpath("//*[@id=\"checkbox2\"]"));
		for(WebElement skill:check)
		{
			if(skill.getAttribute("value").equalsIgnoreCase("movies"))
			{
				skill.click();
			}
		}
	}
	
	public void selectDropDownLanguage()
	{
		WebElement lang=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		lang.click();
		List<WebElement> dropdown=driver.findElements(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[2]/ul[1] //child::li"));
		for(WebElement language:dropdown)
		{
			if(language.getText().equalsIgnoreCase("english"))
			{
				language.click();
			}
		}
	}
	
	public void selectDropDownSkills()
	{
		Select skill=new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		skill.selectByVisibleText("Java");
	}
	
	public void selectDropDownCountry()
	{
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
		country.selectByVisibleText("India");
	}
	
	public void selectDropDownCountry2()
	{
		WebElement count=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		count.click();
		List<WebElement> dropdown=driver.findElements(By.xpath("//body/span[1]/span[1]/span[1]/input[1]"));
		for(WebElement country:dropdown)
		{
			if(country.getText().equalsIgnoreCase("India"))
			{
				country.click();
			}
		}
	}
	
	public void selectDOB()
	{
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		year.selectByVisibleText("2000");
		
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		month.selectByVisibleText("January");
		
		Select day=new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		day.selectByVisibleText("26");
		
	}
	
	public void selectPassword()
	{
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Password@123");
		
	}
	
	public void selectSubmit()
	{
		driver.findElement(By.className("class=\"btn btn-primary\"")).submit();
	}
}