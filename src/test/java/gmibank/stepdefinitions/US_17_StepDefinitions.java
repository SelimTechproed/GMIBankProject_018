package gmibank.stepdefinitions;
import com.github.javafaker.Faker;
import gmibank.pages.US_08_Page;
import gmibank.pages.US_17_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.JSExecutor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class US_17_StepDefinitions {
    US_17_Page us17Page = new US_17_Page();
    @Given("user goes to {string} page")
    public void user_goes_to_page(String string) {
        Driver.getDriver().get(string);
    }
    @Given("admin provides valid username for admin")
    public void admin_provides_valid_username_for_admin() {
        us17Page.userNameBox.sendKeys(ConfigurationReader.getProperty("admin_username"));
    }
    @Given("admin provides valid password for admin")
    public void admin_provides_valid_password_for_admin() {
        us17Page.passwordBox.sendKeys(ConfigurationReader.getProperty("admin_password"));
    }
    @Given("admin clicks sign in button for admin")
    public void admin_clicks_sign_in_button_for_admin() {
        us17Page.signInButton.click();
        Driver.wait(4);
    }
    @Then("admin creates one user from faker then selects one role as {string} from profiles dropdown and clicks save button")
    public void admin_creates_one_user_from_faker_then_selects_one_role_as_from_profiles_dropdown_and_clicks_save_button(String string) {
        Driver.wait(3);
        Driver.wait(3);
        us17Page.administrationButton.click();
        Driver.wait(10);
        us17Page.userManagementButton.click();
        Driver.wait(2);
        //  Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=1&sort=id,asc");
        Driver.wait(2);
        us17Page.createANewUserButton.click();
        Driver.wait(3);
        Faker faker = new Faker();
        String loginName = faker.name().username();
        us17Page.loginNameBox.sendKeys(loginName);
        us17Page.nameBox.sendKeys(faker.name().firstName());
        us17Page.surnameBox.sendKeys(faker.name().lastName());
        us17Page.emailBox.sendKeys(faker.internet().emailAddress());
        Select selectLanguage = new Select(us17Page.languageDropDown);
        selectLanguage.selectByVisibleText("English");
        us17Page.roleAdminOption.click();
        us17Page.saveButton.click();
        Driver.wait(5);
   //     Actions actions = new Actions(Driver.getDriver());
    //    actions.sendKeys(Keys.PAGE_DOWN).perform();
   //     Driver.wait(3);
   //     actions.sendKeys(Keys.PAGE_DOWN).perform();
  //      Driver.wait(3);
        //    JSExecutor.clickElementByJS(us17Page.lastPageButton);
        //   Assert.assertTrue(us17Page.lastPageButton.isEnabled());
        //us17Page.lastPageButton.click();
        String lastPageText = us17Page.lastPageButton.getText();
        //Showing 1 - 20 of 1052 items.
        System.out.println(lastPageText + lastPageText.substring(18, 22));
        System.out.println(Integer.parseInt(lastPageText.substring(18, 22)));
        double lastPageNumber = Math.ceil((Integer.parseInt(lastPageText.substring(18, 22))) / 20.0);
        System.out.println(lastPageNumber);
        double lastPageNumber1 = Math.abs(lastPageNumber);
        System.out.println(lastPageNumber1);
        // Driver.wait(2);
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=" + lastPageNumber1 + "&sort=id,asc");
        Driver.wait(3);
      //  actions.sendKeys(Keys.PAGE_DOWN).perform();
      //  Driver.wait(3);
      //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(3);
        System.out.println("loginName:" + loginName + " dir");
        Driver.wait(3);
        WebElement lastEditButton = Driver.getDriver().findElement(By.xpath("//tr[@id='" + loginName + "']/td[10]/div/a[2]"));
        JSExecutor.clickElementByJS(lastEditButton);
        Driver.wait(3);
        if (string.equals("ROLE-ADMIN")) {
         //   actions.sendKeys(Keys.PAGE_DOWN).perform();
            Driver.wait(2);
            Select select = new Select(us17Page.selectButton);
            select.selectByIndex(0);
            us17Page.saveButton.click();
            Driver.wait(2);
        } else if (string.equals("ROLE-USER")) {
    //        actions.sendKeys(Keys.PAGE_DOWN).perform();
            Driver.wait(2);
            Select select = new Select(us17Page.selectButton);
            select.selectByIndex(1);
            us17Page.saveButton.click();
            Driver.wait(2);
        } else if (string.equals("ROLE-EMPLOYEE")) {
     //       actions.sendKeys(Keys.PAGE_DOWN).perform();
            Driver.wait(2);
            Select select = new Select(us17Page.selectButton);
            Driver.wait(2);
            select.selectByIndex(2);
            Driver.wait(2);
            us17Page.saveButton.click();
            Driver.wait(2);
        } else if (string.equals("ROLE-MANAGER")) {
     //       actions.sendKeys(Keys.PAGE_DOWN).perform();
            Driver.wait(2);
            Select select = new Select(us17Page.selectButton);
            select.selectByIndex(3);
            us17Page.saveButton.click();
            Driver.wait(2);
        } else if (string.equals("ROLE-CUSTOMER")) {
      //      actions.sendKeys(Keys.PAGE_DOWN).perform();
            Driver.wait(2);
            Select select = new Select(us17Page.selectButton);
            select.selectByIndex(4);
            us17Page.saveButton.click();
            Driver.wait(2);
        }
        Driver.wait(5);
        // String text= us17Page.succesText.getText();
        String pageText = Driver.getDriver().getPageSource();
        Driver.wait(5);
        //  System.out.println(pageText);
        Assert.assertTrue(pageText.contains("success"));
        System.out.println("Admin can update user with " + string);
        Driver.wait(2);
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=" + lastPageNumber1 + "&sort=id,asc");
        Driver.wait(3);
    //    actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(3);
        Driver.wait(3);
        WebElement lastViewButton = Driver.getDriver().findElement(By.xpath("//tr[@id='" + loginName + "']/td[10]/div/a[1]"));
        Driver.wait(3);
        boolean result = lastViewButton.isEnabled();
        Assert.assertTrue(result);
        System.out.println("View button clickable");
        Driver.wait(3);
        WebElement lastEditButton1 = Driver.getDriver().findElement(By.xpath("//tr[@id='" + loginName + "']/td[10]/div/a[2]"));
        Driver.wait(3);
        boolean result2 = lastEditButton1.isEnabled();
        Assert.assertTrue(result2);
        System.out.println("Edit button clickable");
        Driver.wait(3);
        WebElement lastDeleteButton = Driver.getDriver().findElement(By.xpath("//tr[@id='" + loginName + "']/td[10]/div/a[3]"));
        Driver.wait(3);
        boolean result3 = lastEditButton1.isEnabled();
        Assert.assertTrue(result3);
        System.out.println("Delete button clickable");
        //Driver.getDriver().quit();
    }
}