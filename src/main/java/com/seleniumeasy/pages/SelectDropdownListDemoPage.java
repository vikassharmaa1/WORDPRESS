package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDropdownListDemoPage {
	WebDriver driver;

	public SelectDropdownListDemoPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void dropDown(WebElement objToClick, String webElementName, String value) {

	}
}
