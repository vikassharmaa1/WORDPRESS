package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RadiobuttonsDemoPage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"buttoncheck\"]")
	WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")
	WebElement verifyText;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
	WebElement getValues;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")
	WebElement verifyText2;

	public RadiobuttonsDemoPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void radioBtn(WebElement objToClick, String webElementName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objToClick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("WebElement Clicked: " + webElementName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submitButton.click();
		System.out.println(verifyText.getText());

	}

	public void multiRadioButton(WebElement objToClick1, WebElement objToClick2, String webElementName) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objToClick1.click();
		System.out.println("WebElement Clicked: " + webElementName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objToClick2.click();
		System.out.println("WebElement Clicked: " + webElementName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getValues.click();
		System.out.println(verifyText2.getText());

	}
}
