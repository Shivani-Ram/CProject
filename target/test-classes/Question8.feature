Feature: Login to the application under test.

@Smoke
  Scenario: Login to the application.
    Given user will open the Chrome browser and launch the facebook application.
    When user will enter the username into the UserName field.
    And user enters the password into the Password field.
    And user clicks on the Login button.
    Then validate if the user login is successful.

@Regression
  Scenario: To verify the login with valid username and invalid password
    Given User should launch browser
    And User will hit the URL
    When User will enter the username and password
    And User will click the login button
    Then User should be displayed with the error page
