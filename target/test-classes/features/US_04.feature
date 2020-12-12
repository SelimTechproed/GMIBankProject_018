
Feature: Login page

  @TC01Erol
  Scenario: TC_01 User should be able to login with valid credentials
    Given user go to "https://gmibank.com/"
    And user click on account menu button
    And user click on sign in button
    And user send valid user_username to usernamebox
    And user send valid user_password  to passwordbox
    And user click on SignIn button
    Then verify if the user sign in