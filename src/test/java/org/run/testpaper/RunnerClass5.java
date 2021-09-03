package org.run.testpaper;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/resources/Question7.feature",glue="org.stepdef5",
dryRun=false,strict=true)
public class RunnerClass5 {

	/*  QUESTION 7:
		-----------
		URL : https://demoqa.com/registration/
		NOTE: Execute feature file for registration form with one scenario outline.*/


/*	dryRun = true , only missing snippet will get generate - other lines of code will not execute
	dryRun = false , normal execution will take place
	
    When strict = true , scenarios will be executed normally
    At the end for undefined steps snippets will be generated and the build will be marked as failed
	when it has some undefined steps . */
	
}

