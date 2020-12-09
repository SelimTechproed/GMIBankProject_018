package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  US_06_07_Page{

    public US_06_07_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
//1
    @FindBy (id = "account-menu")
    public WebElement accountMenu;
//2
    @FindBy (id = "login-item")
    public WebElement signInPrimary;
//3
    @FindBy (id = "username")
    public WebElement userName;
//4
    @FindBy (name = "password")
    public WebElement passWord;
//5
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButton;
//6
    @FindBy (css = "#account-menu > a > span")
    public WebElement clickOnUsername;
//7
    @FindBy (xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement userInfoClick;
//8
    @FindBy (id = "firstName")
    public WebElement firstNameBoxClick;
//9
    @FindBy (id = "lastName")
    public WebElement lastNameBoxClick;
//10
    @FindBy (id = "email")
    public WebElement emailBoxClick;
//11
    @FindBy (id = "langKey")
    public WebElement languageSelect;
//12
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButtonClick;
//13
    @FindBy(xpath="//div[@role='alert']//span//strong")
    public WebElement settingsSaveMessage;
//14
    @FindBy(xpath="//div[@class='invalid-feedback']")
    public WebElement invalidFeedback;



}
