package gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewApp {

    

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        Driver.iAmOnHomePage();
    }

    @Given("user enters ssn number as SSN")
    public void user_enters_ssn_number_as_SSN() {
        Faker faker=new Faker();


    }

    @Then("user enters firstname and lastname as firstname and lastname")
    public void user_enters_firstname_and_lastname_as_firstname_and_lastname() {

    }

    @When("user provides address address")
    public void user_provides_address_address() {

    }

    @Then("user provides mobilephone as mobilephone")
    public void user_provides_mobilephone_as_mobilephone() {

    }

    @Then("user provides a username username")
    public void user_provides_a_username_username() {

    }

    @Then("user provides email id as email")
    public void user_provides_email_id_as_email() {

    }

    @When("user enters the password as firstpassword")
    public void user_enters_the_password_as_firstpassword() {

    }

    @When("user confirms the new password secondpassword")
    public void user_confirms_the_new_password_secondpassword() {

    }

    @Then("user clicks on register button and sees the success message as message")
    public void user_clicks_on_register_button_and_sees_the_success_message_as_message() {

    }
}
