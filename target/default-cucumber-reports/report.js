$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_20.feature");
formatter.feature({
  "name": "\"System should allow to read all customers info using api end point",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US20"
    }
  ]
});
formatter.scenario({
  "name": "TC001 : Read all customers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US20"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user sets all response using api endpoint \"https://www.gmibank.com/api/tp-customers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.com.stepdefinitions.US_20_StepDefinitions.user_sets_all_response_using_api_endpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deserializers country data as json to java",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.com.stepdefinitions.US_20_StepDefinitions.user_deserializers_country_data_as_json_to_java()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the data",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.com.stepdefinitions.US_20_StepDefinitions.user_validates_the_data()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});