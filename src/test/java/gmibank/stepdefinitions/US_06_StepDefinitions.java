package gmibank.stepdefinitions;

import gmibank.pages.US_06_07_Page;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class US_06_StepDefinitions {

    US_06_07_Page us0607Page=new US_06_07_Page();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
       Driver.wait(2);
    }


    @Given("user provide valid username {string}")
    public void user_provide_valid_username(String string) {
     us0607Page.userName.sendKeys(string);
        Driver.wait(2);

    }

    @Given("user provide valid password {string}")
    public void user_provide_valid_password(String string) {
     us0607Page.passWord.sendKeys(string);
        Driver.wait(2);
    }

    @Given("user click sign in button")
    public void user_click_sign_in_button() {
     us0607Page.signInButton.click();
        Driver.wait(2);
    }
    @Given("user click to account menu")
    public void user_click_to_account_menu() {
     us0607Page.accountMenu.click();
        Driver.wait(2);
    }

    @Given("user click to user info")
    public void user_click_to_user_info() {
        Driver.clickWithTimeOut( us0607Page.userInfoClick,3);

    }

    @Then("Verify languages are available English and Turkish")
    public void verify_languages_are_available_English_and_Turkish() {
        Select select=new Select(us0607Page.languageSelect);
        List<WebElement> languageOptions ;
        languageOptions=select.getOptions();
        System.out.println(languageOptions.get(0).getText());
        System.out.println(languageOptions.get(1).getText());
        Driver.closeDriver();
    }
    @Given("Click in the firstname box and type a new firstname {string}")
    public void click_in_the_firstname_box_and_type_a_new_firstname(String string) {
        us0607Page.firstNameBoxClick.clear();
        Driver.wait(2);
        us0607Page.firstNameBoxClick.sendKeys(string);
        Driver.wait(3);
    }
      @Given("user click save in button")
    public void user_click_save_in_button() {
      us0607Page.saveButtonClick.click();
      Driver.wait(2);
    }
    @Then("Verify that my firstname  have been updated")
    public void verify_that_my_firstname_have_been_updated() {

    Driver.verifyElementDisplayed(us0607Page.settingsSaveMessage);

    }
    @Given("Click in the lastname box and type a new lastname {string}")
    public void click_in_the_lastname_box_and_type_a_new_lastname(String string) {
        us0607Page.lastNameBoxClick.clear();
        Driver.wait(2);
        us0607Page.lastNameBoxClick.sendKeys(string);
    }
      @Then("Verify that my lastname  have been updated")
    public void verify_that_my_lastname_have_been_updated() {
        Driver.verifyElementDisplayed(us0607Page.settingsSaveMessage);

    }
    @Given("Click on the mailbox and type in a new email address {string}")
    public void click_on_the_mailbox_and_type_in_a_new_email_address(String string) {
       us0607Page.emailBoxClick.clear();
       Driver.wait(2);
       us0607Page.emailBoxClick.sendKeys(string);
    }

    @Then("Verify update by adding {string} sign and {string} extension to your email")
    public void verify_update_by_adding_sign_and_extension_to_your_email(String string, String string2) {
        Driver.verifyElementDisplayed(us0607Page.settingsSaveMessage);

    }




}
