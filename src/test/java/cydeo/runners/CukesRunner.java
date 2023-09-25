package cydeo.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber-reports.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
    },
        features = "src/test/resources/features",
        glue = "cydeo/step_definitions",
        dryRun = false,
        tags = "",
        publish = false

)
public class CukesRunner {
}


