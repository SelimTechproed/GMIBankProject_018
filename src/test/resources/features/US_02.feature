@createregistration
Feature:US_002 Create Regester
  Background: Create a new register
    Given Go to registration page "http://gmibank.com/account/register"
  @demo
  Scenario: TC_demo User should type uniqe SSN
    And Type a valid SSN "842-73-9072"
    And Type firstname "Team02"
    And Type  lastname "Europe"
    And Type address "Lahey/Netherland"
    And Type valid mobile phone number "444-555-6666"
    And Type username "Team02halleder"
    And Type  email "team02@gmail.com"
    And Type valid password "Team.02"
    And Type valid  password confirmation "Team.02"
    And Click register button
    Then Verify the user register is not success
  @address
  Scenario: TC_01 User should not see the success message when don't typing address
    And Type a valid SSN "876-13-9772"
    And Type firstname "Sami"
    And Type  lastname "Kacmaz"
    And Do not enter anything in address box
    And Type valid mobile phone number "444-666-7777"
    And Type username "Samibulur"
    And Type  email "sami@gmail.com"
    And Type valid password "Sami.25"
    And Type valid  password confirmation "Sami.25"
    And Click register button
    Then Verify the user register is not success
  @phone
  Scenario:TC_02 User should not see the success message when don't typing mobile phone number
    And Type a valid SSN "876-24-9952"
    And Type firstname "Sami Can"
    And Type  lastname "Kacmaz"
    And Type address "Amsterdam/Hollanda"
    And Do not enter anything in  mobile phone number text box
    And Type  username "Samiyolcu"
    And Type email "samican@gmail.com"
    And Type valid password "Sami.2525"
    And Type valid  password confirmation "Sami.2525"
    And Click register button
    Then Verify the user register is not success
  @lastname
  Scenario:TC_03 User should see the red box when don't typing last name
    And Type a valid SSN "876-32-9765"
    And Type firstname "Sami Eren"
    And Do not enter anything in  last name text box
    And Type address "Rotterdam-Netherland"
    And Type mobile phone number "444-666-7777"
    And Type  username "Samizaman"
    And Type email "samican@gmail.com"
    And Type valid password "Sami.23"
    And Type valid  password confirmation "Sami.23"
    And Click register button
    Then Verify the message "Your Last Name is required"
  @SSN
  Scenario Outline: TC_04 User should see the red box when  typing  any of the punctuation marks or space except "-" in SSN
    And Type any of the punctuation marks except "-" between the numbers in SSN "<SSN>"
    And Type firstname "Ali"
    And Type  lastname "KaLmaz"
    And Type address "Lahey/Netherland"
    And Type valid mobile phone number "444-666-7779"
    And Type username "Alibulur"
    And Type  email "ali@gmail.com"
    And Type valid password "Ali.25"
    And Type valid  password confirmation "Ali.25"
    And Click register button
    Then Verify the red box which has alert "Your SSN is invalid"
    Examples:
      | SSN            |
      | 874 42 9756    |
      | 875 43 9756    |
      | 879 44 9756    |

  @phonenumber
  Scenario Outline: TC_05 User should see the red box when  typing  any of the punctuation marks or space  except "-" in moble phone number
    And Type a valid SSN "<SSN>"
    And Type firstname "<firstname>"
    And Type  lastname "<lastname>"
    And Type address "<address>"
    And Enter  any of the punctuation marks except "-" between the numbers in mobile phone number text box "<phone>"
    And Type  username "<username>"
    And Type email "<email>"
    And Type valid password "<password>"
    And Type valid  password confirmation "<confirm>"
    And Click register button
    Then Verify the red box which has alert "Your mobile  phone number is invalid"
    Examples:
      | SSN        |firstname  |lastname|   address       |phone          |username  |    email          |password|confirm |
      |836-65-9757 | Ali Riza  |Kalmaz  | Lahey/Netherland| 444/666/7774  |Aliibulur |aliiriza@gmail.com | Ali.25 | Ali.25 |
      |837-66-9957 |Ali Kemal  |Kalir   | Balk/Netherland | 444 666 7774  |Alibulur  |aliriza@gmail.com  | Ali.259| Ali.259|

  @defectemail
  Scenario:TC_06 User should see the red box when  typing  without "@"  mark
    And Type a valid SSN "876-32-9750"
    And Type firstname "Ali Aydın"
    And Type  lastname "Konar"
    And Type address "Lahey-Netherland"
    And Type mobile phone number "444-666-7767"
    And Type  username "Alikonar"
    And Enter an email id without -@- mark "aliikonargmail.com"
    And Type valid password "Ali.25"
    And Type valid  password confirmation "Ali.25"
    And Click register button
    Then Verify the red box which has alert "This field is invalid"

  @missingemail
  Scenario Outline:TC_07 User should see the red box when typing which is extention is ".c" after "@" mark
    And Type a valid SSN "<SSN>"
    And Type firstname "Ali Aydın"
    And Type  lastname "Konar"
    And Type address "Lahey-Netherland"
    And Type mobile phone number "444-666-7767"
    And Type  username "Alikonar"
    And Enter an email id which extension is  -.c- after -@- mark "<email>"
    And Type valid password "Ali.25"
    And Type valid  password confirmation "Ali.25"
    And Click register button
    Then Verify the red box which has alert "This field is invalid"
    Examples:
      |    SSN      |    email           |
      | 816-62-9059 | aliikon@gmail.c    |
      | 827-62-9159 | aliikon@gmail.co   |












