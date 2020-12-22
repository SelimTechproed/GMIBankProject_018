package gmibank.com.stepdefinitions;

import gmibank.com.pages.US_016_Page;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class US_016_StepDefinitions {

    US_016_Page page = new US_016_Page();

    Actions actions = new Actions(Driver.getDriver());




    @Given("user goes to gmibank homepage")
    public void user_goes_to_gmibank_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }

    @Given("user goes to entry")
    public void user_goes_to_entry() {
        page.userIcon.click();
    }

    @Given("user goes to signIn page")
    public void user_goes_to_signIn_page() {
        page.signIn.click();
    }

    @Given("user logs in with the valid username {string}")
    public void user_logs_in_with_the_valid_username(String string) {
        page.username.sendKeys(string);
    }

    @Given("user logs in with the valid password {string}")
    public void user_logs_in_with_the_valid_password(String string) {
        page.password.sendKeys(string);
    }

  //  @Given("user clicks signIn button")
  //  public void user_clicks_signIn_button() {
   //     page.signInButton.click();
  //  }

    @Then("user should goes My Operations box")
    public void user_should_goes_My_Operations_box() {
        Driver.wait(1);
        page.myOperations.click();
        Driver.wait(1);
    }

    @Given("user should goes My Accounts box")
    public void user_should_goes_My_Accounts_box() {
        page.myAccounts.click();
    }

    @Given("user verify Account Type1 {string}")
    public void user_verify_Account_Type1(String string) {
        Assert.assertTrue(page.account1.isDisplayed());
        System.out.println(page.account1);
        String accountType1 = page.account1.getText();
        System.out.println(accountType1);
        Assert.assertEquals(string,accountType1);
    }

    @Given("user verify Account Type2 {string}")
    public void user_verify_Account_Type2(String string) {
        Assert.assertTrue(page.account2.isDisplayed());
        System.out.println(page.account2);
        String accountType2 = page.account2.getText();
        System.out.println(accountType2);
        Assert.assertEquals(string,accountType2);
    }

    @Then("user signOut from the page")
    public void user_signOut_from_the_page() {
        page.userHakan.click();
        page.signOut.click();
    }

    @Given("user should clicks Transfer Money box")
    public void user_should_clicks_Transfer_Money_box() {
        Driver.wait(2);
        page.transferMoney.click();
    }

    @Given("user should selects and clicks first account")
    public void user_should_selects_and_clicks_first_account() {
        Select select = new Select(page.idFromDropdown);
        Driver.wait(2);
        select.selectByIndex(2);
        Driver.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        Driver.wait(2);
    }

    @Given("user should verify the selected account")
    public void user_should_verify_the_selected_account() {
        String textFrom = page.idFromDropdown.getAttribute("account");
        System.out.println(textFrom);
    }

    @Given("user should selects and clicks other account")
    public void user_should_selects_and_clicks_other_account() {
        Select select = new Select(page.idToDropdown);
        select.selectByIndex(2);
        Driver.wait(3);
        actions.sendKeys(Keys.TAB).perform();
        Driver.wait(2);
        String textTo = page.idToDropdown.getAttribute("account");
        System.out.println(textTo);
    }

    @Given("user should sends and clicks {string} to Balance")
    public void user_should_sends_and_clicks_to_Balance(String string) {
        page.balance.sendKeys(string);
        Driver.wait(2);
    }

    @Given("user should clicks and verify the amount")
    public void user_should_clicks_and_verify_the_amount() {
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        Driver.wait(2);
        String textFrom = page.balance.getAttribute("value");
        Assert.assertEquals("120",textFrom);
    }

    @Given("user should sends {string} to Description")
    public void user_should_sends_to_Description(String string) {
        page.description.sendKeys(string);
        Driver.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        Driver.wait(3);
        System.out.println(page.description);
    }

    @Given("user should goes Make Transfer box")
    public void user_should_goes_Make_Transfer_box() {
        page.makeTransfer.click();
        Driver.wait(3);
        Assert.assertTrue(page.successMessage.isDisplayed());
    }


    @Given("user should clicks View Transaction box")
    public void user_should_clicks_View_Transaction_box() {
        page.firstViewTransaction.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Given("user verify the transaction is successful")
    public void user_verify_the_transaction_is_successful() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String textTransaction = page.tableTransaction.getText();
        System.out.println(textTransaction);
    }


}


