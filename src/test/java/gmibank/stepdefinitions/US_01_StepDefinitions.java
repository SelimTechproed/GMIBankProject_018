package gmibank.stepdefinitions;
import gmibank.pages.US_01_02Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import java.util.List;
import java.util.Map;
public class US_01_StepDefinitions {
    US_01_02Page us_01_02Page = new US_01_02Page();
    @Given("Go to gmibank.com home page us01")
    public void go_to_gmibank_com_home_page_us01() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }
    @Given("Click to User Account menu and Click to Register")
    public void click_to_User_Account_menu_and_Click_to_Register() {
        us_01_02Page.registration_Menu.click();
        us_01_02Page.registration_Button.click();
    }
    @Given("Enter the SSN {string} with valid credential")
    public void enter_the_SSN_with_valid_credential(String string) {
        us_01_02Page.registration_SSN.sendKeys(string);
    }
    @Given("Click on first name box")
    public void click_on_first_name_box() {
        us_01_02Page.registration_FirstName.click();
    }
    @Then("There should be a valid SSN respecting")
    public void there_should_be_a_valid_SSN_respecting() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessageSSN.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the name {string} with valid credential")
    public void enter_the_name_with_valid_credential(String string) {
        us_01_02Page.registration_FirstName.clear();
        us_01_02Page.registration_FirstName.sendKeys(string);
    }
    @Given("click on last name box")
    public void click_on_last_name_box() {
        us_01_02Page.registration_LastName.click();
    }
    @Then("There should be a valid name respecting")
    public void there_should_be_a_valid_name_respecting() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessageFirstName.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the last name {string} with valid credential")
    public void enter_the_last_name_with_valid_credential(String string) {
        us_01_02Page.registration_LastName.clear();
        us_01_02Page.registration_LastName.sendKeys(string);
    }
    @Given("click on Address box")
    public void click_on_Address_box() {
        us_01_02Page.registration_Address.click();
    }
    @Then("There should be a valid last name respecting")
    public void there_should_be_a_valid_last_name_respecting() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessageLastName.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the Address")
    public void enter_the_Address() {
        us_01_02Page.registration_Address.sendKeys(ConfigurationReader.getProperty("adresUS_01"));
    }
    @Given("click on mobile phone number box")
    public void click_on_mobile_phone_number_box() {
        us_01_02Page.registration_MobilePhoneNumber.click();
    }
    @Then("There should be a valid address respecting")
    public void there_should_be_a_valid_address_respecting() {
    }
    @Given("Enter the GSM {string} with valid credential")
    public void enter_the_GSM_with_valid_credential(String string) {
        us_01_02Page.registration_MobilePhoneNumber.clear();
        us_01_02Page.registration_MobilePhoneNumber.sendKeys(string);
    }
    @Given("click on username box")
    public void click_on_username_box() {
        us_01_02Page.registration_userName.click();
    }
    @Then("There should be a valid mobile phone number respecting")
    public void there_should_be_a_valid_mobile_phone_number_respecting() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessageMobileNumber.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the valid username {string} with valid credentail")
    public void enter_the_valid_username_with_valid_credentail(String string) {
        us_01_02Page.registration_userName.clear();
        us_01_02Page.registration_userName.sendKeys(string);
    }
    @Given("click on email box")
    public void click_on_email_box() {
        us_01_02Page.registration_Email.click();
    }
    @Then("There should be a valid username respecting")
    public void there_should_be_a_valid_username_respecting() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessageMobileNumber.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the e-mail {string} with valid credential")
    public void enter_the_e_mail_with_valid_credential(String string) {
        us_01_02Page.registration_Email.clear();
        us_01_02Page.registration_Email.sendKeys(string);
    }
    @Given("click on new password box")
    public void click_on_new_password_box() {
        us_01_02Page.registration_FirstPassword.click();
    }
    @Then("There should be a valid email respecting")
    public void there_should_be_a_valid_email_respecting() {
        try {
            Assert.assertFalse(us_01_02Page
                    .registration_alertMessageEmail.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the new {string} with valid credential")
    public void enter_the_new_with_valid_credential(String string) {
        us_01_02Page.registration_FirstPassword.clear();
        us_01_02Page.registration_FirstPassword.sendKeys(string);
    }
    @Given("click on new password confirmation box")
    public void click_on_new_password_confirmation_box() {
        us_01_02Page.registration_SecondPassword.click();
    }
    @Then("There should be a valid password respecting")
    public void there_should_be_a_valid_password_respecting() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessagePassword.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Enter the same password with valid credential {string}")
    public void enter_the_same_password_with_valid_credential(String string) {
        us_01_02Page.registration_SecondPassword.sendKeys(string);
    }
    @Given("click on new password box02")
    public void click_on_new_password_box02() {
        us_01_02Page.registration_FirstPassword.click();
    }
    @Then("entry should be same with password")
    public void entry_should_be_same_with_password() {
        try {
            Assert.assertFalse(us_01_02Page.registration_alertMessageSecondPassword.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }
    @Given("Click to Register button")
    public void click_to_Register_button() {
        us_01_02Page.registration_SubmitButton.click();
    }
    @Then("There should be Succes message.")
    public void there_should_be_Succes_message() {
        Driver.wait(5);
        Assert.assertTrue(us_01_02Page.registration_successMessage.isDisplayed());
    }
}