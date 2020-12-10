@US10AddressOfCustomerCanBeCreated
Feature: US10 Address of customer can be created Feature
  Background:US10 access login page
    Given US10 user on the login page "http://gmibank.com/login"
    And US10 send username to username box "team18_user"
    And US10 send password to password box "Team18user"
    And US10 click sign in
    And US10 click to my operations
    And US10 click to manage customers
    And US10 click to create a new customer

  @TC_01
   Scenario: TC_01 Adress should be provided and cannot be blank
    Given US10 click save button
    And US10 Verify adress box required message
    And US10 Send adress to adress box

  @TC_02
   Scenario: TC_02 City should be provided and cannot be blank
    Given US10 click save button
    And US10 Verify city box required message
    And US10 Send city name to city box

  @TC_03
   Scenario: TC_03 Country should be provided and cannot be blank
    Given US10 Select country name to country dropdown

  @TC_04
  Scenario: TC_04 State should be provided and cannot be blank
    Given US10 Send state name to state box


