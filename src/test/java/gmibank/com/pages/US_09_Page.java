package gmibank.com.pages;

import gmibank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_09_Page {
    public US_09_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(className = "dropdown-item")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomer;

    @FindBy(id = "search-ssn")
    public WebElement ssnSearch;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement search;

    @FindBy(className = "Toastify__toast-body")
    public WebElement successMessage;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "middleInitial")
    public WebElement middleInitial;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(name = "zipCode")
    public WebElement zipCode;

    @FindBy(name = "address")
    public WebElement addressBox;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "ssn")
    public WebElement ssnBox;

    @FindBy(name = "createDate")
    public WebElement createDate;

    @FindBy(name = "country.id")
    public WebElement countryDropdown;

    @FindBy(name = "state")
    public WebElement stateBox;

    @FindBy(name = "user.id")
    public WebElement userDropdown;

    @FindBy(id = "tp-customer-account")
    public WebElement account;

    @FindBy(id = "zelleEnrolledLabel")
    public WebElement zelleEnrolled;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy (xpath = "(//option[.='my first account'])[2]")
    public WebElement account1;

    @FindBy (xpath = "//option[.='my second account']")
    public WebElement account2;


}
