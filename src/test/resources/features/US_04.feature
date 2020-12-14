
@US_004erol
Feature: Login page


  @US_004-01
  Scenario:US_004 TC_01 User should be able to login with valid credentials
    Given user go to  "https://gmibank.com/"
    And user click on account menu
    And user click on sign in
    And user enter a valid username to usernamebox
    And user enter a valid password  to passwordbox
    And user click on Sign in button
    Then verify if the user sign in

  @US_004-02
  Scenario:US_004 TC_02 User should be able to cancel to login

    Given user go to  "https://gmibank.com/"
    And user click on account menu
    And user click on sign in
    And click on cancel button
    Then verify if the user cancel