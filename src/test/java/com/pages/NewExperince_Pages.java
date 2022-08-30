package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewExperince_Pages {
	WebDriver driver;

	public NewExperince_Pages(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By btn_Signin = By.xpath("//a[@title='Log in to your customer account']");
	By txt_Email =By.xpath("//input[@id='email_create']");
	By btn_CreateAc = By.xpath("//span[normalize-space()='Create an account']");
	By btn_Radio =By.xpath("//input[@id='id_gender1']");
	By txt_FirstName = By.xpath("//input[@id='customer_firstname']");
	By txt_LastName = By.xpath("//input[@id='customer_lastname']");
	By txt_Password = By.xpath("//input[@id='passwd']");
	By txt_AddFirst = By.xpath("//input[@id='firstname']");
	By txt_AddLast = By.xpath("//input[@id='lastname']");
	By txt_MainAddress = By.xpath("//input[@id='address1']");
	By txt_City = By.xpath("//input[@id='city']");

	public void click_Signin() {
		driver.findElement(btn_Signin).click();
	}
	public void enter_Email(String email) {
		driver.findElement(txt_Email).sendKeys(email);
	}
	public void click_CreateAc() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_CreateAc));
		driver.findElement(btn_CreateAc).click();
	}
	public void click_Radio() {
		driver.findElement(btn_Radio).click();
	}
	public void enter_FirstName(String firstname) {
		driver.findElement(txt_FirstName).sendKeys(firstname);
	}
	public void enter_LastName(String lastname) {
		driver.findElement(txt_LastName).sendKeys(lastname);
	}
	public void enter_Password(String password) {
		driver.findElement(txt_Password).sendKeys(password);
	}
	public void enter_AddFirst(String addfirst) {
		driver.findElement(txt_AddFirst).sendKeys(addfirst);
	}
	public void enter_AddLast(String addlast) {
		driver.findElement(txt_AddLast).sendKeys(addlast);
	}
	public void enter_MainAdd(String mainadd) {
		driver.findElement(txt_MainAddress).sendKeys(mainadd);
	}
	public void enter_City(String city) {
		driver.findElement(txt_City).sendKeys(city);
	}

}
