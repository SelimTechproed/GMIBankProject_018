@AllCustomerApi
Feature: Gmi Bank All Customer Info

  @CustomerApi
  Scenario: Read and validate all customer data
    Given user read all customer and sets response using to api end point "https://www.gmibank.com/api/tp-customers"
    And user deserialization customer data json to java pojo
    Then user validates all data

  @CountryApi
  Scenario: Read and validate all country data
    Given user read all country and sets response using to api end point "https://www.gmibank.com/api/tp-countries"
    And user deserialization country data json to java pojo
    Then user validates all country data

  @CustomerApi2
  Scenario: two Read and validate all customer data
    Given two user read all customer and sets response using to api end point "https://www.gmibank.com/api/tp-customers"
    And two user deserialization customer data json to java pojo
    Then two user validates all customer data