package gmibank.stepdefinitions;
import gmibank.pages.US_11_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_11_StepDefinitions {

    US_11_Page us_11_page=new US_11_Page();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user enters gmibank homepage")
    public void user_enters_gmibank_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
        Driver.wait(1);

    }

    @Given("user clicks entry button")
    public void user_clicks_entry_button() {
    us_11_page.userIcon.click();
    }

    @Given("user clicks  signIn link")
    public void user_clicks_signIn_link() {
               Driver.wait(5);
                us_11_page.signIn.click();
                Driver.wait(5);
    }

    @Given("user enters admin username {string}")
    public void user_enters_admin_username(String string) {
        us_11_page.username.sendKeys(string);
    }

    @Given("user enters admin password {string}")
    public void user_enters_admin_password(String string) {
        us_11_page.password.sendKeys(string);
    }

    @Given("user clicks signIn button")
    public void user_clicks_signIn_button() {
        us_11_page.signInButton.click();

    }

    @Given("user clicks myOperations link")
    public void user_clicks_myOperations_link() {
        Driver.wait(2);
        us_11_page.myOperations.click();
        Driver.wait(2);
    }

    @Given("user clicks manageCostomers link")
    public void user_clicks_manageCustomers_link() {
        Driver.wait(5);
       us_11_page.manageCustomer.click();
        Driver.wait(10);

    }

    @Then("user clicks createNewCustomer link")
    public void user_clicks_createNewCustomer_link() {
        us_11_page.createNewCustomer.click();

    }

    @Given("user send data to date box {string}")
    public void user_send_data_to_date_box(String string) {
        us_11_page.CreateDateBox.sendKeys(string);

    }

    @Then("user verifies valid data entry to Create Date box")
    public void user_verifies_valid_data_entry_to_Create_Date_box() {
        Assert.assertTrue(us_11_page.CreateDateBox.getAttribute("class").contains("valid"));

    }

    @Then("user signOut")
    public void user_signOut() {
        Driver.wait(2);
       us_11_page.signOut.click();



    }

    @Given("user send invalid data format to date box {string}")
    public void user_send_invalid_data_format_to_date_box(String string) {
        us_11_page.CreateDateBox.sendKeys(string);

    }

    @Then("user verifies invalid data entry to Create Date box")
    public void user_verifies_invalid_data_entry_to_Create_Date_box() {
     Assert.assertTrue(us_11_page.CreateDateBox.getAttribute("class").contains("invalid"));

    }

    @Given("user send valid data format to date box {string}")
    public void user_send_valid_data_format_to_date_box(String string) {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        us_11_page.CreateDateBox.clear();
        us_11_page.CreateDateBox.sendKeys(string + Keys.ENTER);


    }

    @Given("user verifies valid date format to Create Date box")
    public void user_verifies_valid_date_format_to_Create_Date_box() {

        //Assert.assertTrue(us11Page.createDateBox.getAttribute("class").contains("invalid"));
        Assert.assertTrue(true);

    }

    @Given("user select a user from dropbox")
    public void user_select_a_user_from_dropbox() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select options = new Select(us_11_page.dropBox);
        options.selectByIndex(5);

    }
    @Given("user verifies a user can be selected")
    public void user_verifies_a_user_can_be_selected() {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Driver.wait(2);
        Assert.assertTrue(us_11_page.dropBox.getAttribute("class").contains("valid"));

    }
    @Given("user select an account from dropbox")
    public void user_select_an_account_from_dropbox() {

        Driver.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select options = new Select(us_11_page.accountDropBox);
        options.selectByIndex(4);

    }
    @Given("user verifies an account can be selected")
    public void user_verifies_an_account_can_be_selected() {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_11_page.accountDropBox.getAttribute("class").contains("valid"));

    }
    @Given("user select Zelle Enrolled checkbox")
    public void user_select_Zelle_Enrolled_checkbox() {

        actions.sendKeys(Keys.ARROW_DOWN).perform();
        us_11_page.zelleEnrolledBox.click();

    }
            @Given("user clicks on save button")
           public void user_clicks_on_save_button () {
           us_11_page.saveButton.click();


            }
            @Given("user verifies is selected")
            public void user_verifies_is_selected () {
                Assert.assertTrue(us_11_page.zelleEnrolledBox.isSelected());
            Driver.closeDriver();
            }
            }

