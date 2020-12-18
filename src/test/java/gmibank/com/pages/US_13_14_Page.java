package gmibank.com.pages;

import gmibank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_13_14_Page {

    public US_13_14_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath="//div[@class='alert alert-danger fade show']")
    public WebElement alertFailMessage;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(id="account-menu")
    public WebElement loginDropDown;

    @FindBy(id="login-item")
    public WebElement signInText;

    @FindBy(id= "login-title")
    public WebElement signInPage;

    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement resetPasswordOption;

    @FindBy(xpath="//*[.='Reset your password']")
    public WebElement resetPasswordNewText;

    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[2]//a//span")
    public WebElement againRegisterOption;

    @FindBy(id = "register-title")
    public WebElement registerTitle;

//    @FindBy(xpath = "//input[@name='username']")
//    public WebElement username_employee;
//
//    @FindBy(xpath = "//input[@id='password']")
//    public WebElement password_employee;

    @FindBy (xpath = "//a[@id='jh-create-entity']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy (xpath = "//input[@name='balance']")
    public WebElement balanceTextBox;

    @FindBy (id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy (id = "tp-account-accountStatusType")
    public WebElement accountStatusDropdown;

    @FindBy (name = "createDate")
    public WebElement createDate;

    @FindBy (name = "closedDate")
    public WebElement closedDate;

    @FindBy (id = "tp-account-employee")
    public WebElement employeeDropdown;

    @FindBy (id = "save-entity")
    public WebElement saveButton;

    @FindBy (xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement descriptionsErrorMessage;


    @FindBy (xpath = "(//div[.='This field is required.'])[4]")
    public WebElement balanceErrorMessage;

    @FindBy (xpath = "//input[@name='createDate']")
    public WebElement createDateBox;

    @FindBy (xpath = "//input[@name='closedDate']")
    public WebElement closedDateBox;

    @FindBy (xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement firstIDitem;

    @FindBy(xpath = "//span[.='Account']")
    public WebElement accountInformation;

    @FindBy (xpath = "//span[.='You are not authorized to access this page.']")
    public WebElement negativeMessage;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperationsDropdown;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myAccountDropdown;

    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccount;

    @FindBy (xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomer;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement userDropdown;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement dropdownPasswordtext;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement myAccountOption;

    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;

    @FindBy(id = "search-ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//button[.='Search']")
    public WebElement searchButton;

    @FindBy(id = "tp-customer-user")
    public WebElement userBox;

    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement lastpagebutton;

    @FindBy(xpath = "//*[.='First Name']")
    public WebElement firstNameText;

    @FindBy(xpath = "//*[.='Last Name']")
    public WebElement lastNameText;

    @FindBy(xpath = "//*[.='Middle Initial']")
    public WebElement middleInitialText;

    @FindBy(xpath = "//*[.='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//*[.='Mobile Phone Number']")
    public WebElement mobilPhoneNumberText;

    @FindBy(xpath = "//*[.='Phone Number']")
    public WebElement phoneNumberText;

    @FindBy(xpath = "//*[.='Address']")
    public WebElement addressText;

    @FindBy(xpath = "//*[.='Create Date']")
    public WebElement createDateText;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[2]")
    public WebElement editButton;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameBox;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastNameBox;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitialBox;

    @FindBy(id = "tp-customer-email")
    public WebElement emailBox;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement mobilePhoneNumberBox;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCode;

    @FindBy(id = "tp-customer-address")
    public WebElement addressBox;

    @FindBy(id = "tp-customer-city")
    public WebElement cityBox;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssnBox;

    @FindBy(id = "tp-customer-country")
    public WebElement countryDropdown;

    @FindBy(id = "tp-customer-state")
    public WebElement stateBox;


    @FindBy(id = "tp-customer-account")
    public WebElement accountDropdown;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledRadButton;

    @FindBy(id = "tp-customer-account")
    public WebElement statusDropdown;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement alertDeleteButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertErrorMessage;

    @FindBy(xpath= "//div[@style='pointer-events: none;']")
    public WebElement confirmMessage;

    @FindBy(id = "gmibankfrontendApp.tPCustomer.delete.question")
    public WebElement alertConfirmMessage;

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

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "middleInitial")
    public WebElement middleInitial;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(id = "tp-customer-account")
    public WebElement account;

    @FindBy(id = "zelleEnrolledLabel")
    public WebElement zelleEnrolled;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy (xpath = "(//option[.='my first account'])[2]")
    public WebElement account1;

    @FindBy (xpath = "//option[.='my second account']")
    public WebElement account2;





}
