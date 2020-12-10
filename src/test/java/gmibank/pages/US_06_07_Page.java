package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  US_06_07_Page{

    public US_06_07_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id = "account-menu")
    public WebElement accountMenu;

    @FindBy (id = "login-item")
    public WebElement signInPrimary;

    @FindBy (id = "username")
    public WebElement userName;

    @FindBy (name = "password")
    public WebElement passWord;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButton;

    @FindBy (css = "#account-menu > a > span")
    public WebElement clickOnUsername;

    @FindBy (xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement userInfoClick;

    @FindBy (id = "firstName")
    public WebElement firstNameBoxClick;

    @FindBy (id = "lastName")
    public WebElement lastNameBoxClick;

    @FindBy (id = "email")
    public WebElement emailBoxClick;

    @FindBy (id = "langKey")
    public WebElement languageSelect;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButtonClick;

    @FindBy(xpath="//div[@role='alert']//span//strong")
    public WebElement settingsSaveMessage;

    @FindBy(xpath="//div[@class='invalid-feedback']")
    public WebElement invalidFeedback;



}
