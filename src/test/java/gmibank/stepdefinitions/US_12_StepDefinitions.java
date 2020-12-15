package gmibank.stepdefinitions;
import com.github.javafaker.Faker;
import gmibank.pages.US_12_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
public class US_12_StepDefinitions {
    US_12_Page us_12_page = new US_12_Page();
    Faker faker = new Faker();
    @Given("Benutzer geht zu {string}")
    public void benutzer_geht_zu(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_login_url"));
    }
    @Given("Benutzer sendet einen gültigen Benutzernamen {string}")
    public void benutzer_sendet_einen_gültigen_Benutzernamen(String string) {
        us_12_page.benutzernamen.sendKeys(string);
    }
    @Given("Benutzer sendet ein gültiges Passwort {string}")
    public void benutzer_sendet_ein_gültiges_Passwort(String string) {
        us_12_page.passwort.sendKeys(string);
    }
    @Given("Benutzer klickt auf die login button")
    public void benutzer_klickt_auf_die_login_button() {
        us_12_page.loginbutton.click();
    }
    @Given("Benutzer klickt auf My Operations")
    public void benutzer_klickt_auf_My_Operations() {
        us_12_page.myOperations.click();
    }
    @Given("Benutzer klickt auf Button Manage Custormes")
    public void benutzer_klickt_auf_Button_Manage_Custormes() {
        us_12_page.manageCustomers.click();
        Driver.wait(3);
    }
    @Given("Benutzer muss Id sehen")
    public void benutzer_muss_Id_sehen() {
        us_12_page.idnummer.isDisplayed();
    }
    @Given("Benutzer muss First Name sehen")
    public void benutzer_muss_First_Name_sehen() {
        us_12_page.firstname.isDisplayed();
    }
    @Given("Benutzer muss Last Name sehen")
    public void benutzer_muss_Last_Name_sehen() {
        us_12_page.lastname.isDisplayed();
    }
    @Given("Benutzer muss Middle Initial sehen")
    public void benutzer_muss_Middle_Initial_sehen() {
        us_12_page.middleinitial.isDisplayed();
    }
    @Given("Benutzer muss Email sehen")
    public void benutzer_muss_Email_sehen() {
        us_12_page.email.isDisplayed();
    }
    @Given("Benutzer muss MobilePhone Number sehen")
    public void benutzer_muss_MobilePhone_Number_sehen() {
        us_12_page.mobilePhone.isDisplayed();
    }
    @Given("Benutzer muss Phone Number sehen")
    public void benutzer_muss_Phone_Number_sehen() {
        us_12_page.phoneNumber.isDisplayed();
    }
    @Given("Benutzer soll Adress sehen")
    public void benutzer_soll_Address_sehen() {
        us_12_page.adress.isDisplayed();
    }
    @Then("Benutzer muss Create Date sehen")
    public void benutzer_muss_Create_Date_sehen() {
        us_12_page.createDate.isDisplayed();
    }
    @Given("Benutzer sieht und klickt auf die View")
    public void benutzer_sieht_und_klickt_auf_die_View() throws InterruptedException {
        us_12_page.viewButton.click();
        Driver.wait(2);
        Driver.getDriver().navigate().back();
        Driver.wait(2);
        Driver.verifyElementDisplayed(us_12_page.viewButton);
    }
    @Given("Benutzer sieht und klickt auf die Edit")
    public void benutzer_sieht_und_klickt_auf_die_Edit() {
        us_12_page.editButton.click();
        Driver.wait(2);
        Driver.getDriver().navigate().back();
        Driver.wait(2);
        Driver.verifyElementDisplayed(us_12_page.editButton);
    }
    @Then("Benutzer sieht und klickt auf die Delete")
    public void benutzer_sieht_und_klickt_auf_die_Delete() {
        us_12_page.deleteButton.click();
        Driver.verifyElementDisplayed(us_12_page.deleteButton);
        Driver.wait(2);
        Driver.getDriver().navigate().back();
        Driver.wait(2);
    }
    @Given("Benutzer sieht und klickt auf die Button Edit")
    public void benutzer_sieht_und_klickt_auf_die_Button_Edit() {
        us_12_page.viewButton.click();
        Driver.wait(2);
        us_12_page.edit2Button.click();
        Driver.verifyElementDisplayed(us_12_page.edit2Button);
    }
    @Given("TC_{int} Benutzer sieht und klickt auf die Edit")
    public void tc__Benutzer_sieht_und_klickt_auf_die_Edit(Integer int1) {
        us_12_page.editButton.click();
        Driver.wait(2);
    }
    @Given("Benutzer muss First Name geben")
    public void benutzer_muss_First_Name_geben() {
        us_12_page.vorname.clear();
        Driver.wait(2);
        us_12_page.vorname.sendKeys(faker.name().firstName());
        Driver.wait(2);
    }
    @Given("Benutzer muss Last Name geben")
    public void benutzer_muss_Last_Name_geben() {
        us_12_page.nachname.clear();
        Driver.wait(2);
        us_12_page.nachname.sendKeys(faker.name().lastName());
        Driver.wait(2);
    }
    @Given("Benutzer muss Middle Initial geben")
    public void benutzer_muss_Middle_Initial_geben() {
        us_12_page.intial.clear();
        Driver.wait(2);
        us_12_page.intial.sendKeys(faker.name().title());
        Driver.wait(2);
    }
    @Given("Benutzer muss Email geben")
    public void benutzer_muss_Email_geben() {
        us_12_page.email2.clear();
        Driver.wait(2);
        us_12_page.email2.sendKeys(faker.internet().emailAddress());
        Driver.wait(2);
    }
    @Given("Benutzer muss MobilePhone Number geben")
    public void benutzer_muss_MobilePhone_Number_geben() {
        us_12_page.mobilenum.clear();
        Driver.wait(2);
        String mobilphonenum = faker.number().digits(3)+ "-"+faker.number().digits(3)+"-"+faker.number().digits(4);
        us_12_page.mobilenum.sendKeys(mobilphonenum);
        Driver.wait(2);
    }
    @Given("Benutzer muss Phone Number geben")
    public void benutzer_muss_Phone_Number_geben() {
        us_12_page.phonnummer.clear();
        Driver.wait(2);
        String mobilphonenum = faker.number().digits(3)+ "-"+faker.number().digits(3)+"-"+faker.number().digits(4);
        us_12_page.phonnummer.sendKeys(mobilphonenum);
        Driver.wait(2);
    }
    @Given("Benutzer soll Adress geben")
    public void benutzer_soll_Adress_geben() {
        us_12_page.address.clear();
        Driver.wait(2);
        us_12_page.address.sendKeys(faker.address().streetAddress());
        Driver.wait(2);
    }
    @Then("Benutzer muss Create Date geben")
    public void benutzer_muss_Create_Date_geben() {
        us_12_page.createdate.clear();
        Driver.wait(2);
        us_12_page.createdate.sendKeys("12.12.20");
        Driver.wait(2);
    }
}