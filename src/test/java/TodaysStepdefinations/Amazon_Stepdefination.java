package TodaysStepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;
import com.pages.Amazon_HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Stepdefination {

	WebDriver driver;
	Amazon_HomePage amazon_homepage;

	@Before
	public void open_Browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		amazon_homepage = new Amazon_HomePage(driver);

	}

	@Given("User navigates to amazon application {string}")
	public void user_navigates_to_amazon_application(String string) {
		driver.get(string);
	}

	@When("User clicks on Sign-in the Sign-in page should be displayed")
	public void user_clicks_on_sign_in_the_sign_in_page_should_be_displayed() {
		amazon_homepage.click_Signin();
	}

	@When("User login with valid phone number {string}")
	public void user_login_with_valid_phone_number(String string) {
		amazon_homepage.enter_Phonenumber(string);
	}

	@Then("User able to click on continue buton the Sign-in page should be displayed")
	public void user_able_to_click_on_continue_buton_the_sign_in_page_should_be_displayed() {
		amazon_homepage.click_PhNumContinue();
	}

	@When("User login with valid password {string}")
	public void user_login_with_valid_password(String string) {
		amazon_homepage.enter_Password(string);
	}

	@Then("User able to click on Sign-in button")
	public void user_able_to_click_on_sign_in_button() {
		amazon_homepage.click_PasswordContinue();
	}

	@When("User search the particular product {string}")
	public void user_search_the_particular_product(String string) {
		amazon_homepage.enter_Product(string);
	}

	@Then("User able to click on search button")
	public void user_able_to_click_on_search_button() {
		amazon_homepage.click_SearchBar();
	}

	@When("User able to click the particular product")
	public void user_able_to_click_the_particular_product() {
		amazon_homepage.click_Product();
	}

	@When("User added the product to the cart")
	public void user_added_the_product_to_the_cart() {
		amazon_homepage.click_AddCart();
	}

	@When("User able to click on proceed to buy button")
	public void user_able_to_click_on_proceed_to_buy_button() {
		amazon_homepage.click_Proceedtobuy();
	}

	@Then("User able to click on delivery address button")
	public void user_able_to_click_on_delivery_address_button() {
		amazon_homepage.click_DeliveryAddress();
	}

	@Then("User able to click on Payment button")
	public void user_able_to_click_on_payment_button() {
		amazon_homepage.click_PaymentMethod();
	}

	//Negative Testing with valid user name and invalid password


@Given("User navigates to amazon application for negative testing {string}")
public void user_navigates_to_amazon_application_for_negative_testing(String string) {
    driver.get(string);
}
@When("User clicks on Sign-in the Sign-in page should be displayed for negative testing")
public void user_clicks_on_sign_in_the_sign_in_page_should_be_displayed_for_negative_testing() {
	amazon_homepage.click_Signin();
}
@When("User login with valid phone number for negative testing {string}")
public void user_login_with_valid_phone_number_for_negative_testing(String string) {
	amazon_homepage.enter_Phonenumber(string);
}
@Then("User able to click on continue buton for negative testing")
public void user_able_to_click_on_continue_buton_for_negative_testing() {
	amazon_homepage.click_PhNumContinue();
}
@When("User login with invalid password for negative testing\"Bismas@{int}\"")
public void user_login_with_invalid_password_for_negative_testing_bismas(Integer int1) {
	amazon_homepage.enter_Password(null);
}
@Then("User not able to click on Sign-in button for negative testing")
public void user_not_able_to_click_on_sign_in_button_for_negative_testing() {
	amazon_homepage.click_PasswordContinue();
}
	@After
	public void close_Browser() {
		driver.quit();
	}
}
