package gmibank.pages;

import gmibank.utilities.Driver;
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

    @FindBy(xpath = "//select[@class='form-control is-touched is-dirty av-valid form-control']/option ")
    public WebElement accountType;

    @FindBy(xpath = "//select[@id='tp-account-accountStatusType']/option ")
    public WebElement accountStatusType;

    @FindBy(xpath="//input[@id='tp-account-createDate']")
    public WebElement createDate;

    @FindBy(xpath="//input[@id='tp-account-closedDate']")
    public WebElement closedDate;

    @FindBy(xpath="//select[@id='tp-account-employee']")
    public WebElement employee;







}
