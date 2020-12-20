package gmibank.com.pages;

import gmibank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_19_Page {

    public US_19_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css ="#account-menu")
    public WebElement accountMenu;

    @FindBy(id="login-item")
    public WebElement signIn;

    @FindBy(xpath = "//input[contains(@id,'username')]")
    public WebElement username;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submit;

    @FindBy(id ="entity-menu")
    public WebElement myOperations;

    @FindBy  (xpath = "//span[contains(text(),'Manage Accounts')]")
    public WebElement manageAccounts;

    @FindBy(xpath = "//span[contains(text(),'Create a new Account')]")
    public WebElement newAccount;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement description;

    @FindBy(id = "tp-account-balance")
    public WebElement balance;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountType;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusType;

    @FindBy(id="tp-account-createDate")
    public WebElement createDate;

    @FindBy(id="tp-account-closedDate")
    public WebElement closedDate;

    @FindBy(id="tp-account-employee")
    public WebElement employee;

    @FindBy(id="save-entity")
    public WebElement saveButton;









}
