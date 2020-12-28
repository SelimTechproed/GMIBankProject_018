@AllCustomerApi
Feature: Gmi Bank All Customer Info

  @CustomerApi
  Scenario: US23 Read and validate all customer data
    Given US23 user read all customer and sets response using to api end point "https://www.gmibank.com/api/tp-customers"
    And US23 user deserialization customer data json to java pojo
    Then US23 user validates all data