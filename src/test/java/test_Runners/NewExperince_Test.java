package test_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/com/test/resources/NewPractice.feature"},
		glue={"TodaysStepdefinations"},
		dryRun=false,
		plugin={"pretty","html:test-output/cucumber/report.html"},
		monochrome=true,
		publish = true,
		tags = "@AllData"
		)
public class NewExperince_Test extends AbstractTestNGCucumberTests {

}
