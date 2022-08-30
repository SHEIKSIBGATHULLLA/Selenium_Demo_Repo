package test_Runners;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/com/test/resources/Amazon.feature"},
		glue={"TodaysStepdefinations"},
		dryRun=false,
		plugin={"pretty","html:test-output/cucumber/report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true,
		publish = true,
		tags="@Amazon_Payment"
		
		)
@Listeners({ExtentITestListenerClassAdapter.class})
public class Amazon_Test extends AbstractTestNGCucumberTests {

}
