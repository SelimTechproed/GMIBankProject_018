@database_ders
Feature: database testing ders
  Background: create connection ders
    Given ders user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

  Scenario Outline: read and validate created data using with ssn
    And ders user reads the Customers data using "<query>" and "<columnName>"
    Then ders validate customers data

    Examples: demo read the data
      |query|columnName|
      |Select * from tp_customer|ssn|