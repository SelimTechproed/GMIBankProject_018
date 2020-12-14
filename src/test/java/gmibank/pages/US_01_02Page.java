package gmibank.pages;
import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class US_01_02Page {
    public US_01_02Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement registration_Menu;
    @FindBy (xpath = "//a[@href  = '/account/register']")
    public WebElement registration_Button;
    @FindBy(id= "ssn")
    public WebElement registration_SSN;
    @FindBy(xpath = "//input[@name = 'firstname']")
    public WebElement registration_FirstName;
    @FindBy(xpath = "//input[@name = 'lastname']")
    public WebElement registration_LastName;
    @FindBy(xpath = "//input[@name = 'address']")
    public WebElement registration_Address;
    @FindBy(xpath = "//input[@name = 'mobilephone']")
    public WebElement registration_MobilePhoneNumber;
    @FindBy(xpath = "//input[@name = 'username']")
    public WebElement registration_userName;
    @FindBy(xpath = "//input[@name = 'email']")
    public WebElement registration_Email;
    @FindBy(xpath = "//input[@name = 'firstPassword']")
    public WebElement registration_FirstPassword;
    @FindBy(xpath = "//input[@name = 'secondPassword']")
    public WebElement registration_SecondPassword;
    @FindBy(id = "register-submit")
    public WebElement registration_SubmitButton;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement registration_successMessage;
    @FindBy(xpath = "//*[contains(text(),'Your First Name is required')]")
    public WebElement registration_alertMessageFirstName;
    @FindBy(xpath = "//*[contains(text(),'Your Last Name is required')]")
    public WebElement registration_alertMessageLastName;
    @FindBy(xpath = "//div[(text() ='Your SSN is invalid')]")
    public WebElement registration_alertMessageSSN;
    @FindBy(xpath = "//div[(text() ='translation-not-found[Your SSN is required]')]")
    public WebElement registration_alertMessageSSN2;
    @FindBy(xpath = "//div[(text() ='Your mobile phone number is invalid')]")
    public WebElement registration_alertMessageMobileNumber;
    @FindBy(xpath = "//div[(text() ='Your username is required.')]")
    public WebElement registration_alertMessageUsername;
    @FindBy(xpath = "//div[(text() ='Your email is required.')]")
    public WebElement registration_alertMessageEmail;
    @FindBy(xpath = "//div[(text() ='Your password is required.')]")
    public WebElement registration_alertMessagePassword;
    @FindBy(xpath = "//div[(text() ='Your confirmation password is required.')]")
    public WebElement registration_alertMessageSecondPassword;
}