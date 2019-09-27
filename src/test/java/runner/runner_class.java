package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature//cs1.feature", glue= {"case_study"} , plugin={"html:target/cuc1.html"})


public class runner_class {

}
