@us_11
Feature: us_11 tests
  Background: user enters gmibank homepage
    Given user enters gmibank homepage
    And user clicks entry button
    And user clicks  signIn link
    And user enters admin username "team18_admin"
    And user enters admin password "Team18admin"
    And user clicks signIn button
    And user clicks myOperations link
    And user clicks manageCostomers link
    Then user clicks createNewCustomer link

  @tc11_01
  Scenario Outline: Create Date negative test (for in the past)
    Given user send data to date box "<Create Date> "
    Then user verifies valid data entry to Create Date box
    Then user signOut
    Examples: Test Dates
      | Create Date |
      | 12.12.2015 12:00 |
      | 01.20.2020 11:15 |

  @tc11_02
  Scenario Outline: TC_1102 Date format negative test
    Given user send invalid data format to date box "<Create Date Invalid>"
    Then user verifies invalid data entry to Create Date box
    Then user signOut
    Examples: Test Dates
      | Create Date Invalid |
      | 01.12.2020 |
      | 01.20.2021 11 |
      | 11.2021 09:30 |

  @tc11_03
  Scenario Outline: TC_1103 Date format positive test
    Given user send valid data format to date box "<Create Date Valid>"
    And user verifies valid date format to Create Date box
    Then user signOut
    Examples: Test Dates
      | Create Date Valid |
      | 12.30.2020 12:00 |
      | 01.21.2021 11:15 |


  @tc11_04
  Scenario: User positive test
    Given user select a user from dropbox
    And user verifies a user can be selected
    Then user signOut

  @tc11_05
  Scenario: Account positive test
    Given user select an account from dropbox
    And user verifies an account can be selected
    Then user signOut


  @tc11_06
  Scenario: Zelle Enrolled option checkbox positive test
    Given user select Zelle Enrolled checkbox
    And user clicks on save button
    And user verifies is selected
    Then user signOut








