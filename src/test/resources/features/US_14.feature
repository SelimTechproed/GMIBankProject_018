@datecreate
Feature:US_015_Date creation

  Background: US_015 Create a new account
    Given Go to the sign in page
    And Type username and password than click on sign in button
    And Click on My Operations dropdown menu


  @datepositive
  Scenario: TC_001 Date create for account positive
    And Click on Manage Accounts
    And Click on +Create a new Account
    And Click on the Create Date textbox and type the time of account creation
    And Click on the Closed Date textbox and type the time later than the time of account creation
    Then Verify that Create Date and Closed Date created successfully

  @datenegative
  Scenario: TC_002 Date create for account negative
    And Click on Manage Accounts
    And Click on +Create a new Account
    And Click on the Create Date textbox and type the  date earlier at the time of account creation
    And Click on the Closed Date textbox and type the time later than the time of account creation
    Then Verify that Create Date and Closed Date not created successfully

  @dateformatpositive
  Scenario: TC_003 Date format for account positive test
    And Click on Manage Accounts
    And Click on +Create a new Account
    And Click on the Create Date textbox and type date as month,day,year,hour and minute
    Then Verify that the date created succesfully

  @dateformatnegative
  Scenario: TC_004 Date format for account negative test
    And Click on Manage Accounts
    And Click on +Create a new Account
    And Click on the Create Date textbox and type date as month,day,year
    Then Verify that the date not created succesfully

  @customeruserbox
  Scenario: TC_005
    And Click on Manage Customer
    And Click on +Create a new Custumer
    And Click on the SSN textbox and type a valid SSN number and Click on the Search button
    Then Verify that User box is not blank

  @accountinfo
  Scenario: TC_006 An account info
    And Click on Manage Accounts
    And Click an ID item to choose an account created on manage accounts
    Then Verify Account




  @demo
  Scenario: employee selects accounts
    And Click on Manage Customer
    And Click on +Create a new Custumer
    And Type valid SSN "842-73-9072"
    And Type Middle Initial "1234"
    And Type Phone Number "121-121-1122"
    And Type zip code "23232"
    And Type city to city box "Lahey"
    And Select accounts
    Then click save




