package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "classpath:stepDefinitions",
        tags = {"@run"},
        plugin = {
                "pretty",
                "json:target/cucumber.json"
        },
        monochrome = true,
        strict = true,
        dryRun = false
)
public class TestRunner {
}
