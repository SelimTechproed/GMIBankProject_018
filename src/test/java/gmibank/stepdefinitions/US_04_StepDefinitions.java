package gmibank.stepdefinitions;

import gmibank.pages.US_04_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US_04_StepDefinitions {
    US_04_Page us04Page = new US_04_Page();

    @Given("user go to  {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);
    }

    @Given("user click on account menu")
    public void user_click_on_account_menu() {
        us04Page.accountmenu.click();
        Driver.wait(3);

    }

    @Given("user click on sign in")
    public void user_click_on_sign_in() {
       us04Page.login.click();
        Driver.wait(3);
    }

    @Given("user enter a valid username to usernamebox")
    public void user_enter_a_valid_username_to_usernamebox() {
       us04Page.usernameBox.sendKeys("team18_user");
        Driver.wait(3);

    }

    @Given("user enter a valid password  to passwordbox")
    public void user_enter_a_valid_password_to_passwordbox() {
       us04Page.passwordBox.sendKeys("Team18user");
        Driver.wait(3);

    }

    @Given("user click on Sign in button")
    public void user_click_on_Sign_in_button() {
        us04Page.signinButton.click();
        Driver.wait(3);

    }

    @Then("verify if the user sign in")
    public void verify_if_the_user_sign_in() {

    }
    //TC02
    @Given("click on cancel button")
    public void click_on_cancel_button() {
        us04Page.cancelbutton.click();


    }

    @Then("verify if the user cancel")
    public void verify_if_the_user_cancel() {

    }


}
