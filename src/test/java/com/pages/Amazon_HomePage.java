package com.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amazon_HomePage { 
    WebDriver driver;
    
	public Amazon_HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By btn_Signin = By.xpath("//a[@id='nav-link-accountList']");
	By txt_Phonenumber = By.xpath("//input[@id='ap_email']");
	By btn_Continue = By.xpath("//input[@id='continue']");
	By txt_Password  = By.xpath("//input[@id='ap_password']");
	By btn_Continue1 = By.xpath("//input[@id='signInSubmit']");
	By txt_SearchBar = By.xpath("//input[@id='twotabsearchtextbox']");
	By btn_SearchBar = By.xpath("//span[@id='nav-search-submit-text']");
	By btn_Image = By.xpath("//span[@id='B01N6OOW52-amazons-choice-label']");	
	By btn_AddCart = By.xpath("//input[@title='Add to Shopping Cart']");
	By btn_ProceedtoBuy = By.xpath("//input[@name='proceedToRetailCheckout']");
    By btn_DeliveryAddress = By.xpath("(//a[@class='a-declarative a-button-text '])[1] ");
    By btn_PaymentMethod = By.xpath("//h1[text()='Select a payment method']");
    
	public void click_Signin() {
		driver.findElement(btn_Signin).click();
	}
	public void enter_Phonenumber(String phno) {
		driver.findElement(txt_Phonenumber).sendKeys(phno);
	}
	public void click_PhNumContinue() {
		driver.findElement(btn_Continue).click();
	}
	public void enter_Password(String pass) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Password));
		driver.findElement(txt_Password).sendKeys(pass);
	}
	public void click_PasswordContinue() {
		driver.findElement(btn_Continue1).click();
	}
	public void enter_Product(String product) {
		driver.findElement(txt_SearchBar).sendKeys(product);
	}
	public void click_SearchBar() {
		driver.findElement(btn_SearchBar).click();
	}
	public void click_Product() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Image));
		driver.findElement(btn_Image).click();
	}
	public void click_AddCart() {
		String mainWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String actual: handles) {
            if(!actual.equals(mainWindow)) {
                driver.switchTo().window(actual);
            }
            
    }
        driver.findElement(btn_AddCart).click();
    }
	
	public void click_Proceedtobuy() {
		driver.findElement(btn_ProceedtoBuy).click();
	}
	public void click_DeliveryAddress() {
		driver.findElement(btn_DeliveryAddress).click();
	}
	public void click_PaymentMethod() {
		boolean element = driver.findElement(btn_PaymentMethod).isDisplayed();
		Assert.assertTrue(element);
	}
	
}
