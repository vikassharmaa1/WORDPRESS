package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminNavigateUrlPage {
	WebDriver driver;

	public AdminNavigateUrlPage(WebDriver driver) {

		this.driver = driver;
		driver.get("https://www.seleniumeasy.com/");
	}

	public AdminHomePage init() {

		return PageFactory.initElements(driver, AdminHomePage.class);
	}

}
