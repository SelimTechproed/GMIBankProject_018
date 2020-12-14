@UserStory3

Feature: Regristration page should restrict password usage to a secure high level passcode

  Background: User got to the GMI Bank home page (https://gmibank.com)
    Given User go to the GMi Bank home page
    And Click on user button
    And You should navigate to registration page
    And Click on Password textbox

  @UserStory3-01
  Scenario: There should be at least 1 lowercase char for stronger password and see the level chart change accordingly
    And Enter a password with 1 lowercase letter of at least 7 characters
    And Color line must be orange or green
    And Click on password confirmation textbox
    Then Enter to second textbox with 1 lowercase letter of at least 7 characters

  @UserStory3-02
  Scenario: There should be at least 1 uppercase char and see the level  chart change accordingly
    And Enter a password with 1 uppercase letter of at least 7 characters
    And Color line must be orange or green
    And Click on password confirmation textbox
    Then Enter to second textbox with 1 uppercase letter of at least 7 characters

  @Userstory3-03
  Scenario: There should be at least 1 digit  and see the level  chart change accordingly
    And Enter a password with 1 digit of at least 7 characters
    And Color line must be orange or green
    And Click on password confirmation textbox
    Then Enter to second textbox with 1 digit of at least 7 characters

  @Userstory3-04
  Scenario: There should be at least 1 special char and see the level bar change accordingly
    And Enter a password with 1 special char of at least 7 characters
    And Color line must be orange or green
    And Click on password confirmation textbox
    Then Enter to second textbox with 1 special char of at least 7 characters

  @UserStory-05
  Scenario: There should be at least 7 chars for a stronger password
    And Enter a password with 7 chars
    And Color line must be orange or green
    And Click on password confirmation textbox
    Then Enter to second textbox a password with 7 chars