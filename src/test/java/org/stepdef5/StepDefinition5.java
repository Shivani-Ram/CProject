package org.stepdef5;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pojo.PojoClass2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition5 extends BaseClass{

	//There were undefined steps. You can implement missing steps with the snippets below:

		@Given("user will launch the chrome browser")
		public void user_will_launch_the_chrome_browser() {
			System.out.println("Browser Launch");
			chromeBrowserLaunch();		
		}

		@Given("navigates to the Registration Page")
		public void navigates_to_the_Registration_Page() {
			System.out.println("URL Launch");
			urlLaunch("http://demo.automationtesting.in/Register.html");
			maxWindow();
		}

		@When("the user enters the first name and last name in the respective fields.")
		public void the_user_enters_the_first_name_and_last_name_in_the_respective_fields() {
			PojoClass2 pj = new PojoClass2();
			fillTxt(pj.getFirstName(),"Shivani");
			fillTxt(pj.getLastName(),"SK");
			System.out.println("First Name and Last Name");

		}

		@When("user enters the Address and Email address")
		public void user_enters_the_Address_and_Email_address() {
			PojoClass2 pj = new PojoClass2();
			fillTxt(pj.getAddress(),"Chennai");
			fillTxt(pj.getEmailAddress(),"shivanisk@gmail.com");
			System.out.println("Address and Email address");

		}

		@When("user enters a Phone")
		public void user_enters_a_Phone() {
			PojoClass2 pj = new PojoClass2();
			fillTxt(pj.getPhone(),"8947527087");
			System.out.println("Phone");

		}

		@When("user selects a Gender")
		public void user_selects_a_Gender() {
			PojoClass2 pj = new PojoClass2();
			btnClick(pj.getRadioBtn2());
			System.out.println("Gender");

		}

		@When("user selects a Hobbies")
		public void user_selects_a_Hobbies() {
			PojoClass2 pj = new PojoClass2();
			btnClick(pj.getCheckBox1());
			btnClick(pj.getCheckBox2());
			System.out.println("Hobbies");

		}

		@When("user selects a Languages")
		public void user_selects_a_Languages() {
			PojoClass2 pj = new PojoClass2();
            System.out.println("Languages");
		}

		@When("user selects a Skills")
		public void user_selects_a_Skills() {
			PojoClass2 pj = new PojoClass2();
			//Thread.sleep(3000);
			singleSelectDropDown(pj.getDropDown1(),"Oracle");
			System.out.println("Skills");

		}

		@When("user selects a Country")
		public void user_selects_a_Country() {
			PojoClass2 pj = new PojoClass2();
			//Thread.sleep(3000);
			singleSelectDropDown(pj.getDropDown2(),"India");
			System.out.println("Country");

		}

		@When("user selects a Select Country")
		public void user_selects_a_Select_Country() {
			PojoClass2 pj = new PojoClass2();
			//Thread.sleep(3000);
		    singleSelectDropDown(pj.getDropDown3(),"New Zealand");
			System.out.println("Select Country");

		}

		@When("user selects a Date Of Birth")
		public void user_selects_a_Date_Of_Birth() {
			PojoClass2 pj = new PojoClass2();
			//Thread.sleep(3000);
		    singleSelectDropDown(pj.getDropDown4(),"1992");
		    //Thread.sleep(3000);
		    singleSelectDropDown(pj.getDropDown5(),"February");
		    //Thread.sleep(3000);
		    singleSelectDropDown(pj.getDropDown6(),"18");
			System.out.println("Date Of Birth");

		}

		@When("user enters the Password")
		public void user_enters_the_Password() {
			PojoClass2 pj = new PojoClass2();
			fillTxt(pj.getPassword(),"Ab@12345");
			System.out.println("Password");

		}

		@When("user enters the Confirm Password")
		public void user_enters_the_Confirm_Password() {
			PojoClass2 pj = new PojoClass2();
			fillTxt(pj.getConfirmPassword(),"Ab@12345");
			System.out.println("Confirm Password");

		}

		@When("user will click on the {string} button")
		public void user_will_click_on_the_button(String string) {
			PojoClass2 pj = new PojoClass2();
			btnClick(pj.getBtnSubmit());
			
		}
		
	 //There were undefined steps. You can implement missing steps with the snippets below:

	    @When("user will click on the Submit button")
	    public void user_will_click_on_the_Submit_button() {
	    	PojoClass2 pj = new PojoClass2();
			btnClick(pj.getBtnSubmit());  
			System.out.println("Submit Button");

		}

		@Then("validate if the user registration is successful.")
		public void validate_if_the_user_registration_is_successful() {
		    System.out.println("registration form verified");
		}
		
		
	// There were undefined steps. You can implement missing steps with the snippets below:

		@Then("User inputs {string} and {string} in the respective fields")
		public void user_inputs_and_in_the_respective_fields(String firstName, String lastName) {
			System.out.println("Firstname is "+firstName);
			System.out.println("Lastname is "+lastName);
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(firstName);
		    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(lastName); 
		    
		}



}



