package gmibank.com.pages;

import gmibank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_18_Page {

    public US_18_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> allOptions;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCostumer;

    @FindBy(xpath = "// tbody//tr//td[5]")
    public List<WebElement> email;

    @FindBy(xpath = "// tbody//tr//td[8]")
    public List<WebElement> address;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")  //*[.='Edit']
    public WebElement editButtonBox;

    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement emailBoxing;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButtonBox;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneBoxing;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public WebElement addressBox;



}
