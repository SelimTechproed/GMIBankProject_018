package gmibank.stepdefinitions;

import gmibank.pages.US_19_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class US_19_StepDefinitions {

    US_19_Page pageInfo=new US_19_Page();


    @Given("logs in user login page as admin")
    public void logs_in_user_login_page_as_admin() {
        Driver.loginAll("manager");
        Driver.wait(2);
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
        Driver.waitAndSendText(pageInfo.description,string,2);
        Driver.wait(2);

    }

    @Given("user fills the balance box {string}")
    public void user_fills_the_balance_box(String string) {
       Driver.waitAndSendText(pageInfo.balance,string,2);

    }

    @Given("user selects a valid account type from Account Type Drop-down {string}")
    public void user_selects_a_valid_account_type_from_Account_Type_Drop_down(String string) {

        Select select=new Select(pageInfo.accountType);
        select.selectByVisibleText(string);

    }

    @Given("user selects a valid account status type from Account Status Type Drop-down {string}")
    public void user_selects_a_valid_account_status_type_from_Account_Status_Type_Drop_down(String string) {
        Select select=new Select(pageInfo.accountStatusType);
        select.selectByVisibleText(string);

    }

    @Given("user selects a valid employee from Employee Drop-down")
    public void user_selects_a_valid_employee_from_Employee_Drop_down() {
        Select select=new Select(pageInfo.employee);
        select.selectByIndex(0);
        Driver.waitAndSendText(pageInfo.createDate,"12/12/20",3);
        Driver.waitAndSendText(pageInfo.closedDate,"10/12/22",3);
    }

    @Given("user clicks on the Save button")
    public void user_clicks_on_the_Save_button() {
        pageInfo.saveButton.click();

    }
    @Then("verify transaction done")
    public void verify_transaction_done() {
        Driver.verifyElementDisplayed(pageInfo.saveButton);

    }
}
