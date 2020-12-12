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
  "name": "",
  "description": "  Background: User goes to login page",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
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
