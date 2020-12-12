$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_19.feature");
formatter.feature({
  "name": "System should allow Admin to create a new Account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateNewAcountUS19"
    }
  ]
});
formatter.background({
  "name": "User goes to login admin page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "logs in user login page as admin",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.logs_in_user_login_page_as_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should create a description for the new account and it cannot be blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateNewAcountUS19"
    },
    {
      "name": "@US19_TC01"
    }
  ]
});
formatter.step({
  "name": "user clicks on My Operations",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_clicks_on_My_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Manage Account",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_clicks_on_Manage_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Create a new Account",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_clicks_on_Create_a_new_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user create a description \"MyAccount001\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_create_a_description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the balance box \"5500\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_fills_the_balance_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a valid account type from Account Type Drop-down \"CREDIT_CARD\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_selects_a_valid_account_type_from_Account_Type_Drop_down(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a valid account status type from Account Status Type Drop-down \"ACTIVE\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_selects_a_valid_account_status_type_from_Account_Status_Type_Drop_down(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a valid employee from Employee Drop-down",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_selects_a_valid_employee_from_Employee_Drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.user_clicks_on_the_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify transaction done",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_19_StepDefinitions.verify_transaction_done()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});