package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Regisration_Steps {

	@Given("User is on register page")
	public void user_is_on_register_page() {
		System.out.println("User navigates to register page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		for (List<String> e1 : userList) {
			System.out.println(e1);
		}
		
	}

	@Then("user should be successfully register in registration page")
	public void user_should_be_successfully_register_in_registration_page() {
		System.out.println("user registration successfully");
	}
}
