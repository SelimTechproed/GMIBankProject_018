@US_29
Feature: Validate All Data Performing With Data Testing

  Background:
    Given US29 user connects to GMIBank database

  @TC_2901
  Scenario: TC2901 All user's info should be retrieved by database and validated
    Given user should be reads all users data from database
    And user should be all users data validate

  @TC_2902
  Scenario: TC2902 All countries' info should be retrieved by database and validated
    Given user should be reads all countries data from database
    And user should be all countries data validate

  @TC2903
  Scenario: TC2903 All states should related to USA should be retrieved by database and validated
    Given user should be reads all states data of related to USA from database
    And user should be validate the data which all states of related to USA
    Then user should be exit GMIBank database