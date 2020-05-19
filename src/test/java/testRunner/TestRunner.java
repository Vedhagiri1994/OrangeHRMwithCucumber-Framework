package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMwithCucumber/src/test/resources/featureFile",
				glue={"OrangeHRMwithCucumber/src/test/java/stepDefenition"})


public class TestRunner {
	
	

}
