package runner;

import org.junit.After;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // path to .feature file
        glue = "steps",                   // step definitions package
        plugin = {"pretty", "html:target/htmlReports"},
        dryRun = false
)
public class testRunner {

}

