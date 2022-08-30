package com.stepDefinitions;

import com.pages.Sauce_LabsPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import resources.BaseClass;

public class SauceLabs_Steps extends BaseClass{

	Sauce_LabsPage sauce_labspage;
	@Before(order=0)
	public void initialize_browser(){
        driver=initializeDriver();
        sauce_labspage = new Sauce_LabsPage(driver);
    }
	@Given("User navigates to sauce labs application login page {string}")
	public void user_navigates_to_sauce_labs_application_login_page(String string) {
		sauce_labspage.enter_SauceLabsUrl(string );
	}


@Then("User enters {string} in username textbox")
public void user_enters_in_username_textbox(String string) {
	sauce_labspage.enter_Username(string);
}

@Then("User enters {string} in password textbox")
public void user_enters_in_password_textbox(String string) {
	sauce_labspage.enter_Password(string);
}

@Then("User should be successfully clicked on login button")
public void user_should_be_successfully_clicked_on_login_button() {
	sauce_labspage.click_Login();
}
@After
public void close_Browser() {
	driver.quit();
}
}
