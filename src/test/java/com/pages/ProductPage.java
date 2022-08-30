package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By lstRam=By.id("product_attribute_2");
	By chkHdd=By.xpath("//label[@for='product_attribute_3_6']");
	By btnAddCart=By.id("add-to-cart-button-1");
	By msgError=By.xpath("//div[@class='bar-notification error']");
	By btnCart=By.xpath("//span[@class='cart-label']");
	By msgSuccess=By.xpath("//*[text()='The product has been added to your ']");
	

	public void SelectRam(String ramDetail) {
		WebElement ram=driver.findElement(lstRam);
		Select sel1=new Select(ram);
		sel1.selectByVisibleText(ramDetail);
	}
	
	public void ClickOnHdd() {
		driver.findElement(chkHdd).click();
	}
	
	public void ClickOnAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnAddCart));
		driver.findElement(btnAddCart).click();
	}
	
	public boolean getMsgError() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgError));
		boolean msg=driver.findElement(msgError).isDisplayed();
		return msg;
	}
	
	public void ClickOnShoppingCart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnCart));
		driver.findElement(btnCart).click();
	}
	
	public boolean getMsgSuccess() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgSuccess));
		boolean msg=driver.findElement(msgSuccess).isDisplayed();
		return msg;
	}

}
