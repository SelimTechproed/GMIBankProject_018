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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
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
  "name": "user send data to date box \"12.12.2015 12:00 \"",
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
formatter.background({
  "name": "user enters gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
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
  "name": "user send invalid data format to date box \"11.2021 09:30\"",
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
formatter.scenarioOutline({
  "name": "TC_1103 Date format positive test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tc11_03"
    }
  ]
});
formatter.step({
  "name": "user send valid data format to date box \"\u003cCreate Date Valid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user verifies valid date format to Create Date box",
  "keyword": "And "
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
        "Create Date Valid"
      ]
    },
    {
      "cells": [
        "12.30.2020 12:00"
      ]
    },
    {
      "cells": [
        "01.21.2021 11:15"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_1103 Date format positive test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_03"
    }
  ]
});
formatter.step({
  "name": "user send valid data format to date box \"12.30.2020 12:00\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_send_valid_data_format_to_date_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies valid date format to Create Date box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_valid_date_format_to_Create_Date_box()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_1103 Date format positive test",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_03"
    }
  ]
});
formatter.step({
  "name": "user send valid data format to date box \"01.21.2021 11:15\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_send_valid_data_format_to_date_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies valid date format to Create Date box",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_valid_date_format_to_Create_Date_box()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User positive test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_04"
    }
  ]
});
formatter.step({
  "name": "user select a user from dropbox",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_select_a_user_from_dropbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies a user can be selected",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_a_user_can_be_selected()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Account positive test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_05"
    }
  ]
});
formatter.step({
  "name": "user select an account from dropbox",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_select_an_account_from_dropbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies an account can be selected",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_an_account_can_be_selected()"
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
  "name": "user goes to \"https://gmibank.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_goes_to(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class gmibank.stepdefinitions.US_11_StepDefinitions\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 33 more\r\nCaused by: java.lang.NullPointerException\r\n\tat gmibank.utilities.ConfigurationReader.getProperty(ConfigurationReader.java:19)\r\n\tat gmibank.utilities.Driver.getDriver(Driver.java:35)\r\n\tat gmibank.pages.US_11_Page.\u003cinit\u003e(US_11_Page.java:11)\r\n\tat gmibank.stepdefinitions.US_11_StepDefinitions.\u003cinit\u003e(US_11_StepDefinitions.java:11)\r\n\t... 38 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks userEntry icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_userEntry_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_signIn_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin username \"joseph37\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_enters_admin_username(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin password \"1234567\"",
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
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_manageCostomers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks createNewCustomer link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_createNewCustomer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "reaches sign in link and clicks user info",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.reaches_sign_in_link_and_clicks_user_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Zelle Enrolled option checkbox positive test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us_11"
    },
    {
      "name": "@tc11_06"
    }
  ]
});
formatter.step({
  "name": "user select Zelle Enrolled checkbox",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_select_Zelle_Enrolled_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies is selected",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_11_StepDefinitions.user_verifies_is_selected()"
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
});