package stepdef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStepDef {
	
	HomePage home;
	
	@Given("user is on main page")
	public void user_is_on_main_page() {
		
		home= new HomePage();
	   
	}
	@When("user click show menu")
	public void user_click_show_menu() throws InterruptedException {
		home.clickShowMenu();
	   
	}
	@When("user click home button")
	public void user_click_home_button() throws InterruptedException {
		home.clickHomeButton();
	   
	}
	@Then("user is available with three sliders")
	public void user_is_available_with_three_sliders() throws InterruptedException {
		home.sliders();
	   
	}
	@Then("user is available with three arrivals")
	public void user_is_available_with_three_arrivals() {
	    home.arrivals();
	}
	
	@Then("arrival image should be clickable and navigable")
	public void arrival_image_should_be_clickable_and_navigable() throws InterruptedException {
	    home.arrivalNavigation();
	}
	

	@Then("click on description tab")
	public void click_on_description_tab() throws InterruptedException {
		
		home.clickDescriptionTab();
		
 
	}
	
	@Then("there should be description regarding book")
	public void there_should_be_description_regarding_book() {
		
		home.getDescription();

    
	}
	

	@Then("click on review tab")
	public void click_on_review_tab() throws InterruptedException {
		
		home.clickReviewTab();
	    
	}
	
	@Then("there should be review regarding book")
	public void there_should_be_review_regarding_book() {
	    
		home.getReview();
	}








}
