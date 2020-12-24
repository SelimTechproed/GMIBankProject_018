@US_015 @All_Account_Test
Feature: US_015 User Should See All Account Type


  Background: user goes gmibank homepage
    Given user goes to gmibank homepage
    And user goes to entry
    And user goes to signIn page
    And user logs in with the valid employee username "team18_employee"
    And user logs in with the valid employee password "Team18employee"
    Then user clicks signIn button


  @TC_1501
  Scenario: TC1501 User should sees all account types and balance populated
    Given user should goes My Operations box
    And user should goes Manage Accounts box
    And user should sees all Account Types
    And user should sees all Balance
    Then user signOut from the employee page



  @TC_1502
  Scenario: TC1502 User can view transaction
    Given user should goes My Operations box
    And user should goes Manage Accounts box
    And user should clicks and sees View Transaction
    Then user signOut from the employee page


