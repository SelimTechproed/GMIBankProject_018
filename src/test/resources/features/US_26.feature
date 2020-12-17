@US_26
Feature: US_26 System should allow to update countries using api end point
  Background:update all country
    Given use api end point "https://www.gmibank.com/api/tp-countries"
  @allCountry
  Scenario: TC_01 get all countries information as De-serialization
    And   get all countries information as De-serialization
    Then  find out how many countries and verify that there are number country

  @updateCountry
  Scenario Outline: TC_02 update first,second and last countries 1 by 1
    And   user updates a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

    Examples:
      |name|id|
      |TR|1|
      |BEL|2|
      |HOL|26677|