$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_05.feature");
formatter.feature({
  "name": "Login page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US_005erol"
    }
  ]
});
formatter.scenario({
  "name": "US_005 TC_05 User should be given the option to navigate to registration page if they did not register yet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_005erol"
    },
    {
      "name": "@US_005-TC-05"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to \"https://gmibank.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_go_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on account menu",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.user_click_on_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on sign in",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.user_click_on_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on option to \"Register a new account\" to register",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_option_to_to_register(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});