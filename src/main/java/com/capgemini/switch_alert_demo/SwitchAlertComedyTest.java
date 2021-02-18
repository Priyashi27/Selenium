package com.capgemini.switch_alert_demo;

public class SwitchAlertComedyTest {

	public static void main(String[] args) throws InterruptedException {
		
		SwitchAlertComedy comedy=new SwitchAlertComedy();
		
		comedy.comedyShowId();
		Thread.sleep(1000);
		
		comedy.comedyShowTitle();
		Thread.sleep(1000);
		
		comedy.releaseDate();
		Thread.sleep(1000);
		
		comedy.comedian();
		Thread.sleep(1000);
		
		comedy.duration();
		Thread.sleep(1000);
		
		comedy.languageDropDown();
		Thread.sleep(1000);
		
		comedy.comedyShowRating();
		Thread.sleep(1000);
		
		comedy.clickBtn();
		
		}

}
