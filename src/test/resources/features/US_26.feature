@US_26

Feature: US_26 System should allow to update countries using api end point

  Scenario Outline: User can just update each country
    Given use api end point "https://www.gmibank.com/api/tp-countries"
    And   users can update any country with endPoint "https://www.gmibank.com/api/tp-countries" "<newname>" and its id "<id>"

    Examples:
       |     newname       | id  |
       |     Urfali Pasa   | 1   |






