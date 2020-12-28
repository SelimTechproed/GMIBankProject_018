@demo_presentation
  Feature: demo presentation

@demo_read_country
    Scenario: demo Read country
      Given demo read all country and sets response using to api end point "https://www.gmibank.com/api/tp-countries"
      And demo user send all country data in a file and validate

@demo_create_country
    Scenario: demo Create country
      And demo user create a country using to api end point "https://www.gmibank.com/api/tp-countries"

@demo_database
    Scenario Outline: demo read country data and validate created country using with id
      Given demo user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And demo user provides the query "<query>" and "<columnName>"
      Then demo validate created country with 64271

      Examples: demo read the data
        |query|columnName|
        |Select * from tp_country|id|



@demo_update_country
    Scenario Outline: demo Update country
     And demo user updates a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

     Examples: Update country
     |name|id|
     |Nijerya|64271|

@demo_delete_country
    Scenario Outline: demo Delete countries
      Given demo user deletes a country using endpoint "<endPoint>" and its extension "<id>"
      Examples: Delete Country
        |endPoint                                |id    |
        |https://www.gmibank.com/api/tp-countries|/64271|


@demo_pdf
    Scenario Outline: demo read first five customer data
      Given demo pdf user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And demo pdf user provides the query "<query>"

  Examples: demo read the data
    |query|
    |Select * from tp_customer|
