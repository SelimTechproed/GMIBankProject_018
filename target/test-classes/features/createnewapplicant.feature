
@createnewapplicant
Feature: Register Workflow
  Scenario: Register new users for GMI Bank
    Given user is on the registration page
    And   user enters ssn number as SSN
    Then  user enters firstname and lastname as firstname and lastname
    When  user provides address address
    Then  user provides mobilephone as mobilephone
    And   user provides a username username
    Then  user provides email id as email
    When  user enters the password as firstpassword
    And   user confirms the new password secondpassword
    Then  user clicks on register button and sees the success message as message