package com.capgemini.testing;

public class MainTest {

	public static void main(String[] args) {
		
		
		
		RegisterAutomation register=new RegisterAutomation();
		
		register.selectRadioButton();
		register.selectCheckBox();
		register.selectDropDownLanguage();
		register.selectDropDownSkills();
		register.selectDropDownCountry();
		register.selectDropDownCountry2();
		register.selectDOB();
		register.selectPassword();
		register.selectSubmit();
		
	}

}
