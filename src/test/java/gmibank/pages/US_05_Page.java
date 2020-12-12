package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_05_Page {
    public US_05_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy (id = "login-item")
    public WebElement login;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement signinButton;

    @FindBy (xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[3]/a/span")
    public WebElement resetpassword;

    @FindBy (xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[4]/a/span")
    public WebElement registernew;



}
