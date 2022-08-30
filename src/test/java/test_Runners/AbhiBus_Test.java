package test_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/com/test/resources/AbhiBus.feature"},
		glue={"com.stepDefinitions"},
		dryRun=true,
		plugin={"pretty","html:test-output/cucumber/report.html"},
		monochrome=true,
		tags= "@Abhi_Bus",
		publish = true
		)
public class AbhiBus_Test  extends AbstractTestNGCucumberTests{
 
}
