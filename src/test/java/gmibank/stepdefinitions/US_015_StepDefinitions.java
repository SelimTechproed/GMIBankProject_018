package gmibank.stepdefinitions;

import gmibank.pages.US_015_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US_015_StepDefinitions {

    US_015_Page page = new US_015_Page();


    @Given("user logs in with the valid employee username {string}")
    public void user_logs_in_with_the_valid_employee_username(String string) {
        page.username.sendKeys(string);
    }

    @Given("user logs in with the valid employee password {string}")
    public void user_logs_in_with_the_valid_employee_password(String string) {
        page.password.sendKeys(string);
    }

    @Given("user should goes Manage Accounts box")
    public void user_should_goes_Manage_Accounts_box() {
        page.manageAcc.click();
    }

    @Given("user should sees all Account Types")
    public void user_should_sees_all_Account_Types() {
        for (WebElement element : page.accountType) {
            System.out.println("Account Types :" + element.getText());
            boolean account = element.isDisplayed();
            Assert.assertTrue("Test Passed", account);
            System.out.println(account);
        }

    }

    @Given("user should sees all Balance")
    public void user_should_sees_all_Balance() {
        for (WebElement element : page.balance) {
            System.out.println("Balance :" + element.getText());
            boolean balance = element.isDisplayed();
            Assert.assertTrue("Test Passed", balance);
            System.out.println(balance);
        }

    }

    @Then("user signOut from the employee page")
    public void user_signOut_from_the_employee_page() {
        page.userEmployee.click();
        Driver.wait(1);
        page.signOut.click();
    }

    @Given("user should clicks and sees View Transaction")
    public void user_should_clicks_and_sees_View_Transaction() {

        List<String> list = new ArrayList<>();
        for (WebElement element : page.transactions) {
            list.add(element.getText());
            list.stream().forEach(System.out::println);
            boolean transaction = element.isDisplayed();
            Assert.assertTrue(transaction);
            System.out.println("Total : " + "There are " + page.transactions.size() + " row in table.");

        }
    }
}



