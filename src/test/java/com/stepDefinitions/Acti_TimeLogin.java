package com.stepDefinitions;

import com.pages.LoginPage_ActiTme;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.BaseClass;

public class Acti_TimeLogin extends BaseClass{ 
	
	LoginPage_ActiTme loginpage_actiTme;
	
//	@Before(order=0)
//	public void initialize_browser(){
//        driver=initializeDriver();
//        loginpage_actiTme=new LoginPage_ActiTme(driver);      
//    }
	@Given("User navigates to the Acti_Time_Application URL {string}")
	public void user_navigates_to_the_acti_time_application_url(String string) {
		loginpage_actiTme.acti_TimeUrl(string);
	}
	@When("User enters the UserName {string}")
	public void user_enters_the_user_name(String string) {
		loginpage_actiTme.enter_UserName(string);
	}
	@When("User enters the Password  {string}")
	public void user_enters_the_password(String string) {
		loginpage_actiTme.enter_Password(string);
	}
	@Then("User Should able to click on login button")
	public void user_should_able_to_click_on_login_button() {
		loginpage_actiTme.click_Login();
	}

//	@After
//	public void close_Browser() {
//		driver.quit();
//	}
}
