# QUESTION 2:
# URL : https://demoqa.com/registration/
# NOTE: Create a feature file for the firstname and lastname.

Feature: New User Registration

  Scenario Outline: Registration Verification Test
    Given User navigates to Registration Page
    Then User inputs "<Firstname>" and "<Lastname>" in the respective fields

    Examples: 
      | Firstname | Lastname |
      | Sathish   | Kumar    |
      | Shiva     | SK       |
