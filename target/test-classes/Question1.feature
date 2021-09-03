# QUESTION 1:
# URL : https://www.facebook.com/
# NOTE: Create a feature file for facebook login page.

Feature: Login to the application under test.

  Scenario: Login to the application.
    Given user will open the Chrome browser and launch the facebook application.
    When user will enter the username into the UserName field.
    And user enters the password into the Password field.
    And user clicks on the Login button.
    Then validate if the user login is successful.
