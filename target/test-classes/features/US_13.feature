@createaccount
Feature: US_014 Create Account

  Background: Create a new account
    Given Go to the sign in page
    And Type username and password than click on sign in button
    And Click on My Operations dropdown menu
    And Click on Manage Accounts
    And Click on +Create a new Account

  @descriptions
  Scenario: TC_01 Description text box should not be blank
    And Click on Descriptions text box and type some descriptions in the text box
    Then user should not see the error message.

  @balance
  Scenario: TC_02 Provide a balance for the account creation
    And Click on Balance text box and Type a balance in the text box
    Then user should not see the error message for balance text box.

  @accounttype
  Scenario: TC_03 User selects an account type
    Then Select an account type as CHECKING, SAVING,CREDIT_CARD or INVESTING

  @accountstatus
  Scenario: TC_04 User defines an account status
    Then Select an account status type from the Account Status Type dropdown and verify

  @employee
  Scenario: TC_05 User selects an employee
    Then Select an employee from the Employee dropdown and verify

  @accountsave
  Scenario: TC_06 User creates account successfully
    And Click on Descriptions text box and type some descriptions in the text box
    And Click on Balance text box and Type a balance in the text box
    And Select an account type as CHECKING, SAVING,CREDIT_CARD or INVESTING
    And Select an account status type from the Account Status Type dropdown and verify
    And Click on the Create Date textbox and type the time of account creation
    And Click on the Closed Date textbox and type the time later than the time of account creation
    And Select an employee from the Employee dropdown and verify
    Then Click save button