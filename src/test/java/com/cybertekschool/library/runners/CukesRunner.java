package com.cybertekschool.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",
        glue = "com/cybertekschool/library/step_definitions",
        dryRun = true,
        tags = "@add_book_api"
)
public class CukesRunner {
}
