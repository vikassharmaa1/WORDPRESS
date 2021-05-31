package com.testcases.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.pages.AdminHomePage;
import com.seleniumeasy.pages.AllPostsPage;

public class TestPostsCountUsingPageObjects {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sharma.vika1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AdminHomePage loginPage = PageFactory.initElements(driver, AdminHomePage.class);
		AllPostsPage allPostsPage = loginPage.login();
		System.out.println(allPostsPage.getAllPostsCount());
	}

}
