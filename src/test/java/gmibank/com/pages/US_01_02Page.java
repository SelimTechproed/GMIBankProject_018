package gmibank.com.pages;
import gmibank.com.utilities.Driver;
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
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSN;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='lastname']")
    public  WebElement lastname;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "mobilephone")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement password;

    @FindBy(id = "secondPassword")
    public WebElement confirm;

    @FindBy(id = "register-submit")
    public WebElement button;

    @FindBy(xpath = "//div[.='Registration saved!']")
    public WebElement successverify;

    @FindBy(css = ".Toastify__toast-body")
    public WebElement errorverify;

    @FindBy(xpath = "//div[.='Your SSN is invalid']")
    public WebElement invalidSSNmessage;
}