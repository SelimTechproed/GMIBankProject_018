package gmibank.pages;
import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class US_12_Page {
    public US_12_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement benutzernamen;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwort;
    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement loginbutton;
    @FindBy(id = "entity-menu")
    public WebElement myOperations;
    @FindBy(className = "dropdown-item")
    public WebElement manageCustomers;
    @FindBy(xpath = "//span[.='ID']")
    public WebElement idnummer;
    @FindBy(xpath = "//span[.='First Name']")
    public WebElement firstname;
    @FindBy(xpath = "//span[.='Last Name']")
    public WebElement lastname;
    @FindBy(xpath = "//span[.='Middle Initial']")
    public WebElement middleinitial;
    @FindBy(xpath = "//*[.='Email']")
    public WebElement email;
    @FindBy(xpath = "//*[.='Mobile Phone Number']")
    public WebElement mobilePhone;
    @FindBy(xpath = "//*[.='Phone Number']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//*[.='Address']")
    public WebElement adress;
    @FindBy(xpath = "//*[.='Create Date']")
    public WebElement createDate;
    @FindBy(xpath = "//*[.='View']")
    public WebElement viewButton;
    @FindBy(xpath = "//*[.='Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;
    @FindBy(xpath = "(//*[@id=\"app-view-container\"]/div[1]/div/div/div/div/a[2]/span/span")
    public WebElement edit2Button;
    @FindBy(xpath = "//*[@id=\"tp-customer-id\"]")
    public WebElement idNum;
    @FindBy(xpath = "//*[@id=\"tp-customer-firstName\"]")
    public WebElement vorname;
    @FindBy(xpath = "//*[@id=\"tp-customer-lastName\"]")
    public WebElement nachname;
    @FindBy(xpath = "//*[@id=\"tp-customer-middleInitial\"]")
    public WebElement intial;
    @FindBy(xpath = "//*[@id=\"tp-customer-email\"]")
    public WebElement email2;
    @FindBy(xpath = "///*[@id=\"tp-customer-mobilePhoneNumber\"]")
    public WebElement mobilenum;
    @FindBy(xpath = "//*[@id=\"tp-customer-phoneNumber\"]")
    public WebElement phonnummer;
    @FindBy(xpath = "//*[@id=\"tp-customer-zipCode\"]")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@id=\"tp-customer-address\"]")
    public WebElement address;
    @FindBy(xpath = "//*[@id=\"tp-customer-city\"]")
    public WebElement stadt;
    @FindBy(xpath = "//*[@id=\"tp-customer-ssn\"]")
    public WebElement ssn;
    @FindBy(xpath = "//*[@id=\"tp-customer-createDate\"]")
    public WebElement createdate;
    @FindBy(xpath = "//*[@id=\"tp-customer-country\"]")
    public WebElement region;
    @FindBy(xpath = "//*[@id=\"tp-customer-state\"]")
    public WebElement state;
    @FindBy(xpath = "//*[@id=\"tp-customer-user\"]")
    public WebElement user;
    @FindBy(xpath = "//*[@id=\"tp-customer-account\"]/option[8]")
    public WebElement account;
    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement save;

}