package gmibank.stepdefinitions;

import gmibank.pages.US_03_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US_03_StepDefinitions {

    US_03_Page us_03_page = new US_03_Page();

    @Given("User go to the GMi Bank home page")
    public void userGoToTheGMiBankHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }
    @And("Click on user button")
    public void clickOnUserButton() {
        us_03_page.userButton.click();
    }
    @And("You should navigate to registration page")
    public void youShouldNavigateToRegistrationPage() {
        us_03_page.registerButton.click();
    }
    @And("Click on Password textbox")
    public void clickOnPasswordTextbox() {
        us_03_page.firstPassBox.click();
    }
    @And("Enter a password with 1 lowercase letter of at least 7 characters")
    public void enterAPasswordWithLowercaseLetterOfAtLeastCharacters() {
        us_03_page.firstPassBox.sendKeys(ConfigurationReader.getProperty("lower_case"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("red")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 1 uppercase letter of at least 7 characters")
    public void enterAPasswordWithUppercaseLetterOfAtLeastCharacters() {
        us_03_page.firstPassBox.sendKeys(ConfigurationReader.getProperty("upper_case"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("orange")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 1 digit of at least 7 characters")
    public void enterAPasswordWithDigitOfAtLeastCharacters() {
        us_03_page.firstPassBox.sendKeys(ConfigurationReader.getProperty("digit"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("lime")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 1 special char of at least 7 characters")
    public void enterAPasswordWithSpecialCharOfAtLeastCharacters() {
        us_03_page.firstPassBox.sendKeys(ConfigurationReader.getProperty("special_char"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("green")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 7 chars")
    public void enterAPasswordWithChars() {
        us_03_page.firstPassBox.sendKeys(ConfigurationReader.getProperty("full_pass"));
        String renk = us_03_page.line1.getCssValue("background-color");
        System.out.println(renk);
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("green")));
        Driver.passwordReliability();
    }
    @And("Click on password confirmation textbox")
    public void clickOnPasswordConfirmationTextbox() {
        us_03_page.secondPassBox.click();
    }
    @Then("Enter to second textbox with 1 lowercase letter of at least 7 characters")
    public void enterToSecondTextboxWithLowercaseLetterOfAtLeastCharacters() {
        us_03_page.secondPassBox.sendKeys(ConfigurationReader.getProperty("lower_case"));
    }
    @Then("Enter to second textbox with 1 uppercase letter of at least 7 characters")
    public void enterToSecondTextboxWithUppercaseLetterOfAtLeastCharacters() {
        us_03_page.secondPassBox.sendKeys(ConfigurationReader.getProperty("upper_case"));
    }
    @Then("Enter to second textbox with 1 digit of at least 7 characters")
    public void enterToSecondTextboxWithDigitOfAtLeastCharacters() {
        us_03_page.secondPassBox.sendKeys(ConfigurationReader.getProperty("digit"));
    }
    @Then("Enter to second textbox with 1 special char of at least 7 characters")
    public void enterToSecondTextboxWithSpecialCharOfAtLeastCharacters() {
        us_03_page.secondPassBox.sendKeys(ConfigurationReader.getProperty("special_char"));
    }
    @Then("Enter to second textbox a password with 7 chars")
    public void enterToSecondTextboxAPasswordWithChars() {
        us_03_page.secondPassBox.sendKeys(ConfigurationReader.getProperty("full_pass"));
    }
    @And("Color line must be orange or green")
    public void colorLineMustBeOrangeOrGreen() {
    }


}
