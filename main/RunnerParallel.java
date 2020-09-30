package com.platform.here.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "junit:target/parallel.xml", "json:target/parallel.json"}, features = "src/resources/features", glue = "src/stepDefs", tags = {"@test"})

public class ParallelRunner {
}
