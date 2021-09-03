package org.run.testpaper;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/resources/Question8.feature",glue="org.stepdef3",
dryRun=false,strict=true,tags="@Smoke")
public class RunnerClass3A {

/*   QUESTION 8:
     -----------
     URL : https://www.facebook.com/
     NOTE: Execute the feature file of login page with one scenario and execute with plugin,tags,monochrome run with components.*/
	
	
/*	dryRun = true , only missing snippet will get generate - other lines of code will not execute
	dryRun = false , normal execution will take place
	
    When strict = true , scenarios will be executed normally
    At the end for undefined steps snippets will be generated and the build will be marked as failed
	when it has some undefined steps . 
	
	tags :
	-------
	For grouping the scenarios . we can use tags . what tag in the feature file should be executed 
	Output : only @Smoke tags Scenarios will get execute
	
	*/
	
	

}

