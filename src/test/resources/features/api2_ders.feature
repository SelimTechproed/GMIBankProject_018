@country_api_testing_ders
Feature: Country Api Testing ders

  @read_ders
  Scenario: Read ders
    Given ders read all countries and sets response using to api end point "https://www.gmibank.com/api/tp-countries"

  @create_ders
  Scenario: Create
    And ders create a country "https://www.gmibank.com/api/tp-countries"

  @validate_ders
  Scenario: Validate created ders
    Then ders validate created country

  @update_ders
  Scenario Outline:  Update ders
    And ders update created country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

    Examples: Update country
      |name|id|
      |Nijerya|74443|

  @delete_ders
  Scenario Outline: Delete countries ders
    Given ders deletes updated country using endpoint "<endPoint>" and its extension "<id>" and validate
    Examples: Delete Country ders
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/74443|
