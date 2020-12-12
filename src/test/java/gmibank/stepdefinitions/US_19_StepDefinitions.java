package gmibank.stepdefinitions;

import gmibank.pages.US_19_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class US_19_StepDefinitions {

    US_19_Page pageInfo=new US_19_Page();

    @Given("User is on GMIBank Login page")
    public void user_is_on_GMIBank_Login_page() {

           Driver.loginAll("customer");

    }

    @Given("user clicks on My Operations")
    public void user_clicks_on_My_Operations() {
     Driver.waitAndClick(pageInfo.myOperations,3);
    }

    @Given("user clicks on Manage Account")
    public void user_clicks_on_Manage_Account() {
        Driver.waitAndClick(pageInfo.manageAccounts,3);

    }

    @Given("user clicks on Create a new Account")
    public void user_clicks_on_Create_a_new_Account() {
        pageInfo.newAccount.click();

    }

    @Given("user create a description {string}")
    public void user_create_a_description(String string) {
        pageInfo.description.sendKeys(string);
        Driver.wait(2);

    }

    @Given("user fills the balance box {string}")
    public void user_fills_the_balance_box(String string) {

    }

    @Given("user selects a valid account type from Account Type Drop-down {string}")
    public void user_selects_a_valid_account_type_from_Account_Type_Drop_down(String string) {

    }

    @Given("user selects a valid account status type from Account Status Type Drop-down {string}")
    public void user_selects_a_valid_account_status_type_from_Account_Status_Type_Drop_down(String string) {

    }

    @Given("user selects a valid employee from Employee Drop-down")
    public void user_selects_a_valid_employee_from_Employee_Drop_down() {

    }

    @Given("user clicks on the Save button")
    public void user_clicks_on_the_Save_button() {

    }
}
