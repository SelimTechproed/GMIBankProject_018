package gmibank.stepdefinitions;

import gmibank.pages.US_05_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class US_05_StepDefinitions {
    US_05_Page us05Page = new US_05_Page();


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
        Driver.wait(3);
    }

    @Given("user click on password checkbox")
    public void user_click_on_password_checkbox() {
        us05Page.passwordBox.click();
    }

    @Given("user enter a valid password")
    public void user_enter_a_valid_password() {
        us05Page.passwordBox.sendKeys("Team18user");
        Driver.wait(2);
    }

    @Given("user enter a valid username")
    public void user_enter_a_valid_username() {
        us05Page.usernameBox.sendKeys("team18_user");
        Driver.wait(3);
    }

    @Given("user enter a invalid password")
    public void user_enter_a_invalid_password() {
        us05Page.passwordBox.sendKeys("qwert");
        Driver.wait(2);
    }

    @Then("user click on option to {string} to reset password")
    public void user_click_on_option_to_to_reset_password(String string) {
        us05Page.resetpassword.click();
        Driver.wait(2);
    }

    @Given("user click on option to {string} to register")
    public void user_click_on_option_to_to_register(String string) {
        new Actions(Driver.getDriver()).doubleClick(us05Page.registernew);
        Driver.wait(5);

    }
}
