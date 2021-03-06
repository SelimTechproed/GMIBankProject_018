package gmibank.com.stepdefinitions;

import gmibank.com.pages.US_06_07_Page;
import gmibank.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class US_07_StepDefinitions {

    US_06_07_Page updateInfo=new US_06_07_Page();

    @Given("user send {string} into the email box")
    public void user_send_into_the_email_box(String string) {
        updateInfo.emailBoxClick.clear();
        Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys(string);
        Driver.wait(2);
    }

    @Given("user click save button")
    public void user_click_save_button() {
        updateInfo.saveButtonClick.click();
        Driver.wait(3);
        System.out.println(updateInfo.invalidFeedback.getText());
    }
//2.yol tum secenekleri bir method icinde denedim
    @Given("user send  new email into the email box")
    public void user_send_new_email_into_the_email_box() {

        updateInfo.emailBoxClick.clear();        Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("abcdefghgmail.com");Driver.wait(2);
        updateInfo.saveButtonClick.click();        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear();Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("abc..def@gmail.com");Driver.wait(2);
        updateInfo.saveButtonClick.click(); Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear();Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys(".abc@gmail.com");Driver.wait(2);
        updateInfo.saveButtonClick.click();        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear();Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("  @gmail.com");Driver.wait(2);
        updateInfo.saveButtonClick.click();        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear(); Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("abcdef@gmail.");Driver.wait(2);
        updateInfo.saveButtonClick.click();        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear();Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("abc@gmail#arcihe.com");Driver.wait(2);
        updateInfo.saveButtonClick.click();        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear();Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("abcdef@gmail");Driver.wait(2);
        updateInfo.saveButtonClick.click();        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());

        updateInfo.emailBoxClick.clear();Driver.wait(2);
        updateInfo.emailBoxClick.sendKeys("abc@gmail..com");Driver.wait(2);
        updateInfo.saveButtonClick.click();
        Driver.wait(2);
        System.out.println(updateInfo.invalidFeedback.getText());
        Driver.wait(2);

    }

    @Then("user assert that user account can not update with invalid email address")
    public void user_assert_that_user_account_can_not_update_with_invalid_email_address() {

        Driver.verifyElementDisplayed(updateInfo.invalidFeedback);

    }
    List<WebElement> languageOptions;
    @Given("user give an option language dropdown")
    public void user_give_an_option_language_dropdown() {

        Select select=new Select(updateInfo.languageSelect);
        languageOptions=select.getOptions();
        System.out.println(languageOptions.get(0).getText());
        System.out.println(languageOptions.get(1).getText());

    }
    @Then("user assert that there is no option other than English and Turkish")
    public void user_assert_that_there_is_no_option_other_than_English_and_Turkish() {
        for (WebElement w:languageOptions ) {
            boolean lang=w.getText().equals("T??rk??e")||w.getText().equals("English") ;
            Assert.assertTrue("user can only select English or Turkish",lang);

        }


    }

}
