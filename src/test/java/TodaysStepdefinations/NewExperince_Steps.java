package TodaysStepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.NewExperince_Pages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewExperince_Steps {
	WebDriver driver;
	NewExperince_Pages newexperince;

	@Before
	public void open_Browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		newexperince = new NewExperince_Pages(driver);
	}
@Given("User clicks on Sign_in button")
public void user_clicks_on_sign_in_button() {
	newexperince.click_Signin();
}
@When("User enters the valid email")
public void user_enters_the_valid_email(DataTable dataTable) {
	newexperince.enter_Email(dataTable.cell(0, 0));
}
@Then("User click on create an account button the page should be in home page")
public void user_click_on_create_an_account_button_the_page_should_be_in_home_page(DataTable dataTable) {
	newexperince.click_CreateAc();
}

//Create Account functionality

@When("User selects the title")
public void user_selects_the_title() {
	newexperince.click_Radio();
}
@Then("User enters the First Name")
public void user_enters_the_first_name(DataTable dataTable) {
	newexperince.enter_FirstName(dataTable.cell(0, 1));
}
@Then("User enters the Last Name")
public void user_enters_the_last_name(DataTable dataTable) {
	newexperince.enter_LastName(dataTable.cell(1, 1));
}
@Then("User enters the Password")
public void user_enters_the_password(DataTable dataTable) {
	newexperince.enter_Password(dataTable.cell(2, 1));
}
@Then("User enters the address of first name")
public void user_enters_the_address_of_first_name(DataTable dataTable) {
	newexperince.enter_AddFirst(dataTable.cell(3, 1));
}
@Then("User enters the adddres of last name")
public void user_enters_the_adddres_of_last_name(DataTable dataTable) {
	newexperince.enter_AddLast(dataTable.cell(4, 1));
}
@Then("User enters the main Address")
public void user_enters_the_main_address(DataTable dataTable) {
	newexperince.enter_MainAdd(dataTable.cell(5, 1));
}
@Then("User enters the City")
public void user_enters_the_city(DataTable dataTable) {
	newexperince.enter_City(dataTable.cell(6, 1));
}
	}

