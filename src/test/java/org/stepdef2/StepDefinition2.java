package org.stepdef2;

import org.base.BaseClass;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass{

	//There were undefined steps. You can implement missing steps with the snippets below:

		@Given("user will open the Chrome browser and launch the facebook application.")
		public void user_will_open_the_Chrome_browser_and_launch_the_facebook_application() {
			System.out.println("Browser Launch");
			chromeBrowserLaunch();
			System.out.println("URL Launch");
			urlLaunch("https://en-gb.facebook.com/");	
		}

		@When("User inputs {string} and {string} in the respective fields")
		public void user_inputs_and_in_the_respective_fields(String user, String pass) {
			System.out.println("Username is "+user);
			System.out.println("Password is "+pass);
			driver.findElement(By.name("email")).sendKeys(user);
		    driver.findElement(By.name("pass")).sendKeys(pass);
		}

		@When("user clicks on the Login button.")
		public void user_clicks_on_the_Login_button() {
			System.out.println("Login Button");
			driver.findElement(By.name("login")).click(); 		
		}

		@Then("validate if the user login is successful.")
		public void validate_if_the_user_login_is_successful() {
			System.out.println("Facebook verified");
		}


}
