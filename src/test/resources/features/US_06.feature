@UserInfo06

Feature: User Info Functionality

  Background: User goes to login page
     Given  user goes to login page
      And   user provide valid username "ahmetbeyusername"
      And   user provide valid password "Ahmet2020."
      And   user click sign in button


    @TC_002
    Scenario: US_006 TC_002
      Given user click to account menu
      And   user click to user info
      Then  Verify languages are available English and Turkish


      @TC_003
    Scenario: US_006 TC_003
      Given user click to account menu
      And   user click to user info
      And   Click in the firstname box and type a new firstname
      And   user click save in button
      Then  Verify that my firstname  have been updated

  @TC_004
  Scenario: US_006 TC_004
    Given user click to account menu
    And   user click to user info
    And   Click in the lastname box and type a new lastname
    And   user click save in button
    Then  Verify that my lastname  have been updated

  @TC_005
  Scenario: US_006 TC_005
    Given user click to account menu
    And   user click to user info
    And   Click on the mailbox and type in a new email address
    And   user click save in button
    Then  Verify update by adding "@" sign and ".com" extension to your email


