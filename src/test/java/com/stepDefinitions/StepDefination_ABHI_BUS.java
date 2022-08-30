package com.stepDefinitions;

import com.pages.HomePage_AbhiBus;
import com.pages.LoginPage_ActiTme;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.BaseClass;

public class StepDefination_ABHI_BUS extends BaseClass {
	HomePage_AbhiBus homepage_abhibus;

	@Before(order = 0)
	public void initialize_browser() {
		driver = initializeDriver();
		homepage_abhibus = new HomePage_AbhiBus(driver);

	}

	@Given("User navigates to the Abhi_Bus_Application URL {string}")
	public void user_navigates_to_the_abhi_bus_application_url(String string) {
		homepage_abhibus.enter_Abhi_BusUrl(string);

	}

	@When("User enters the Leaving from TextBox {string}")
	public void user_enters_the_leaving_from_text_box(String string) {
		homepage_abhibus.enter_Leavingfrom(string);
	}

	@Then("User able to select from destination")
	public void user_able_to_select_from_destination() {
		homepage_abhibus.click_Placeto();
	}

	@When("User enters the Going to TextBox {string}")
	public void user_enters_the_going_to_text_box(String string) {
		homepage_abhibus.enter_Goingto(string);
	}

	@Then("User able to select to destination")
	public void user_able_to_select_to_destination() {
		homepage_abhibus.click_Comingto();
	}

	@When("User should able to click on Data of Journey")
	public void user_should_able_to_click_on_data_of_journey() {
		homepage_abhibus.click_DateofJourney();
	}

	@When("User should able to select the Journey Date")
	public void user_should_able_to_select_the_journey_date() {
		homepage_abhibus.click_Date();

	}

	@Then("User Should able to click on Search button")
	public void user_should_able_to_click_on_search_button() {
		homepage_abhibus.click_Search();
	}

	@When("User able to click on Select seat button")
	public void user_able_to_click_on_select_seat_button() {
		homepage_abhibus.click_Selectseat();
	}

	@Then("User able to select the window seat")
	public void user_able_to_select_the_window_seat() {
		homepage_abhibus.click_Windowseat();
	}

	@Then("User have to select a Boarding point address")
	public void user_have_to_select_a_boarding_point_address() {
		homepage_abhibus.select_Boardingpoint();
	}

	@Then("User have to select a Dropping point address")
	public void user_have_to_select_a_dropping_point_address() {
		homepage_abhibus.select_Droppingpoint();
	}

	@Then("User able to click on Continue to Payment button")
	public void user_able_to_click_on_continue_to_payment_button() {
		homepage_abhibus.click_ContinuePayment();
	}

	@When("User navigates to next page enter email_id")
	public void user_navigates_to_next_page_enter_email_id(String string) {
		homepage_abhibus.enter_EmailID(string);
	}

	@Then("User should able to enter Mobile Number")
	public void user_should_able_to_enter_mobile_number(String string) {
		homepage_abhibus.enter_MObileNumber(string);
	}

	@Then("User able to enter Full Name")
	public void user_able_to_enter_full_name(String string) {
		homepage_abhibus.enter_FullName(string);
	}

	@Then("User able to enter Age")
	public void user_able_to_enter_age(String string) {
		homepage_abhibus.enter_Age(string);
	}

	@Then("User should able to click on Pay button")
	public void user_should_able_to_click_on_pay_button() {
		homepage_abhibus.click_Paybutton();
	}

	@After
	public void close_Browser() {
		driver.quit();
	}

}
