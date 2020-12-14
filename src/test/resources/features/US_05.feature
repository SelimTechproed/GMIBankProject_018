@US_005erol
Feature: Login page

  @US_005-TC_01
  Scenario: US_005 TC_01 User should not be able to login with invalid username and valid password
    Given user go to "https://gmibank.com/"
    And user click to account menu
    And user click on sign in
    And user click on username checkbox
    And user enter a invalid username
    And user click on password checkbox
    And user enter a valid password
    And user click on Sign in button
    Then verify if the user sign in

  @US_005-TC_02
  Scenario: US_005 TC_02 User should not be able to login with valid username and invalid password
    Given user go to "https://gmibank.com/"
    And user click on account menu
    And user click on sign in
    And user click on username checkbox
    And user enter a valid username
    And user click on password checkbox
    And user enter a invalid password
    And user click on Sign in button
    Then verify if the user sign in

  @US_005-TC-03
  Scenario: US_005 TC_03 User should not be able to login with invalid username and password
    Given user go to "https://gmibank.com/"
    And user click on account menu
    And user click on sign in
    And user click on username checkbox
    And user enter a invalid username
    And user click on password checkbox
    And user enter a invalid password
    And user click on Sign in button
    Then verify if the user sign in

  @US_005-TC-04
  Scenario: US_005 TC_04 User with invalid credentials should be given an option to reset their password
    Given user go to "https://gmibank.com/"
    And user click on account menu
    And user click on sign in
    And user click on username checkbox
    And user enter a valid username
    And user click on password checkbox
    And user enter a invalid password
    And user click on Sign in button
    Then user click on option to "Did you forget your password?" to reset password

  @US_005-TC-05
  Scenario: US_005 TC_05 User should be given the option to navigate to registration page if they did not register yet
    Given user go to "https://gmibank.com/"
    And user click on account menu
    And user click on sign in
    Then user click on option to "Register a new account" to register
