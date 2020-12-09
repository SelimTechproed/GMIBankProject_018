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
  "name": "user send \"\u003cuserInfoUpdateEmailBox\u003e\" into the email box",
  "keyword": "Given "
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
  "name": "user send \"abcdefghgmail.com\" into the email box",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#email\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-OOSIVIF\u0027, ip: \u0027192.168.1.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\DELLLA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61567}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e868dfe9d772b308a657278b1802311a\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(US_07_StepDefinitions.java:21)\r\n\tat ✽.user send \"abcdefghgmail.com\" into the email box(file:///C:/Users/DELL%20LATITUDE%207300/IdeaProjects/GMIBankProject_018/src/test/resources/features/US_07.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027username\u0027]\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-OOSIVIF\u0027, ip: \u0027192.168.1.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\DELLLA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61567}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e868dfe9d772b308a657278b1802311a\n*** Element info: {Using\u003dname, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_username(US_06_StepDefinitions.java:28)\r\n\tat ✽.user provide valid username \"ahmetbeyusername\"(file:///C:/Users/DELL%20LATITUDE%207300/IdeaProjects/GMIBankProject_018/src/test/resources/features/US_07.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user provide valid password \"Ahmet2020.\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "skipped"
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
  "name": "user send \"abc..def@gmail.com\" into the email box",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_send_into_the_email_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_click_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user assert that user account can not update with invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_07_StepDefinitions.user_assert_that_user_account_can_not_update_with_invalid_email_address()"
});
formatter.result({
  "status": "skipped"
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
