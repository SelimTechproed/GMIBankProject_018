@pdf_ders_bank8
Feature: Pdf Generator Bank8

  @pdf_generator
  Scenario Outline: pdf_ders_bank8 read some customers data and create pdf
    Given pdf_ders_bank8 user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And pdf_ders_bank8 user provides the query "<query>"

    Examples: pdf_ders_bank8 read the data
      |query|
      |Select * from tp_customer|