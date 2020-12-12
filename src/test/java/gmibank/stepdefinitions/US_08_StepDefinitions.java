package gmibank.stepdefinitions;

import gmibank.pages.US_08_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_08_StepDefinitions {
    US_08_Page us08Page=new US_08_Page();

    @Given("user goes to {string} loginpage")
    public void user_goes_to_loginpage(String string) {
        Driver.getDriver().get(string);
    }

    @Given("user provides valid username")
    public void user_provides_valid_username() {
        us08Page.userNameBox.sendKeys(ConfigurationReader.getProperty("semra_username"));
    }

    @Given("user provides valid password")
    public void user_provides_valid_password() {
        us08Page.passwordBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
    }

    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        us08Page.signInButton.click();
        Driver.wait(1);
    }

    @Given("user clicks to account menu")
    public void user_clicks_to_account_menu() {
        us08Page.accountButton.click();
    }
    @Given("user clicks to password button to edit")
    public void user_clicks_to_password_button_to_edit() {
        us08Page.passwordButton.click();
    }
    @Then("verifies there is old password passord bug")
    public void verifies_there_is_old_password_bug() {
        us08Page.currentPasswordBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.newPasswordBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.newPasswordConfirmationBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.saveButton.click();
        Driver.wait(5);
        String pageText= Driver.getDriver().getPageSource();
        System.out.println(pageText);
        Assert.assertTrue(pageText.contains("Password changed"));
        System.out.println("'Password change' uses old password, There is bug");

    }

    @Then("enter new seven chars {string} and verifies that  should be at least one {string} at new password and level chart changes accordingly")
    public void enter_new_seven_chars_and_verifies_that_should_be_at_least_one_at_new_password_and_level_chart_changes_accordingly(String string, String string2) {
        us08Page.currentPasswordBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.newPasswordBox.sendKeys(string);
        String renk = us08Page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("orange")));
        System.out.println("When I enter 1 "+string2+" at the last character of 7 character password, line1 color of level chart changes");
    }

    @Then("verifies there is one bug that new password accepts at least four char")
    public void verifies_there_is_one_bug_that_new_password_accepts_at_least_four_char() {
        us08Page.currentPasswordBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.newPasswordBox.sendKeys("1111");
        us08Page.newPasswordConfirmationBox.sendKeys("1111");
        us08Page.saveButton.click();
        Driver.wait(5);
        String pageText= Driver.getDriver().getPageSource();
        Assert.assertTrue(pageText.contains("Password changed"));
        System.out.println("'Password can change' with 4 character, There is bug");
        Driver.wait(5);
        us08Page.currentPasswordBox.clear();
        us08Page.newPasswordBox.clear();
        us08Page.newPasswordConfirmationBox.clear();
        us08Page.currentPasswordBox.sendKeys("1111");
        us08Page.newPasswordBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.newPasswordConfirmationBox.sendKeys(ConfigurationReader.getProperty("semra_password"));
        us08Page.saveButton.click();
        Driver.wait(5);
    }

    @Then("verifies that new valid password must be confirmed")
    public void verifies_that_new_valid_password_must_be_confirmed() {
        verifies_there_is_old_password_bug();

        System.out.println("'Password change' is confirmed");
    }
}
