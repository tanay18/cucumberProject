package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",//feature_file
glue= {"stepefinition"},tags= {"@data-driven"})
public class TestRun {

}
