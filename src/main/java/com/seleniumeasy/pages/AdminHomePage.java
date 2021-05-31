package com.seleniumeasy.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	WebElement inputForms;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a")
	WebElement singleCheckbox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"isAgeSelected\"]")
	WebElement objToClick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"check1\"]")
	WebElement button;

	@FindBy(how = How.XPATH, using = "//*[@id=\"at-cv-lightbox-close\"]")
	WebElement close_Popup;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")
	WebElement checkBox1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
	WebElement checkBox2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")
	WebElement checkBox3;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")
	WebElement checkBox4;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/a")
	WebElement datePicker;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/a")
	WebElement table;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/nav/div/div[1]/div/a")
	WebElement demoHome;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[1]/a")
	WebElement progressBars;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a")
	WebElement alertsAndModals;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[3]/a")
	WebElement listBox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/a")
	WebElement Others;

	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		driver.get("https://www.seleniumeasy.com/test/");
	}

	public void simpleFormDemo(String message) {
		inputForms.click();
		SimpleFormDemoPage formDemo = PageFactory.initElements(driver, SimpleFormDemoPage.class);
		formDemo.simpleForm(message);

	}

	public void simpleFormDemo(String a, String b) {
		inputForms.click();
		SimpleFormDemoPage formDemo = PageFactory.initElements(driver, SimpleFormDemoPage.class);
		formDemo.simpleForm(a);
		formDemo.simpleForm(b);

	}

	public void checkboxDemo() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		close_Popup.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		inputForms.click();
		singleCheckbox.click();

		CheckboxDemoPage chkBoxDemo = PageFactory.initElements(driver, CheckboxDemoPage.class);

		chkBoxDemo.singleCheckbox(objToClick, "Check Box");
		chkBoxDemo.multiCheckbox(button, "Button");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		button.click();
		chkBoxDemo.multiCheckbox(checkBox1, "CheckBox 1");
		chkBoxDemo.multiCheckbox(checkBox2, "CheckBox 2");
		chkBoxDemo.multiCheckbox(checkBox3, "CheckBox 3");
		chkBoxDemo.multiCheckbox(checkBox4, "CheckBox 4");
		chkBoxDemo.tearDown();

	}

	public void radiobuttonsDemo(WebElement objClick, String webelementName) {
		inputForms.click();
		RadiobuttonsDemoPage radioBtnDemo = PageFactory.initElements(driver, RadiobuttonsDemoPage.class);
		radioBtnDemo.radioBtn(objClick, webelementName);
	}

	public void selectDropdownlistDemo(WebElement objClick, String webelementName, String strValue) {
		inputForms.click();
		SelectDropdownListDemoPage dropDownDemo = PageFactory.initElements(driver, SelectDropdownListDemoPage.class);
		dropDownDemo.dropDown(objClick, webelementName, strValue);
	}

	public void inputFormSubmitDemo() {
		inputForms.click();
		InputFormSubmitDemoPage inputFormSubmitDemo = PageFactory.initElements(driver, InputFormSubmitDemoPage.class);
		inputFormSubmitDemo.inputFormSubmit();
	}

	public void ajaxFormSubmitDemo(String name, String comment) {
		inputForms.click();
		AjaxFormSubmitDemoPage ajaxFormSubmitDemo = PageFactory.initElements(driver, AjaxFormSubmitDemoPage.class);
		ajaxFormSubmitDemo.ajaxFormSubmit(name, comment);
	}

	public void jQuerySelectDropdownDemo(String index) {
		inputForms.click();
		JQuerySelectDropdownDemoPage jQuerySelectDropdownDemo = PageFactory.initElements(driver,
				JQuerySelectDropdownDemoPage.class);
		jQuerySelectDropdownDemo.jQuerySelectDropdown(index);

	}

	/*
	 * public AllPostsPage login() { email.sendKeys("pageobjectpattern@gmail.com");
	 * password.sendKeys("webdriver123"); submit.click(); return
	 * PageFactory.initElements(driver, AllPostsPage.class);
	 */

}
