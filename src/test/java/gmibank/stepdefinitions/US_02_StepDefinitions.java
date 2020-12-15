package gmibank.stepdefinitions;

import gmibank.pages.US_01_02Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class US_02_StepDefinitions {

    US_01_02Page us_01_02Page = new US_01_02Page();

    @Given("Go to registration page {string}")
    public void go_to_registration_page(String string) {
        Driver.getDriver().get(string);

    }

    @Given("Type a valid SSN {string}")
    public void type_a_valid_SSN(String string) {
        us_01_02Page.SSN.sendKeys(string);
    }

    @Given("Type firstname {string}")
    public void type_firstname(String string) {
        us_01_02Page.firstname.sendKeys(string);
    }

    @Given("Type  lastname {string}")
    public void type_lastname(String string) {
        us_01_02Page.lastname.sendKeys(string);
    }

    @Given("Do not enter anything in address box")
    public void do_not_enter_anything_in_address_box() {
        us_01_02Page.address.sendKeys("");
    }

    @Given("Type valid mobile phone number {string}")
    public void type_valid_mobile_phone_number(String string) {
        us_01_02Page.phone.sendKeys(string);
    }

    @Given("Type username {string}")
    public void type_username(String string) {
        us_01_02Page.username.sendKeys(string);
    }

    @Given("Type  email {string}")
    public void type_email(String string) {
        us_01_02Page.email.sendKeys(string);

    }

    @Given("Type valid password {string}")
    public void type_valid_password(String string) {
        us_01_02Page.password.sendKeys(string);
    }

    @Given("Type valid  password confirmation {string}")
    public void type_valid_password_confirmation(String string) throws InterruptedException {
        us_01_02Page.confirm.sendKeys(string);

    }

    @Given("Click register button")
    public void click_register_button() {

        us_01_02Page.button.click();
    }

    @Then("Verify the user register is not success")
    public void verify_the_user_register_is_not_success() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        WebElement verify=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Toastify__toast-body")));
        Assert.assertEquals("translation-not-found[error.ssnexists]",verify.getText());
    }

    @Given("Type address {string}")
    public void type_address(String string) {
        us_01_02Page.address.sendKeys(string);
    }

    @Given("Do not enter anything in  mobile phone number text box")
    public void do_not_enter_anything_in_mobile_phone_number_text_box() {
        us_01_02Page.phone.sendKeys("");
    }



    @Given("Do not enter anything in  last name text box")
    public void do_not_enter_anything_in_last_name_text_box() {
        us_01_02Page.lastname.sendKeys("");
    }

    @Given("Type mobile phone number {string}")
    public void type_mobile_phone_number(String string) {
        us_01_02Page.phone.sendKeys(string);
    }


    @And("Type  username {string}")
    public void typeUsername(String arg0) {

        us_01_02Page.username.sendKeys(arg0);
    }

    @And("Type email {string}")
    public void typeEmail(String arg0) throws InterruptedException {
        Thread.sleep(5000);
        us_01_02Page.email.sendKeys(arg0);
    }

    @Then("Verify the message {string}")
    public void verifyTheMessage(String arg0) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Your Last Name is required']")));
        String verify=message.getText();
        System.out.println(verify);
        boolean content=verify.contains("Your Last Name is required");
        Assert.assertTrue(content);
    }
    @Given("Type any of the punctuation marks except {string} between the numbers in SSN {string}")
    public void type_any_of_the_punctuation_marks_except_between_the_numbers_in_SSN(String string, String string2) {
        us_01_02Page.SSN.sendKeys(string,string2);
    }

    @Then("Verify the red box which has alert {string}")
    public void verify_the_red_box_which_has_alert(String string) {
       /*WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
       WebElement invalidSSN=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='invalid-feedback']")));
       boolean message=invalidSSN.isDisplayed();
       Assert.assertTrue(message);
        */
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(Exception.class);
        WebElement invalid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Edit']")));
        boolean message=invalid.isDisplayed();
        Assert.assertTrue(message);

    }

    @Given("Enter  any of the punctuation marks except {string} between the numbers in mobile phone number text box {string}")
    public void enter_any_of_the_punctuation_marks_except_between_the_numbers_in_mobile_phone_number_text_box(String string, String string2) {
        us_01_02Page.phone.sendKeys(string,string2);
    }


    @And("Enter an email id without -@- mark {string}")
    public void enterAnEmailIdWithoutMark(String arg0) {
        us_01_02Page.email.sendKeys(arg0);
    }


    @And("Enter an email id which extension is  -.c- after -@- mark {string}")
    public void enterAnEmailIdWhichExtensionIsCAfterMark(String arg0) {
        us_01_02Page.email.sendKeys(arg0);
    }

}
