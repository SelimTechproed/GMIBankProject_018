@database_ders_bank7
Feature: database testing ders bank7
  Background: create connection ders bank7
    Given database ders bank7 user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

  Scenario Outline: database ders bank7 read and validate created data using with ssn
    And database ders bank7 user reads the Customers data using "<query>" and "<columnName>"
    Then database ders bank7 validate customers data

    Examples: database ders bank7 demo read the data
      |query|columnName|
      |Select * from tp_customer|ssn|