package com.capgemini.switch_demo;

public class SwitchMainTest {

	public static void main(String[] args) throws InterruptedException {
		
		SwitchAutomation sw=new SwitchAutomation();
		sw.menTab();
		Thread.sleep(1000);
		sw.womenTab();
		Thread.sleep(1000);
		sw.kidsTab();
		Thread.sleep(1000);
		sw.homeTab();
		Thread.sleep(1000);
		sw.switchTabs();

		

	}

}
