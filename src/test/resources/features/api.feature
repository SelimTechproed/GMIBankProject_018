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

  @CustomerApi3
  Scenario: three Read and validate all customer data
    Given three user read all customer and sets response using to api end point "https://www.gmibank.com/api/tp-customers"
    And three user deserialization customer data json to java pojo
    Then three user validates all customer data

  @CreateCountry
  Scenario Outline: create a country
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-countries" and creates country using "<idJson>" and "<nameJson>"
    Examples: create country
      |idJson|nameJson|
      |name|France|

  @ReadCountry
  Scenario: read all countries
    Given user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
    And user saves the countries to correspondent files
    Then user validates the countries

  @DeleteCountry
  Scenario Outline:  delete countries
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"
    Examples: multiple countries
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/57094|




  @CreateCountry2
  Scenario Outline: two create a country
    Given two user sets the response using api end point "https://www.gmibank.com/api/tp-countries" and creates country using "<type>" and "<country>"
    Examples: create country
      |type|country|
      |name  |Fizan|

  @ReadCountry2
  Scenario: two read all countries
    Given two user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
    Then two user validates the countries

  @UpdateCountry2
  Scenario Outline: two update country
    And two user updates a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

    Examples:
      |name|id|
      |Uzak Diyarlar|60108|


  @DeleteCountry2
  Scenario Outline: two delete countries
    Given two user deletes a country using endpoint "<endPoint>" and its extension "<id>"
    Examples: multiple countries
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/60110|


   @readData
    Scenario Outline: read all customer data info
     Given user gets all customer column data using "<query>" and "<columnName>"
     And user sets all customer info to coreepondent files
     Then  user validates all db customer info

     Examples: all
     |query |columnName|
     |Select * from tp_country|id|
     |Select * from tp_country|name|