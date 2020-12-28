@CreateCountryOne
Feature: System should allow to create country info using api end point
  Scenario: US25 create a create country
    Given US25 user sets the response using api end point "https://www.gmibank.com/api/tp-countries" and creates country
    Then US25 user reads all countries from end point "https://www.gmibank.com/api/tp-countries"
    Then US25 user asserts for new country
