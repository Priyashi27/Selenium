package com.capgemini.navigation_demo;

public class NavigateMainTest {

	public static void main(String[] args) {


		NavigateAutomation navigate=new NavigateAutomation();
		navigate.searchText();
		navigate.moveBack();
		navigate.moveForward();
		navigate.navigateRefresh();
		navigate.navigateTo();
	}

}
