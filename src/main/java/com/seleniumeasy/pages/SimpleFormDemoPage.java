package com.seleniumeasy.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SimpleFormDemoPage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"user-message\"]")
	WebElement enterMsg;

	@FindBy(how = How.XPATH, using = "//*[@id=\"get-input\"]/button")
	WebElement showMessage;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sum1\"]")
	WebElement enterValue1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sum2\"]")
	WebElement enterValue2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"gettotal\"]/button")
	WebElement getTotal;

	public SimpleFormDemoPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getCurrentUrl());
	}

	public void simpleForm(String msg) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		enterMsg.sendKeys(msg);
		showMessage.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"display\"]")).getText());
	}

	public void simpleFormAddition(String a, String b) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		enterValue1.sendKeys(a);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterValue2.sendKeys(b);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getTotal.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("a + b="+driver.findElement(By.xpath("//*[@id=\"displayvalue\"]")).getText());

	}
}
