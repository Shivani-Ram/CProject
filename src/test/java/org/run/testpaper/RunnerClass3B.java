package org.run.testpaper;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/resources/Question8.feature",glue="org.stepdef3",
dryRun=false,strict=true,tags="@Smoke",
 
plugin= {"html:D:\\SeleniumFrameworks - Workspace\\Cucumber_TestPaper\\REPORTS\\HTMLReport",
        "json:D:\\SeleniumFrameworks - Workspace\\Cucumber_TestPaper\\REPORTS\\JSONReport\\jsonGenerate.json",
        "junit:D:\\SeleniumFrameworks - Workspace\\Cucumber_TestPaper\\REPORTS\\JUNITReport\\junitGenerate.xml"})
public class RunnerClass3B {

/*   QUESTION 8:
     -----------
     URL : https://www.facebook.com/
     NOTE: Execute the feature file of login page with one scenario and execute with plugin,tags,monochrome run with components.*/
	
	@AfterClass
	public static void jvm() {
	  JvmReport.jvmGenerate("D:\\\\SeleniumFrameworks - Workspace\\\\Cucumber_TestPaper\\\\REPORTS\\\\JSONReport\\\\jsonGenerate.json");
	}
		
/*	dryRun = true , only missing snippet will get generate - other lines of code will not execute
	dryRun = false , normal execution will take place
	
    When strict = true , scenarios will be executed normally
    At the end for undefined steps snippets will be generated and the build will be marked as failed
	when it has some undefined steps . 
	
	tags :
	-------
	For grouping the scenarios . we can use tags . what tag in the feature file should be executed 
	Output : only @Smoke tags Scenarios will get execute   */
	

}

