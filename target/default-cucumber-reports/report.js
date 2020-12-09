$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_07.feature");
formatter.feature({
  "name": "User Info Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@infoUpdate"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.step({
  "name": "user send \"\u003cuserInfoUpdateEmailBox\u003e\" into the email box",
  "keyword": "And "
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userInfoUpdateEmailBox"
      ]
    },
    {
      "cells": [
        "abcdefghgmail.com"
      ]
    },
    {
      "cells": [
        "abc..def@gmail.com"
      ]
    },
    {
      "cells": [
        ".abc@gmail.com"
      ]
    },
    {
      "cells": [
        "@gmail.com"
      ]
    },
    {
      "cells": [
        "abcdef@gmail."
      ]
    },
    {
      "cells": [
        "abc@gmail#arcihe.com"
      ]
    },
    {
      "cells": [
        "abcdef@gmail"
      ]
    },
    {
      "cells": [
        "abc@gmail..com"
      ]
    }
  ]
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"abcdefghgmail.com\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"abc..def@gmail.com\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \".abc@gmail.com\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"@gmail.com\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"abcdef@gmail.\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"abc@gmail#arcihe.com\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"abcdef@gmail\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_user can not update with invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@emailInvalid"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send \"abc@gmail..com\" into the email box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User goes to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_goes_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"ahmetbeyusername\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_02_There should not be an option of any other language other than English or Turkish",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@infoUpdate"
    },
    {
      "name": "@languageOption"
    }
  ]
});
formatter.step({
  "name": "user click to account menu",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to user info",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_to_user_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user give an option language dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_give_an_option_language_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert that there is no option other than English and Turkish",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_there_is_no_option_other_than_English_and_Turkish()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});