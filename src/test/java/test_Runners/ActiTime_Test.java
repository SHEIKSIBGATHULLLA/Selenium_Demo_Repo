package test_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/com/test/resources/ActiTimeLogin.feature",
		glue="com.stepDefinitions",
		dryRun=false,
		plugin={"pretty","html:test-output/cucumber/report.html"},
		monochrome=true
		)
public class ActiTime_Test extends AbstractTestNGCucumberTests {

}
