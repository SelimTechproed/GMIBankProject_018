@US_02
Feature: US_002 Any field on the registration page should not be left blank
  Background: All custumer registration tests common links
    Given user is on "http://gmibank.com/" page
    And user click on User button
    And user clicks Registration tab
  @US02TC01
  Scenario Outline: US02TC01 SSN Text Box Test
    And click on SSN TextBox
    Then user enters a invalid SSN number "<SSNnumber>"
    Examples: Test data for data tables
      | SSNnumber  |
      | 123-567856 |
      | 76856-9877 |
      | 538474998  |
  @US02TC02
  Scenario Outline: US02TC02 First Name TextBox Test
    And click on First Name TextBox
    Then user enters a invalid First Name "<First Name>"
    Examples: Test data for data tables
      | First Name |
      |            |
  @US02TC03
  Scenario Outline: US02TC03 Last Name TextBox Test
    And click on Last Name TextBox
    Then user enters a invalid Last Name "<Last Name>"
    Examples: Test data for data tables
      | Last Name |
      |           |
  @US02TC04
  Scenario Outline: US02TC04 Address TextBox Test
    And click on Address TextBox
    Then user enters invalid Address "<Address>"
    Examples: Test data for data tables
      | Address |
      |         |
  @US02TC05
  Scenario Outline: US02TC05 Mobile Phone Number TextBox Test
    And click on Mobile Phone Number TextBox
    Then user enters a invalid Mobil Phone Number "<Mobile Phone Number>"
    Examples: Test data for data tables
      | Mobile Phone Number |
      |                     |
      | 2345698760          |
      | 123-3938393         |
  @US02TC06
  Scenario Outline:US02TC06 Username TextBox Test
    And click on Username TextBox
    Then user enters invalid username "<Username>"
    Examples: Test data for data tables
      | Username |
      |          |
  @US02TC07
  Scenario Outline:US02TC07 Email TextBox Test
    And click on Email TextBox
    Then user enters invalid Email "<Email>"
    Examples: Test data for data tables
      | Email       |
      | olmazboyle@    |
      | olmazboyle.com |
  @US02TC08
  Scenario Outline: US02TC08 New password TextBox Test
    And click on New password TextBox
    Then user enters invalid New password "<New password>"
    Examples: Test data for data tables
      | New password |
      |              |
      | 000          |
      | 1            |
      | 123          |
  @US02TC09
  Scenario: US02TC09 Password strength level must be strong test
    And Password strength level must be strong
  @US02TC010
  Scenario Outline: US02TC010 New password confirmation TextBox Test
    And click on New password confirmation TextBox
    Then user enters invalid New password confirmation "<New password confirmation>"
    Examples: Test data for data tables
      | New password confirmation |
      |                           |
      | 000                       |
      | 1                         |
      | 123                       |
  @US02TC011
  Scenario: US02TC011 New password confirmation TextBox Test
    Then user clicks the Register button
  @US02TC012
  Scenario Outline: US02TC012 user must enter valid data into SSN TextBox using "-" character.
    And new click on SSN TextBox
    And the user must type the character "<Tire>" - when entering a number into the current SSN TextBox.
    Then ssn the user should not see the text "Your SSN is invalid"
    Examples: Test data for data tables
      | Tire        |
      | 123-765423  |
      | 60045-2347  |
      | 999-99-1111 |
      | 999-99-9999 |
  @US02TC013
  Scenario Outline: US02TC013 user must enter valid data in Mobile Phone Number TextBox using "-" character.
    And new click on Mobile Phone Number TexttBox
    And user must type the"<Tire>" character - when entering a number into the valid Mobile Phone Number TextBox
    Then mobil the user should not see the text "Your mobile phone number is invalid".
    Examples: Test data for data tables
      | Tire         |
      | 980678-4554  |
      | 980-6784554  |
  @US02TC014
  Scenario Outline: US02TC014 user must enter valid data in Email TextBox using "@" character and ".com" expression
    And new click on Email TextBox
    And the user is entering a valid Email TextBox Email Must use"<email charecter>" @  character and .com expression in TextBox
    Then email the user should not see the text "This field is invalid".
    Examples:Test data for data tables
      | email charecter    |
      | abc_00gmail.com    |
      | abc_00@gmail       |
      | abc_00@gmail.com   |