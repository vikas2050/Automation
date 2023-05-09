package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\features\\login.feature",plugin = "html:target/testReport/report.html", glue ={"stepDefination"},tags = "@Smoke" )


public class TestRunner {

}
