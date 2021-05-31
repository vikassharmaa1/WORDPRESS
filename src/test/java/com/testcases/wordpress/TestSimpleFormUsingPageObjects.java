package com.testcases.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.seleniumeasy.pages.AdminHomePage;


public class TestSimpleFormUsingPageObjects {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sharma.vika1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AdminHomePage homePg = PageFactory.initElements(driver, AdminHomePage.class);
		homePg.simpleFormDemo("Hi, Selenium made testing easy!");
		homePg.simpleFormDemo("12", "57");
	}

}
