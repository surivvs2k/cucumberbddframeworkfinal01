package testRunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features={".//Features/Login.feature",".//Features/Customers.feature"},
		features={".//Features/"},
		//glue="stepdefinitions",
		glue= {"stepdefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"},
		tags={"@sanity, @regression"}
		
		)




				
public class TestRun {

}