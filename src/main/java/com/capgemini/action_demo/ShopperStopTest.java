package com.capgemini.action_demo;

public class ShopperStopTest {

	public static void main(String[] args) throws InterruptedException {

		ShopperStop ss=new ShopperStop();
		Thread.sleep(2000);
		ss.enterEmail();

		Thread.sleep(2000);
		ss.enterPassword();
		
		Thread.sleep(1000);
		ss.clickSignIn();
		
		Thread.sleep(1000);
		ss.hoverMouseWomen();
		
		Thread.sleep(1000);
		ss.clickDress();
		
		Thread.sleep(1000);
		ss.selectDressImg();
		
	}

}
