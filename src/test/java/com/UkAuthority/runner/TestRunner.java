package com.UkAuthority.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test",
        features = "src/test/java/resources/featuresfile", // change your feature file path from package
        glue = "com/UkAuthority/steps", // select step defination path from parent directory
        plugin = {"pretty", "html:target/cucumber.html",
        }
        )
public class TestRunner {

}
