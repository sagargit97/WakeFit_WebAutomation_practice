package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ="src/test/resources/Feature/Search.feature",
        glue = "StepDef",
        plugin ={ "pretty","html:target/cucumber.html"})

public class Runner extends AbstractTestNGCucumberTests {


}
