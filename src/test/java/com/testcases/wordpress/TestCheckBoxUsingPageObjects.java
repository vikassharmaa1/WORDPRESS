package com.testcases.wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.pages.AdminHomePage;
import com.seleniumeasy.pages.AdminNavigateUrlPage;
import com.seleniumeasy.pages.CheckboxDemoPage;

public class TestCheckBoxUsingPageObjects {
	

	public static void main(String[] args) {	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vivaan\\eclipse-workspace\\WORDPRESS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AdminNavigateUrlPage navigateUrl = PageFactory.initElements(driver, AdminNavigateUrlPage.class);
		AdminHomePage adminHomePg = navigateUrl.init();
		adminHomePg.checkboxDemo();		
	}

}
