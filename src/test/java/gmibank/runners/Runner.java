package gmibank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features ="src/test/resources/features",
        glue = "gmibank/stepdefinitions",
        tags = "@us_11",
       dryRun = true
)
public class Runner {

}
