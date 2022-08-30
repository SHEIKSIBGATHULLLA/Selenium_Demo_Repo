package MyHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver = new ChromeDriver();
@Before
public void open_Browser() {
	driver.get("https://www.abhibus.com/");
}
@After
public void close_Browser() {
	driver.close();
}

}
