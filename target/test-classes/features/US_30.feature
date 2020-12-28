@US_30
Scenario Outline:  read first five customer data
   Given pdf user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And pdf user provides the query "<query>"

   Examples: demo read the data
   |query|
   |Select * from tp_customer|