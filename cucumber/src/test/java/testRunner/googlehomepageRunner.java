package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resorces/Feature", glue="src/test/java",tags="@sandeep")

public class googlehomepageRunner {
		
}
