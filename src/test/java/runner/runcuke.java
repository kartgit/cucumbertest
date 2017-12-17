package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		dryRun = false, 
		monochrome=true, 
		features = "src/test/java/feature",
		glue="step", 
		format={"pretty","html:Login","json:target/RunCuke/cucumber.json"})
						//format={"pretty","html:target"}, tags={"@tag3,@tag4"})  
						//check all implemented methods and monochrome for clear report
						//To run specific features
						//Run cases on step basics


public class runcuke {

}
