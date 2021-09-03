# QUESTION 5:
# URL : https://www.facebook.com/
# NOTE: Execute the feature file of login page with one scenario outline.

Feature: Login Verification

  Scenario Outline: Multiple Users Login Test
    Given user will open the Chrome browser and launch the facebook application.
    When User inputs "<Username>" and "<Password>" in the respective fields
    And user clicks on the Login button.
    Then validate if the user login is successful.

    Examples: 
      | Username | Password     |
      | Selenium | Selenium@123 |
      | Java     | Java@123     |
