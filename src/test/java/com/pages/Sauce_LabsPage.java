package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauce_LabsPage {

	WebDriver driver;

	public Sauce_LabsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By txt_Username = By.xpath("//input[@id='user-name']");
	By txt_Password = By.xpath("//input[@id='password']");
	By btn_Login  = By.xpath("//input[@id='login-button']");
	
	public void enter_SauceLabsUrl(String Url) {
		driver.get(Url);
	}
	public void enter_Username(String username) {
		driver.findElement(txt_Username).sendKeys(username);
	}
	public void enter_Password(String password) {
		driver.findElement(txt_Password).sendKeys(password);
	}
	public void click_Login() {
		driver.findElement(btn_Login).click();
	}
}
