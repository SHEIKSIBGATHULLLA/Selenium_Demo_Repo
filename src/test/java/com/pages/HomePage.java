package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By product=By.xpath("//a[text()='Build your own computer']");

	
	public void ClickOnProduct() {
		driver.findElement(product).click();
	}

}
