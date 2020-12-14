package gmibank.stepdefinitions;

import gmibank.pages.US_13_14_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_13_StepDefinitions {

    US_13_14_Page us_13_page = new US_13_14_Page();

    @Given("Go to the sign in page")
    public void go_to_the_sign_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
        //Driver.wait(3000);
    }

    @Given("Type username and password than click on sign in button")
    public void type_username_and_password_than_click_on_sign_in_button() {
        us_13_page.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
        us_13_page.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
        us_13_page.signInButton.click();
    }

    @Given("Click on My Operations dropdown menu")
    public void click_on_My_Operations_dropdown_menu() {
        us_13_page.myOperationsDropdown.click();

    }

    @Given("Click on Manage Accounts")
    public void click_on_Manage_Accounts() {
        us_13_page.manageAccount.click();

    }

    @Given("Click on +Create a new Account")
    public void click_on_Create_a_new_Account() {
        us_13_page.createAccountButton.click();

    }

    //TC_01
    @Given("Click on Descriptions text box and type some descriptions in the text box")
    public void click_on_Descriptions_text_box_and_type_some_descriptions_in_the_text_box() {
        us_13_page.descriptionTextBox.sendKeys("First test account");

    }

    @Then("user should not see the error message.")
    public void user_should_not_see_the_error_message() {
        Assert.assertTrue(us_13_page.descriptionTextBox.isDisplayed());
    }

    //TC_02
    @Given("Click on Balance text box and Type a balance in the text box")
    public void click_on_Balance_text_box_and_Type_a_balance_in_the_text_box() {
        us_13_page.balanceTextBox.sendKeys("9000");
    }

    @Then("user should not see the error message for balance text box.")
    public void user_should_not_see_the_error_message_for_balance_text_box() {
        Assert.assertTrue(us_13_page.balanceTextBox.isDisplayed());
    }


    //TC_03
    @Then("Select an account type as CHECKING, SAVING,CREDIT_CARD or INVESTING")
    public void select_an_account_type_as_CHECKING_SAVING_CREDIT_CARD_or_INVESTING() {
        Select select = new Select(us_13_page.accountTypeDropdown);
        select.selectByIndex(2);
        String accountType = select.getFirstSelectedOption().getText();
        Assert.assertEquals(accountType,"CREDIT_CARD");

    }

    //TC_04
    @Then("Select an account status type from the Account Status Type dropdown and verify")
    public void select_an_account_status_type_from_the_Account_Status_Type_dropdown_and_verify() {
        Select select = new Select(us_13_page.accountStatusDropdown);
        select.selectByIndex(0);
        String accountStatus = select.getFirstSelectedOption().getText();
        Assert.assertEquals(accountStatus,"ACTIVE");
    }


    //TC_05
    @Then("Select an employee from the Employee dropdown and verify")
    public void select_an_employee_from_the_Employee_dropdown_and_verify() {

        Select select = new Select(us_13_page.employeeDropdown);
        select.selectByIndex(0);
        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
    }

    //TC_06
    @Then("Click save button")
    public void click_save_button() {
        us_13_page.saveButton.click();
    }


}
