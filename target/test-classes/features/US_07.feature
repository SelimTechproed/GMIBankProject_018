@infoUpdate

Feature: User Info Functionality

  Background: User goes to login page
    Given  user goes to login page
    And    user provide valid username "ahmetbeyusername"
    And    user provide valid password "Ahmet2020."
    And    user click sign in button


  @emailInvalid
  Scenario Outline: TC_01_user can not update with invalid email address
    Given user click to account menu
    And   user click to user info
    And   user send "<userInfoUpdateEmailBox>" into the email box
    And   user click save button
    Then  user assert that user account can not update with invalid email address

    Examples:
      |userInfoUpdateEmailBox|
      |abcdefghgmail.com     |
      |abc..def@gmail.com    |
      |.abc@gmail.com        |
      |       @gmail.com     |
      |abcdef@gmail.         |
      |abc@gmail#arcihe.com  |
      |abcdef@gmail          |
      |abc@gmail..com        |

  @languageOption
  Scenario: TC_02_There should not be an option of any other language other than English or Turkish
    Given user click to account menu
    And   user click to user info
    And   user give an option language dropdown
    Then  user assert that there is no option other than English and Turkish

  @emaildeneme
  Scenario: TC_01_user can not update with invalid email address
    Given user click to account menu
    And   user click to user info
    And   user send  new email into the email box
    And   user click save button
    Then  user assert that user account can not update with invalid email address


