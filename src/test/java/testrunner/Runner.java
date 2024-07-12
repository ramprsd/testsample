package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/featurefile"},
        glue = {"stepdefenitionfile"},
        tags = "mouse",
        plugin = {"pretty","html:target/test-output/report.html",
                  "json:target/test-output/report.json",
                  "junit:target/test-output/report.xml",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class Runner {

}
