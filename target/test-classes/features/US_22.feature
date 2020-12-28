@us22statesTests
Feature: System should allow to read all states info using api end point
  Scenario: Read all states you created and validate them from your data set
    Given user gets all data for states using api end point "https://www.gmibank.com/api/tp-states"
    And user deserializes states data as json to java pojo
    Then user validates the data for states