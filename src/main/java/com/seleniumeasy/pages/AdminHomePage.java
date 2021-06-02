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

	// SimpleForm

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	WebElement inputForms;

	@FindBy(how = How.XPATH, using = "//*[@id=\"user-message\"]")
	WebElement simpleFormDemo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")
	WebElement li_SimpleForm;

	// CheckBox

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a")
	WebElement li_Checkbox;

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

	// Radio

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[3]/a")
	WebElement li_RadioButtons;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
	WebElement radio_M;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")
	WebElement radio_F;


	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")
	WebElement radio_M_2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")
	WebElement radio_F_2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")
	WebElement radio_age_1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")
	WebElement radio_age_2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")
	WebElement radio_age_3;

	

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/a")
	WebElement li_DatePicker;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/a")
	WebElement li_Table;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/nav/div/div[1]/div/a")
	WebElement demoHome;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[1]/a")
	WebElement li_ProgressBars;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[2]/a")
	WebElement li_AlertsAndModals;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[3]/a")
	WebElement li_listBox;

	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/a")
	WebElement li_Others;

	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();

	}

	public void tearDown() {
		driver.quit();
	}

	public void simpleFormDemo() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
		inputForms.click();
		li_SimpleForm.click();
		SimpleFormDemoPage formDemo = PageFactory.initElements(driver, SimpleFormDemoPage.class);
		formDemo.simpleForm("Hi, Selenium made testing easy!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		formDemo.simpleFormAddition("43", "92");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tearDown();
	}

	public void checkboxDemo() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
		inputForms.click();
		li_Checkbox.click();

		CheckboxDemoPage chkBoxDemo = PageFactory.initElements(driver, CheckboxDemoPage.class);

		chkBoxDemo.singleCheckbox(objToClick, "Check Box");
		chkBoxDemo.multiCheckbox(button, "Button");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chkBoxDemo.multiCheckbox(button, "Button");
		chkBoxDemo.multiCheckbox(checkBox1, "CheckBox 1");
		chkBoxDemo.multiCheckbox(checkBox2, "CheckBox 2");
		chkBoxDemo.multiCheckbox(checkBox3, "CheckBox 3");
		chkBoxDemo.multiCheckbox(checkBox4, "CheckBox 4");
		tearDown();

	}

	public void radiobuttonsDemo() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
		inputForms.click();
		li_RadioButtons.click();
		RadiobuttonsDemoPage radioBtnDemo = PageFactory.initElements(driver, RadiobuttonsDemoPage.class);

		radioBtnDemo.radioBtn(radio_M, "Radiobutton: Male");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.radioBtn(radio_F, "Radiobutton: Female");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.multiRadioButton(radio_M_2, radio_age_1, "Age Group 1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.multiRadioButton(radio_F_2, radio_age_2, "Age Group 2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.multiRadioButton(radio_M_2, radio_age_2, "Age Group 2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.multiRadioButton(radio_F_2, radio_age_1, "Age Group 2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.multiRadioButton(radio_M_2, radio_age_3, "Age Group 3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnDemo.multiRadioButton(radio_F_2, radio_age_3, "Age Group 3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tearDown();

	}

	public void selectDropdownlistDemo(WebElement objClick, String webelementName, String strValue) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
		inputForms.click();
		SelectDropdownListDemoPage dropDownDemo = PageFactory.initElements(driver, SelectDropdownListDemoPage.class);
		dropDownDemo.dropDown(objClick, webelementName, strValue);
	}

	public void inputFormSubmitDemo() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
		inputForms.click();
		InputFormSubmitDemoPage inputFormSubmitDemo = PageFactory.initElements(driver, InputFormSubmitDemoPage.class);
		inputFormSubmitDemo.inputFormSubmit();
	}

	public void ajaxFormSubmitDemo(String name, String comment) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
		inputForms.click();
		AjaxFormSubmitDemoPage ajaxFormSubmitDemo = PageFactory.initElements(driver, AjaxFormSubmitDemoPage.class);
		ajaxFormSubmitDemo.ajaxFormSubmit(name, comment);
	}

	public void jQuerySelectDropdownDemo(String index) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		close_Popup.click();
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
