package gmibank.stepdefinitions;

import gmibank.pages.US_05_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class US_05_StepDefinitions {
    US_05_Page us05Page= new US_05_Page();


    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);


    }

    @Given("user click on username checkbox")
    public void user_click_on_username_checkbox() {
      us05Page.usernameBox.click();

    }

    @Given("user enter a invalid username")
    public void user_enter_a_invalid_username() {
      us05Page.usernameBox.sendKeys("qwert");
    }

    @Given("user click on password checkbox")
    public void user_click_on_password_checkbox() {
      us05Page.passwordBox.click();
    }

    @Given("user enter a valid password")
    public void user_enter_a_valid_password() {
      us05Page.passwordBox.sendKeys("Team18user");
    }

    @Given("user enter a valid username")
    public void user_enter_a_valid_username() {
      us05Page.usernameBox.sendKeys("team18_user");
    }

    @Given("user enter a invalid password")
    public void user_enter_a_invalid_password() {
      us05Page.passwordBox.sendKeys("qwert");
    }
}
