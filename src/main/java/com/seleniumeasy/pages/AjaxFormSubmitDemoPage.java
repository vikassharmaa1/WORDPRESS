package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AjaxFormSubmitDemoPage {
	WebDriver driver;
	@FindBy(how = How.ID, using = "content-ifr")
	WebElement newPostContentFrame;
	@FindBy(how = How.ID, using = "tinymce")
	WebElement newPostContentBody;
	@FindBy(how = How.ID, using = "title")
	WebElement newPostTitle;
	@FindBy(how = How.ID, using = "publish")
	WebElement newPostPublish;

	public AjaxFormSubmitDemoPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void ajaxFormSubmit(String fullName, String descComment) {
		driver.switchTo().frame(newPostContentFrame);
		newPostContentBody.clear();
		newPostContentBody.sendKeys(fullName);
		driver.switchTo().defaultContent();
		newPostTitle.click();
		newPostTitle.clear();		
		newPostPublish.click();
	}

}
