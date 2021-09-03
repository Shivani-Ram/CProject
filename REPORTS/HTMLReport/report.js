$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Question8.feature");
formatter.feature({
  "name": "Login to the application under test.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to the application.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user will open the Chrome browser and launch the facebook application.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition3.user_will_open_the_Chrome_browser_and_launch_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter the username into the UserName field.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_will_enter_the_username_into_the_UserName_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password into the Password field.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_enters_the_password_into_the_Password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate if the user login is successful.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.validate_if_the_user_login_is_successful()"
});
formatter.result({
  "status": "passed"
});
});