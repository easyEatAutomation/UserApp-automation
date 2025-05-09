package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefination"},
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    tags = {"@smoke and not @Delivery"}
)
public class IndonesiaRunner {
}