package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_AbhiBus {

	WebDriver driver;

	public HomePage_AbhiBus(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By txt_Leaving = By.xpath("//input[@id='source']");
	By lbl_Placeto = By.xpath("//li[text()='Bengaluru']");
	By txt_Goingto = By.xpath("//input[@id='destination']");
	By lbl_Comingto = By.xpath("//li[text()='Chennai']");
	By btn_DateofJourney = By.xpath("//input[@id='datepicker1']");
	By btn_Date = By.xpath("(//a[@class='ui-state-default'])[2]");
	By btn_Search = By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']");
	By btn_SelectSeat = By.xpath("(//span[@class='book'])[1]");
	By sel_WindowSeat = By.xpath("//a[@id='O7-9ZZ']");
	By btn_BoardingPoint = By.xpath("//select[@id='boardingpoint_id']");
	By btn_DropingPoint = By.xpath("//select[@id='droppingpoint_id']");
	By btn_Payment = By.xpath("(//input[@value='Continue to Payment '])[2]");
	By txt_Email = By.xpath("//input[@placeholder='Enter Your Email ID']");
	By txt_Phone = By.xpath("//input[@id='Mobile_No']");
	By txt_Name = By.xpath("//input[@id='adultname0']");  
	By txt_Age = By.xpath("//input[@id='adultage0']");
	By btn_Payment1 = By.xpath("(//input[@id='paynow'])[1]");

	public void enter_Abhi_BusUrl(String Url) {
		driver.get(Url);
	}

	public void enter_Leavingfrom(String FromPlace) {
		driver.findElement(txt_Leaving).sendKeys(FromPlace);
	}

	public void click_Placeto() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(lbl_Placeto));
		driver.findElement(lbl_Placeto).click();
	}

	public void enter_Goingto(String ToPlace) {
		driver.findElement(txt_Goingto).sendKeys(ToPlace);
	}

	public void click_Comingto() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(lbl_Comingto));
		driver.findElement(lbl_Comingto).click();
	}

	public void click_DateofJourney() {
		driver.findElement(btn_DateofJourney).click();
	}

	public void click_Date() {
		driver.findElement(btn_Date).click();
	}

	public void click_Search() {
		driver.findElement(btn_Search).click();
	}
	public void click_Selectseat() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_SelectSeat));
		driver.findElement(btn_SelectSeat).click();
	}
	public void click_Windowseat() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(sel_WindowSeat));
		driver.findElement(sel_WindowSeat).click();
	}
	public void select_Boardingpoint() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_BoardingPoint));
		driver.findElement(btn_BoardingPoint).sendKeys("Majestic - Boarding Zone - High5 Holidays, Shop No.18 - Hotel Mayura Complex, Opp Majestic Bus Stand-21:30");
	}
	public void select_Droppingpoint() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_DropingPoint));
		driver.findElement(btn_DropingPoint).sendKeys("Poonamallee - Infront of BSNL Telephone Exchange Office-04:40");
	}
	public void click_ContinuePayment() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Payment));
		driver.findElement(btn_Payment).click();
	}
	public void enter_EmailID(String Email) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Email));
		driver.findElement(txt_Email).sendKeys(Email);
	}
	public void enter_MObileNumber(String Mobile_Number) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Phone));
		driver.findElement(txt_Phone).sendKeys(Mobile_Number);
	}
	public void enter_FullName(String FullName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Name));
		driver.findElement(txt_Name).sendKeys(FullName);
	}
	public void enter_Age(String Age) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Age));
		driver.findElement(txt_Age).sendKeys(Age);
	}
	public void click_Paybutton() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Payment1));
		driver.findElement(btn_Payment1).click();
	}
}
