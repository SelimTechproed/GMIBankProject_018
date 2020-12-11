@US09_createANewCustomer
   Feature: US09 Create A New Customer Feature
     Background:US09 access login page
       Given US09 user on the login page "http://gmibank.com/login"
       And US09 send username to username box "team18_user"
       And US09 send password to password box "Team18user"
       And US09 click sign in
       And US09 click to my operations
       And US09 click to manage customers
       And US09 click to create a new customer

     @TC_01
     Scenario: TC_01 send valid SSN numbers and search a new applicant
       Given US09 TC01 type a valid SSN "154-12-9000"
       And US09 TC01 click search button
       And US09 verify search button

     @TC_02
     Scenario: TC_02 user can see all their registration
       Given US09 TC01 type a valid SSN "154-12-9000"
       And US09 TC01 click search button
       And US09 getAttribute from firstname box
       And US09 getAttribute from lastname box
       And US09 getAttribute from email box
       And US09 getAttribute from mobile phone number box
       And US09 getAttribute from phone number box
       And US09 getAttribute from phone ssn box



