package test_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/com/test/resources/Product.feature",
		glue="com.stepDefinitions",
		dryRun=false,
		plugin={"pretty","html:test-output/cucumber/report.html"},
		monochrome=true
		)
public class NopCommerce_Test  extends AbstractTestNGCucumberTests{

}
