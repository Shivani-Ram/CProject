package org.stepdef3;

import org.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 extends BaseClass{

	//There were undefined steps. You can implement missing steps with the snippets below:

		@Given("user will open the Chrome browser and launch the facebook application.")
		public void user_will_open_the_Chrome_browser_and_launch_the_facebook_application() {
			System.out.println("Browser Launch");
			// chromeBrowserLaunch();
			System.out.println("URL Launch");
			// urlLaunch("https://en-gb.facebook.com/");	
		}

		@When("user will enter the username into the UserName field.")
		public void user_will_enter_the_username_into_the_UserName_field() {
			System.out.println("Username");
			// driver.findElement(By.name("email")).sendKeys("Selenium");
		}

		@When("user enters the password into the Password field.")
		public void user_enters_the_password_into_the_Password_field() {
			System.out.println("Password");
			// driver.findElement(By.name("pass")).sendKeys("Selenium@123");
		}

		@When("user clicks on the Login button.")
		public void user_clicks_on_the_Login_button() {
			System.out.println("Login Button");
			// driver.findElement(By.name("login")).click(); 			
		}

		@Then("validate if the user login is successful.")
		public void validate_if_the_user_login_is_successful() {
			System.out.println("Facebook verified");	
		}


}
