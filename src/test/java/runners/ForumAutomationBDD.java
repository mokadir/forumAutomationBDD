package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features",
		glue= {"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports/report.html"},
		monochrome=true,
	 // strict=true,
		dryRun=false
)

public class ForumAutomationBDD {

}