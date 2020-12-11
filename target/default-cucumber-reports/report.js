$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_08.feature");
formatter.feature({
  "name": "User Info Functionality On Password",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US_008"
    }
  ]
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_001 Old password can not be used again",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_001"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies there is old password passord bug",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.verifies_there_is_old_password_bug()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "US_008 TC_00\u003cnumbers\u003e new password should have at least 1 \"\u003ccharacter\u003e\" to change line1 color of chart color",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_008-TC_00-2-3-4-5"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.step({
  "name": "enter new seven chars \"\u003cpassword\u003e\" and verifies that  should be at least one \"\u003ccharacter\u003e\" at new password and level chart changes accordingly",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "numbers",
        "character",
        "password"
      ]
    },
    {
      "cells": [
        "2",
        "lowercase",
        "111111a"
      ]
    },
    {
      "cells": [
        "3",
        "uppercase",
        "111111A"
      ]
    },
    {
      "cells": [
        "4",
        "special",
        "111111_"
      ]
    },
    {
      "cells": [
        "5",
        "digit",
        "aaaaaa1"
      ]
    }
  ]
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_002 new password should have at least 1 \"lowercase\" to change line1 color of chart color",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_00-2-3-4-5"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter new seven chars \"111111a\" and verifies that  should be at least one \"lowercase\" at new password and level chart changes accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.enter_new_seven_chars_and_verifies_that_should_be_at_least_one_at_new_password_and_level_chart_changes_accordingly(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_003 new password should have at least 1 \"uppercase\" to change line1 color of chart color",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_00-2-3-4-5"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter new seven chars \"111111A\" and verifies that  should be at least one \"uppercase\" at new password and level chart changes accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.enter_new_seven_chars_and_verifies_that_should_be_at_least_one_at_new_password_and_level_chart_changes_accordingly(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_004 new password should have at least 1 \"special\" to change line1 color of chart color",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_00-2-3-4-5"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter new seven chars \"111111_\" and verifies that  should be at least one \"special\" at new password and level chart changes accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.enter_new_seven_chars_and_verifies_that_should_be_at_least_one_at_new_password_and_level_chart_changes_accordingly(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_005 new password should have at least 1 \"digit\" to change line1 color of chart color",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_00-2-3-4-5"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter new seven chars \"aaaaaa1\" and verifies that  should be at least one \"digit\" at new password and level chart changes accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.enter_new_seven_chars_and_verifies_that_should_be_at_least_one_at_new_password_and_level_chart_changes_accordingly(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_006 New password should have at least 4 chars",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_006"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies there is one bug that new password accepts at least four char",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.verifies_there_is_one_bug_that_new_password_accepts_at_least_four_char()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User signs in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"http://www.gmibank.com/login\" loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_goes_to_loginpage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid username",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides valid password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_provides_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US_008 TC_007 New password should be confirmed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_008"
    },
    {
      "name": "@US_008-TC_007"
    }
  ]
});
formatter.step({
  "name": "user clicks to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to password button to edit",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.user_clicks_to_password_button_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies that new valid password must be confirmed",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_08_StepDefinitions.verifies_that_new_valid_password_must_be_confirmed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});