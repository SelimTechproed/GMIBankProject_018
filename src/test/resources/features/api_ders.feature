@Api_Testing_ders
  Feature: Gmi Bank 4 Api Testing
   Scenario: Read all customer data and validate
   Given Gmi Bank user go to api end point "https://www.gmibank.com/api/tp-customers"
   And Gmi Bank read all customer and set create pojo class
   Then Gmi Bank Validate data



