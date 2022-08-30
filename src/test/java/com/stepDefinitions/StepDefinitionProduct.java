package com.stepDefinitions;

import org.testng.Assert;
import com.pages.HomePage;
import com.pages.ProductPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.BaseClass;

public class StepDefinitionProduct extends BaseClass {
	HomePage homePage;
	ProductPage productPage;
	

//	@Before(order = 0)
//	public void initialize_browser_with_chrome() {
//		driver = initializeDriver();
//	}
//
//	@Before(order = 1)
//	public void createObjectForPages() {
//		homePage = new HomePage(driver);
//		productPage = new ProductPage(driver);
//	}

	@Given("User navigates to the {string}")
	public void user_navigates_to_the(String string) {
		getUrl(string);
	}

	@When("User clicks on the product")
	public void user_clicks_on_the_product() {
		homePage.ClickOnProduct();
	}

	@When("User clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		productPage.ClickOnAddToCart();
	}

	@Then("User should not be able to add the product to the cart without giving specifications")
	public void user_should_not_be_able_to_add_the_product_to_the_cart_without_giving_specifications() {
		boolean msg = productPage.getMsgError();
		Assert.assertTrue(msg);
	}

	@When("User clicks on the specification details {string}")
	public void user_clicks_on_the_specification_details(String string) {
		productPage.SelectRam(string);
		productPage.ClickOnHdd();
	}

	@Then("User should be able to add the products to cart")
	public void user_should_be_able_to_add_the_products_to_cart() {
		productPage.ClickOnAddToCart();
		boolean msg = productPage.getMsgSuccess();
		Assert.assertTrue(msg);
	}

	@When("User clicks on add to cart and clicks on cart button")
	public void user_clicks_on_add_to_cart_and_clicks_on_cart_button() {
		productPage.ClickOnAddToCart();
		productPage.ClickOnShoppingCart();
	}

//	@After
//	public void close_the_browser() {
//		driver.close();
//
//	}

}
