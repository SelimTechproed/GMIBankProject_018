$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/us_11.feature");
formatter.feature({
  "name": "us_11 tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us_11"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Create Date negative test (for in the past)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tc11_01"
    }
  ]
});
formatter.step({
  "name": "user send data to date box \"\u003cCreate Date\u003e \"",
  "keyword": "Given "
});
formatter.step({
  "name": "user verifies valid data entry to Create Date box",
  "keyword": "Then "
});
formatter.step({
  "name": "user signOut",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Dates",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Create Date"
      ]
    },
    {
      "cells": [
        "12.12.2015 12:00"
      ]
    },
    {
      "cells": [
        "01.20.2020 11:15"
      ]
    }
  ]
});
formatter.background({
  "name": "user enters gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters gmibank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_gmibank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks entry button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_entry_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks  signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters admin username \"team18_employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters admin password \"Team18employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks myOperations link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_myOperations_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks manageCostomers link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCustomers_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Date negative test (for in the past)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_01"
    }
  ]
});
formatter.step({
  "name": "user send data to date box \"12.12.2015 12:00 \"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_send_data_to_date_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies valid data entry to Create Date box",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_valid_data_entry_to_Create_Date_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user signOut",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_signOut()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J02Q3B5\u0027, ip: \u0027192.168.2.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57081}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 30cc1cf8687c78dcd46ecf9cb7c70a8c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.user_signOut(US_11_StepDefinitions.java:89)\r\n\tat ✽.user signOut(file:///C:/Users/user/IdeaProjects/GMIBankProject_018/src/test/resources/features/us_11.feature:18)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "user enters gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters gmibank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_gmibank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks entry button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_entry_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks  signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[.\u003d\u0027Sign in\u0027]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J02Q3B5\u0027, ip: \u0027192.168.2.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57081}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 30cc1cf8687c78dcd46ecf9cb7c70a8c\n*** Element info: {Using\u003dxpath, value\u003d//span[.\u003d\u0027Sign in\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link(US_11_StepDefinitions.java:33)\r\n\tat ✽.user clicks  signIn link(file:///C:/Users/user/IdeaProjects/GMIBankProject_018/src/test/resources/features/us_11.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters admin username \"team18_employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"Team18employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks myOperations link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_myOperations_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks manageCostomers link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCustomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create Date negative test (for in the past)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_01"
    }
  ]
});
formatter.step({
  "name": "user send data to date box \"01.20.2020 11:15 \"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_send_data_to_date_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies valid data entry to Create Date box",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_valid_data_entry_to_Create_Date_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user signOut",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_signOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "TC_1102 Date format negative test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tc11_02"
    }
  ]
});
formatter.step({
  "name": "user send invalid data format to date box \"\u003cCreate Date Invalid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user verifies invalid data entry to Create Date box",
  "keyword": "Then "
});
formatter.step({
  "name": "user signOut",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test Dates",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Create Date Invalid"
      ]
    },
    {
      "cells": [
        "01.12.2020"
      ]
    },
    {
      "cells": [
        "01.20.2021 11"
      ]
    },
    {
      "cells": [
        "11.2021 09:30"
      ]
    }
  ]
});
formatter.background({
  "name": "user enters gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters gmibank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_gmibank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks entry button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_entry_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks  signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[.\u003d\u0027Sign in\u0027]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J02Q3B5\u0027, ip: \u0027192.168.2.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57081}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 30cc1cf8687c78dcd46ecf9cb7c70a8c\n*** Element info: {Using\u003dxpath, value\u003d//span[.\u003d\u0027Sign in\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link(US_11_StepDefinitions.java:33)\r\n\tat ✽.user clicks  signIn link(file:///C:/Users/user/IdeaProjects/GMIBankProject_018/src/test/resources/features/us_11.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters admin username \"team18_employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"Team18employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks myOperations link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_myOperations_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks manageCostomers link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCustomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_1102 Date format negative test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_02"
    }
  ]
});
formatter.step({
  "name": "user send invalid data format to date box \"01.12.2020\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_send_invalid_data_format_to_date_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies invalid data entry to Create Date box",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_invalid_data_entry_to_Create_Date_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user signOut",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_signOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "user enters gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters gmibank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_gmibank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks entry button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_entry_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks  signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[.\u003d\u0027Sign in\u0027]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J02Q3B5\u0027, ip: \u0027192.168.2.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57081}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 30cc1cf8687c78dcd46ecf9cb7c70a8c\n*** Element info: {Using\u003dxpath, value\u003d//span[.\u003d\u0027Sign in\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link(US_11_StepDefinitions.java:33)\r\n\tat ✽.user clicks  signIn link(file:///C:/Users/user/IdeaProjects/GMIBankProject_018/src/test/resources/features/us_11.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters admin username \"team18_employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"Team18employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_password(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks myOperations link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_myOperations_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks manageCostomers link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCustomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_1102 Date format negative test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_02"
    }
  ]
});
formatter.step({
  "name": "user send invalid data format to date box \"01.20.2021 11\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_send_invalid_data_format_to_date_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies invalid data entry to Create Date box",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_invalid_data_entry_to_Create_Date_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user signOut",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_signOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "user enters gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters gmibank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_gmibank_homepage()"
});
