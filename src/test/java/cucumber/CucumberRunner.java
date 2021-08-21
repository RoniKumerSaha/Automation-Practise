package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Cucumber/features"}
        , glue = {"cucumber/steps"}
        , tags = {}
)

public class CucumberRunner {
}
