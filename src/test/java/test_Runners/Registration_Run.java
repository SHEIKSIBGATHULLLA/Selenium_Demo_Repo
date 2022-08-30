package test_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/com/test/resources/registration.feature"},
		glue={"com.stepDefinitions"},
		dryRun=false,
		plugin={"pretty","html:test-output/cucumber/report.html"},
		monochrome=true,
		publish = true,
		tags ="@register"
		)
public class Registration_Run extends AbstractTestNGCucumberTests {

}
