@userInfoDeneme
  Feature: User Info Functionality

    Background:
      When User goes to given url

      Scenario Outline: User info segment should be editable on Homepage
        When User login
        And  Click to "Account menu"
        And  Click to "User Info" button
        And  User fill out "<input>" boxes with valid "<info>" credentials
        And  Click to "langKey" dropdown

        Examples:
        | input      | info |
        | firstname  | Ahmet |
        | lastname   | Aslan |
        | email      | nunvav68@gmail.com |

