@api_testing_ders_1
  Feature: Api testing ders 1

    @Customer_validation
    Scenario: Read and validate customer data
      Given read all customer data using with api endpoint "https://www.gmibank.com/api/tp-customers"
      Then validate customer data

    @read_country
    Scenario: read countries
      Then read all countries and write country ids to txt using api endpoint "https://www.gmibank.com/api/tp-countries"


    @create_country
    Scenario: Create a country
      And create country "https://www.gmibank.com/api/tp-countries"


    @@validate_country
    Scenario: Validate created country
      Then validate created a country

    @update_country
    Scenario Outline:  Update country
      And update created a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

      Examples: Update country
        |name|id|
        |Guncellenmis Ulke|93277|

    @delete_country
    Scenario Outline: Delete country
      Given delete updated a country using endpoint "<endPoint>" and its extension "<id>" and validate
      Examples: Delete Country ders
        |endPoint                                |id    |
        |https://www.gmibank.com/api/tp-countries|/93277|