@country_api_testing
Feature: Country Api Testing

  @read
  Scenario: Read
    Given read all countries and sets response using to api end point "https://www.gmibank.com/api/tp-countries"

  @create
  Scenario: Create
    And create a country "https://www.gmibank.com/api/tp-countries"

  @validate
    Scenario: Validate created
    Then validate created country

  @update
  Scenario Outline:  Update
    And update created country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

    Examples: Update country
      |name|id|
      |Nijerya|74441|

  @delete
  Scenario Outline: Delete countries
    Given deletes updated country using endpoint "<endPoint>" and its extension "<id>" and validate
    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/74441|


