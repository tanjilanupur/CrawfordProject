package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "./src/main/java/Features/TestCase1.feature",
		glue= {"stepDefinitions"},
		dryRun = false,
		plugin = {"pretty","html:test-outout"},
		monochrome = true
		)
public class TestRunner {

}
