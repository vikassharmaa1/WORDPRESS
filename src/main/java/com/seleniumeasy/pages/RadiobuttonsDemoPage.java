package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RadiobuttonsDemoPage {
	WebDriver driver;
	@FindBy(how = How.LINK_TEXT, using = "Move to Trash")
	WebElement moveToTrash;

	public RadiobuttonsDemoPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void radioBtn(WebElement objToClick, String webElementName) {
		moveToTrash.click();
	}

}
