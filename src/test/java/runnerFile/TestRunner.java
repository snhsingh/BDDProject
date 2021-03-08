package runnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features", 
					glue= {"stepDefinitionFiles", "utilityAndConfig", "webPages"},
					monochrome=true,
					plugin= {"pretty","html:target/cucmber"}
)


public class TestRunner {
	

}
