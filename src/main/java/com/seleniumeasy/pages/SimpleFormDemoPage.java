package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SimpleFormDemoPage {
	WebDriver driver;
	@FindBy(how = How.ID, using = "content-ifr")
	WebElement newPostContentFrame;
	@FindBy(how = How.ID, using = "tinymce")
	WebElement newPostContentBody;
	@FindBy(how = How.ID, using = "title")
	WebElement newPostTitle;
	@FindBy(how = How.ID, using = "publish")
	WebElement newPostPublish;

	public SimpleFormDemoPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void simpleForm(String msg) {
		driver.switchTo().frame(newPostContentFrame);		
		driver.switchTo().defaultContent();
		newPostTitle.sendKeys(msg);
		newPostPublish.click();
	}
	
	public void simpleForm(String x, String y) {
		driver.switchTo().frame(newPostContentFrame);		
		driver.switchTo().defaultContent();
		newPostTitle.sendKeys(x);
		newPostTitle.sendKeys(y);
		newPostPublish.click();
	}
}
