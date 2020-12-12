package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_016_Page {
    public US_016_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@href='#']")
    public WebElement userIcon;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//a[.='My Accounts']")
    public WebElement myAccounts;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]")
    public WebElement transferMoney;

    @FindBy(xpath = "//td[.='30243']")
    public WebElement account1;

    @FindBy(xpath = "//td[.='32514']")
    public WebElement account2;

    @FindBy(xpath = "//span[.='Hakan Yanbakan']")
    public WebElement userHakan;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(id = "fromAccountId")
    public WebElement idFromDropdown;

    @FindBy(id = "toAccountId")
    public WebElement idToDropdown;

    @FindBy( xpath = "//input[@name='balance']")
    public WebElement balance;

    @FindBy( id = "description")
    public WebElement description;

    @FindBy( id = "make-transfer")
    public WebElement makeTransfer;

    @FindBy( xpath = "//div[contains(text(),'Transfer is succesfull')]")
    public WebElement successMessage;

    @FindBy( xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
    public WebElement firstViewTransaction;

    @FindBy( xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody")
    public WebElement tableTransaction;

}
