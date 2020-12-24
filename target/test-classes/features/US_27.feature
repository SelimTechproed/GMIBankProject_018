@US_27
  Feature: US_27 create and  delete state

 @US_27Createstate
   Scenario: TC_01 User can create a state
   Given user should create a state data from "https://www.gmibank.com/api/tp-states"
   Then user should create a state with  "<name>" and "<tpcountry>"


@US_27Deletestate

    Scenario Outline: TC_01 User can just delete each state 1 by 1
      Given user should be reads all states data from "https://www.gmibank.com/api/tp-states"
      And user should be delete a state with "<id>" and verify

      Examples:
        | id|
        |/61746|



