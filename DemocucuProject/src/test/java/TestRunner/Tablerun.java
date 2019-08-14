package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target/cucumberreport.html"},
features="Feature",
strict=true,
glue= {"stepefinition"},tags= {"@data-driven"})
public class Tablerun {
}
