package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	

	
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement showMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeButton;
	
	@FindBys(value = { @FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]") })
	List<WebElement> slider;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement arrow;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival1;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival2;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival3;
	
	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	WebElement addToBasket;
	
	@FindBy(xpath = "//a[contains(text(),'Description')]")
	WebElement descriptionTab;
	
	@FindBy(xpath = "//div[@id='tab-description']")
	WebElement description;
	
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	WebElement reviewTab;
	
	@FindBy(xpath = "//p[contains(text(),'There are no reviews yet.')]")
	WebElement review;
	
	
	//Home page with three sliders only
	public HomePage()
	{
		loadPage();
		PageFactory.initElements(driver,this);
	}
	
	public void clickShowMenu() throws InterruptedException
	{
		showMenu.click();
		Thread.sleep(1000);
	}
	
	public void clickHomeButton() throws InterruptedException
	{
		homeButton.click();
		Thread.sleep(1000);
		
	}
	
	public void sliders() throws InterruptedException
	{
		arrow.click();
		Thread.sleep(2000);
		arrow.click();
		Thread.sleep(2000);
		arrow.click();
		int slidercount=slider.size();
		//Assert.assertEquals(3L,(long)slidercount);

		System.out.println(slidercount);
		
		
	}
	
	//home page with three arrivals
	public void arrivals()
	{
		if(arrival1.isDisplayed() && arrival2.isDisplayed() &&arrival3.isDisplayed())
		{
			System.out.println("ARRIVALS AVAILABLE!");
		}
		
	}
	
	//Images in arrivals should navigate
	public void arrivalNavigation() throws InterruptedException
	{
		arrival1.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		arrival2.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		arrival3.click();
	}
	
	//arrivals image description
	public void clickDescriptionTab() throws InterruptedException
	{
		arrival1.click();
		Thread.sleep(1000);
		descriptionTab.click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		arrival2.click();
		Thread.sleep(1000);
		descriptionTab.click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		arrival3.click();
		Thread.sleep(1000);
		descriptionTab.click();
		
		
		
	}
	
	public void getDescription()
	{
		
		if(description.isDisplayed())
		{

			String data=description.getText();
			Assert.assertTrue(data, true);
		}
	}
	
	//arrivals image review
	public void clickReviewTab() throws InterruptedException
	{
		arrival1.click();
		Thread.sleep(1000);
		reviewTab.click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		arrival2.click();
		Thread.sleep(1000);
		reviewTab.click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		arrival2.click();
		Thread.sleep(1000);
		reviewTab.click();
	}
	
	public void getReview()
	{
		if(review.isDisplayed())
		{

			String data=review.getText();
			Assert.assertTrue(data, true);
		}
	}

}
