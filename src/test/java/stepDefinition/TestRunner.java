package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\chidy\\eclipse-workspace\\BBD1\\src\\main\\resources\\feature\\noCommerce.feature",glue = "stepDefinition",dryRun=true,monochrome = true,plugin =  {"json:target/cucumber.json"})


public class TestRunner {
	
}
