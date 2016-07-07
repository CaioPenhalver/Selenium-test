package support.helper;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/test_report/"},
		glue = { "features"}, // hooks and steps
		features = {"src/features/specs/"}, // specs
        tags = "@login"//"@registerAnimal"
)	
public class RunCukies {
	
}
