package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
		features = { "src/main/resources/resources/openemr2.feature"},
		glue = {"com/cts/stepdefination"},
		monochrome = true,
		plugin = {"html:reports/"}
		)
@RunWith(Cucumber.class)



public class NewPatientRunner {

}
