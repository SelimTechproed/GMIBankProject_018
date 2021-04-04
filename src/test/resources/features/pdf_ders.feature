@pdf_ders
  Feature: Pdf generator

    @pdf
    Scenario Outline: read some customers data and create pdf
      Given pdf_ders user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And pdf_ders user provides the query "<query>"

      Examples: demo read the data
        |query|
        |Select * from tp_customer|
