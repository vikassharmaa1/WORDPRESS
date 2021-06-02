package com.testcases.seleniumeasydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.seleniumeasy.pages.AdminHomePage;

public class TestSimpleFormUsingPageObjects {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sharma.vika1\\eclipse-oxygen-workspace\\WORDPRESS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AdminHomePage homePg = PageFactory.initElements(driver, AdminHomePage.class);
		homePg.simpleFormDemo();
	}

}
