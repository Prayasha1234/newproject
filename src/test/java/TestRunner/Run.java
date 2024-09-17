package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//CheckFeature/CheckedFeature.feature",
		glue="StepDefinition",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty"})
public class Run {

}
