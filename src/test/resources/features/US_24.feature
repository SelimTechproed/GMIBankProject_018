@CreateState
Feature: System should allow to create states info using api end point
  Scenario: US24 create a state
    Given US24 user sets the response using api end point "https://www.gmibank.com/api/tp-states" and creates state
    Then US24 user reads all states from end point "https://www.gmibank.com/api/tp-states"
    Then US24 user asserts for new state