@US_12
Feature: Gmi Bank
  Background: Gmi Bank Startseite
    Given Benutzer geht zu "https://gmibank.com/"
    And Benutzer sendet einen gültigen Benutzernamen "team18_employee"
    And Benutzer sendet ein gültiges Passwort "Team18employee"
    And Benutzer klickt auf die login button
    And Benutzer klickt auf My Operations
    And Benutzer klickt auf Button Manage Custormes
  @US_12-TC_01
  Scenario:"First Name Last Name Middle.." im Model Costumers anzeigt werden soll
    Given Benutzer muss Id sehen
    And Benutzer muss First Name sehen
    And Benutzer muss Last Name sehen
    And Benutzer muss Middle Initial sehen
    And Benutzer muss Email sehen
    And Benutzer muss MobilePhone Number sehen
    And Benutzer muss Phone Number sehen
    And Benutzer soll Adress sehen
    Then Benutzer muss Create Date sehen
  @US_12-TC_02
  Scenario:"Die Button view,Edit,Delete sollten anklickbar und auf der Kundenseite sichtbar sein
    Given Benutzer sieht und klickt auf die View
    And Benutzer sieht und klickt auf die Edit
    Then Benutzer sieht und klickt auf die Delete
  @US_12-TC_03
  Scenario: Die Button View Bearbeiten geben, über die alle Kundeninformationen ausgefüllt werden können
    Given Benutzer sieht und klickt auf die View
    And Benutzer sieht und klickt auf die Button Edit
  @US_12-TC_04
  Scenario: The Edit portal can allow user to create or update the user info
    Given Benutzer sieht und klickt auf die Edit
    And Benutzer muss Id Nummer geben
    And Benutzer muss First Name geben
    And Benutzer muss Last Name geben
    And Benutzer muss Middle Initial geben
    And Benutzer muss Email geben
    And Benutzer muss MobilePhone Number geben
    And Benutzer muss Phone Number geben
    And Benutzer soll Adress geben
    Then Benutzer muss Create Date geben