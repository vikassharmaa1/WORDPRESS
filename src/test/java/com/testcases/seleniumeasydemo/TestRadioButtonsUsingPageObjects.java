package com.testcases.seleniumeasydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.pages.AdminHomePage;
import com.seleniumeasy.pages.AdminNavigateUrlPage;


public class TestRadioButtonsUsingPageObjects {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sharma.vika1\\eclipse-oxygen-workspace\\WORDPRESS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AdminNavigateUrlPage navigateUrl = PageFactory.initElements(driver, AdminNavigateUrlPage.class);
		AdminHomePage adminHomePg = navigateUrl.init();
		adminHomePg.radiobuttonsDemo();
	}

}
