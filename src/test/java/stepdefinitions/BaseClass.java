package stepdefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	
	
	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	
	// Created for generating random string for unique mail
	
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	

}
