@database
  Feature: database testing
    Background: create connection
      Given user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

    Scenario Outline: read and validate created data using with id
      And user reads the Customers data using "<query>" and "<columnName>"
      Then validate customers data

        Examples: demo read the data
        |query|columnName|
        |Select * from tp_customer|ssn|
