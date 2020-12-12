@CreateNewAcountUS19

Feature: System should allow Admin to create a new Account

  Background:
  Background: User goes to login page
    Given  user goes to login page


  @US19_TC01
  Scenario: User should create a description for the new account and it cannot be blank
    Given user clicks on My Operations
    And   user clicks on Manage Account
    And   user clicks on Create a new Account
    And   user create a description "Sample Account"

  @US19_TC02
  Scenario: User should provide a balance for the first time account creation as Dollar.
    Given user fills the balance box "$555"

  @US19_TC03
  Scenario: User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    Given user selects a valid account type from Account Type Drop-down "CREDIT_CARD"

  @US19_TC04
  Scenario: Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    Given user selects a valid account status type from Account Status Type Drop-down "ACTIVE"

  @US19_TC05
  Scenario: User can select an employee from the drop-down and click save button
    Given user selects a valid employee from Employee Drop-down
    And user clicks on the Save button

