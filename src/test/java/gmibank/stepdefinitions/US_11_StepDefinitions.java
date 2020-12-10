package gmibank.stepdefinitions;
import gmibank.pages.US_11_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import javax.swing.*;

public class US_11_StepDefinitions {

    US_11_Page us_11_page=new US_11_Page();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user goes to {string}")
    public void user_goes_to(String string) {
       Driver.getDriver().get(string);
       Driver.wait(2000);
    }

    @Given("user clicks userEntry icon")
    public void user_clicks_userEntry_icon() {
    user_clicks_userEntry_icon();


    }

    @Given("user clicks signIn link")
    public void user_clicks_signIn_link() {



    }

    @Given("user enters admin username {string}")
    public void user_enters_admin_username(String string) {

    }

    @Given("user enters admin password {string}")
    public void user_enters_admin_password(String string) {

    }

    @Given("user clicks signIn button")
    public void user_clicks_signIn_button() {

    }

    @Given("user clicks myOperations link")
    public void user_clicks_myOperations_link() {

    }

    @Given("user clicks manageCostomers link")
    public void user_clicks_manageCostomers_link() {

    }

    @Given("user clicks createNewCustomer link")
    public void user_clicks_createNewCustomer_link() {

    }

    @Then("reaches sign in link and clicks user info")
    public void reaches_sign_in_link_and_clicks_user_info() {

    }

    @Given("user send data to date box {string}")
    public void user_send_data_to_date_box(String string) {

    }

    @Then("user verifies valid data entry to Create Date box")
    public void user_verifies_valid_data_entry_to_Create_Date_box() {

    }

    @Then("user signOut")
    public void user_signOut() {

    }

    @Given("user send invalid data format to date box {string}")
    public void user_send_invalid_data_format_to_date_box(String string) {

    }

    @Then("user verifies invalid data entry to Create Date box")
    public void user_verifies_invalid_data_entry_to_Create_Date_box() {

    }

    @Given("user send valid data format to date box {string}")
    public void user_send_valid_data_format_to_date_box(String string) {

    }

    @Given("user verifies valid date format to Create Date box")
    public void user_verifies_valid_date_format_to_Create_Date_box() {

    }

    @Given("user select a user from dropbox")
    public void user_select_a_user_from_dropbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user verifies a user can be selected")
    public void user_verifies_a_user_can_be_selected() {

    }

    @Given("user select an account from dropbox")
    public void user_select_an_account_from_dropbox() {

    }

    @Given("user verifies an account can be selected")
    public void user_verifies_an_account_can_be_selected() {

    }

    @Given("user select Zelle Enrolled checkbox")
    public void user_select_Zelle_Enrolled_checkbox() {

    }

    @Given("user clicks on save button")
    public void user_clicks_on_save_button() {

    }

    @Given("user verifies is selected")
    public void user_verifies_is_selected() {

    }






}
