#QUESTION 7:
#URL : https://demoqa.com/registration/
#NOTE: Execute feature file for registration form with one scenario outline.

Feature: New User Registration

  Scenario Outline: Registration Verification Test
    Given user will launch the chrome browser
    And navigates to the Registration Page
    Then User inputs "<Firstname>" and "<Lastname>" in the respective fields
    #When the user enters the first name and last name in the respective fields.
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

    Examples: 
      | Firstname | Lastname |
      | Sathish   | Kumar    |
      | Shiva     | SK       |
