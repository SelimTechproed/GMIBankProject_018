@US20
Feature: "System should allow to read all customers info using api end point

  Scenario: TC001 : Read all customers
Given user sets all response using api endpoint "https://www.gmibank.com/api/tp-customers"
And user deserializers country data as json to java
Then user validates the data




