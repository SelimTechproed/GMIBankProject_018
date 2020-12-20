package gmibank.com.stepdefinitions;

import gmibank.com.pages.US_09_Page;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.Driver;
import io.cucumber.java.en.Given;

public class US_09_Stepdefinitions {

    US_09_Page us_09_page = new US_09_Page();

    @Given("US09 user on the login page {string}")
    public void us09_user_on_the_login_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
    }

    @Given("US09 send username to username box {string}")
    public void us09_send_username_to_username_box(String string) {
        us_09_page.username.sendKeys(string);
    }

    @Given("US09 send password to password box {string}")
    public void us09_send_password_to_password_box(String string) {
        us_09_page.password.sendKeys(string);
    }

    @Given("US09 click sign in")
    public void us09_click_sign_in() {
       us_09_page.signInButton.click();
    }

    @Given("US09 click to my operations")
    public void us09_click_to_my_operations() {
        us_09_page.myOperations.click();
    }

    @Given("US09 click to manage customers")
    public void us09_click_to_manage_customers() {
        us_09_page.manageCustomers.click();
    }

    @Given("US09 click to create a new customer")
    public void us09_click_to_create_a_new_customer() {
       us_09_page.createANewCustomer.click();
    }

    @Given("US09 TC01 type a valid SSN {string}")
    public void us09_TC01_type_a_valid_SSN(String string) {
        us_09_page.ssnSearch.sendKeys(string);
    }

    @Given("US09 TC01 click search button")
    public void us09_TC01_click_search_button() {
      //  Driver.verifyElementClickablle(By.xpath("//button[@class='btn btn-secondary']"));
        us_09_page.search.click();
    }

    @Given("US09 verify search button")
    public void us09_verify_search_button() {
        Driver.wait(2);
        System.out.println(us_09_page.successMessage.getText());
        boolean clickable = us_09_page.search.isEnabled();
        System.out.println(clickable);
    }

    @Given("US09 getAttribute from firstname box")
    public void us09_getAttribute_from_firstname_box() {
        Driver.wait(2);
        System.out.println(us_09_page.firstName.getAttribute("value"));
    }

    @Given("US09 getAttribute from lastname box")
    public void us09_getAttribute_from_lastname_box() {
        Driver.wait(2);
        System.out.println(us_09_page.lastName.getAttribute("value"));
    }

    @Given("US09 getAttribute from email box")
    public void us09_getAttribute_from_email_box() {
        Driver.wait(2);
        System.out.println(us_09_page.emailBox.getAttribute("value"));
    }

    @Given("US09 getAttribute from mobile phone number box")
    public void us09_getAttribute_from_mobile_phone_number_box() {
        Driver.wait(2);
        System.out.println(us_09_page.mobilePhoneNumber.getAttribute("value"));
    }

    @Given("US09 getAttribute from phone number box")
    public void us09_getAttribute_from_phone_number_box() {
        Driver.wait(2);
        System.out.println(us_09_page.phoneNumber.getAttribute("value"));
    }

    @Given("US09 getAttribute from phone ssn box")
    public void us09_getAttribute_from_phone_ssn_box() {
        Driver.wait(2);
        System.out.println(us_09_page.ssnBox.getAttribute("value"));
    }


}
