@US_017
Feature:US_017 System should allow the Admin to manage users
  Background:Admin signs in and System should allow the Admin to manage users
  Scenario Outline:US_017 TC_for_"<role>" Admin can activate a role as "<role>"
    Given  user goes to "http://www.gmibank.com/login" page
    And   admin provides valid username for admin
    And   admin provides valid password for admin
    And   admin clicks sign in button for admin
    Then  admin creates one user from faker then selects one role as "<role>" from profiles dropdown and clicks save button
    Examples:
      |role|
      |ROLE-USER|
      |ROLE-EMPLOYEE|
      |ROLE-MANAGER|
      |ROLE-CUSTOMER|
      |ROLE-ADMIN|