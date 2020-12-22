package gmibank.com.pages;

import gmibank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_Page {
    public US_08_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox ;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox ;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton ;


    @FindBy(id = "account-menu")
    public WebElement accountButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/nav/div/ul/li[9]/div/a[2]/span")
    public WebElement passwordButton;

    @FindBy(id = "currentPassword")
    public WebElement currentPasswordBox;

    @FindBy(id = "newPassword")
    public WebElement   newPasswordBox;

    @FindBy(id = "confirmPassword")
    public WebElement   newPasswordConfirmationBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement   saveButton;

    @FindBy(xpath= "//li[@class='point'][1]")
    public WebElement  line1;

}
