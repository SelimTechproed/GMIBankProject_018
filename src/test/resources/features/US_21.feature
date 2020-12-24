@countriesDBTest
Feature:US_21_Validate All Countries Info
  @allCountriesValidate
  Scenario: TC_01_In countries read all countries you created and validate them from your data set
    Given In countries user sets all response using end point "https://www.gmibank.com/api/tp-countries"
    And In countries user deserialization data json to java pojo
    And In countries user validates data.



