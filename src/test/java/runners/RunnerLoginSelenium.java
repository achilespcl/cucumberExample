package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"stepDefinitions"},
		features= {"classpath:features/login.feature"},
		plugin = {"html:target/cucumber"},
		monochrome = true
		)
public class RunnerLoginSelenium {
}
