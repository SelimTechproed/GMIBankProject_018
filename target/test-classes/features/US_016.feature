@US_016 @All_Account_Test
Feature: US_16 tests

  Background: user goes gmibank homepage
    Given user goes to gmibank homepage
    And user goes to entry
    And user goes to signIn page
    And user logs in with the valid username "aaabbb"
    And user logs in with the valid password "AaaBbb-21"
    And user clicks signIn button
    Then user should goes My Operations box

  @TC1601
  Scenario: TC1601 User should have at least 2 accounts
    Given user should goes My Accounts box
    And user verify Account Type1 "19669"
    And user verify Account Type2 "19670"
    Then user signOut from the page

  @TC1602
  Scenario: TC1602 User can select the first account
    Given user should clicks Transfer Money box
    And user should selects and clicks first account
    And user should verify the selected account
    Then user signOut from the page


  @TC1603
  Scenario: TC1603 User can select a balance that they want to proceed with
    Given user should clicks Transfer Money box
    And user should selects and clicks first account
    And user should selects and clicks other account
    And user should sends and clicks "120" to Balance
    And user should clicks and verify the amount
    Then user signOut from the page

  @TC1604
  Scenario: TC1604 User should provide a description for that transfer
    Given user should clicks Transfer Money box
    And user should selects and clicks first account
    And user should selects and clicks other account
    And user should sends and clicks "90" to Balance
    And user should sends "Monthly Transfer" to Description
    Then user signOut from the page

  @TC1605
  Scenario: TC1605 User can make sure transfer is done successfully validating the message an amount of the transaction"
    Given user should clicks Transfer Money box
    And user should selects and clicks first account
    And user should selects and clicks other account
    And user should sends and clicks "75" to Balance
    And user should sends "Weekly Transfer" to Description
    And user should goes Make Transfer box
    And user should goes My Operations box
    And user should goes My Accounts box
    And user should clicks View Transaction box
    And user verify the transaction is successful
    Then user signOut from the page
