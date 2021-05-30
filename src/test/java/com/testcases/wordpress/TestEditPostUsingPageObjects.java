package com.testcases.wordpress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.pages.AdminLoginPage;
import com.wordpress.pages.AllPostsPage;

public class TestEditPostUsingPageObjects {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sharma.vika1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AdminLoginPage loginPage = PageFactory.initElements(driver, AdminLoginPage.class);
		AllPostsPage allPostsPage = loginPage.login();
		allPostsPage.editAPost("Creating New Post using PageObects", "Editing Post using PageObjects",
				"Test framework low maintenance");
	}

}
