package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.BaseClass;

public class LoginPage_ActiTme {

	WebDriver driver;

	public LoginPage_ActiTme(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By txt_UserName = By.xpath("//input[@id='username']");
	By txt_Password = By.xpath("//input[@placeholder='Password']");
	By btn_Login = By.xpath("//div[text()='Login ']");
    
	public void acti_TimeUrl(String Url) {
		driver.get(Url);
	}
	
	public void enter_UserName(String UserName) {

		driver.findElement(txt_UserName).sendKeys(UserName);
	}

	public void enter_Password(String Password) {
		driver.findElement(txt_Password).sendKeys(Password);
	}

	public void click_Login() {
		driver.findElement(btn_Login).click();
	}
}
