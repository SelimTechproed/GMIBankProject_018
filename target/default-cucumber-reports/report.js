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
  "name": "US_005 TC_01 User should not be able to login with invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_005erol"
    },
    {
      "name": "@US_005-TC_01"
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
  "name": "user click to account menu",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
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
  "name": "user click on username checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_username_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a invalid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_enter_a_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on password checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_password_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_enter_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the user sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.verify_if_the_user_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "US_005 TC_02 User should not be able to login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_005erol"
    },
    {
      "name": "@US_005-TC_02"
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
  "name": "user click on username checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_username_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_enter_a_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on password checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_password_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_enter_a_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the user sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.verify_if_the_user_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "US_005 TC_03 User should not be able to login with invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_005erol"
    },
    {
      "name": "@US_005-TC-03"
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
  "name": "user click on username checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_username_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a invalid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_enter_a_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on password checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_click_on_password_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_05_StepDefinitions.user_enter_a_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the user sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_04_StepDefinitions.verify_if_the_user_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});