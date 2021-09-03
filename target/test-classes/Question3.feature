# QUESTION 3:
# URL : https://demoqa.com/registration/
# NOTE: Create a feature file for registration form.

Feature: New User Registration

  Scenario: Registration Verification Test
    Given user will launch the chrome browser
    And navigates to the Registration Page
    When the user enters the first name and last name in the respective fields.
    And user enters the Address and Email address
    And user enters a Phone
    And user selects a Gender
    And user selects a Hobbies
    And user selects a Languages
    And user selects a Skills
    And user selects a Country
    And user selects a Select Country
    #And user selects a Year
    #And user selects a Month
    #And user selects a Day
    And user selects a Date Of Birth
    And user enters the Password
    And user enters the Confirm Password
    And user will click on the Submit button
    Then validate if the user registration is successful.

    
    