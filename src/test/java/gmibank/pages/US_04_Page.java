package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_04_Page {
    public US_04_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"account-menu\"]")
    public WebElement accountmenu;
    @FindBy(id = "login-item")
    public WebElement signin;
    @FindBy(id = "username")
    public WebElement usernameBox;
    @FindBy(name= "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signinButton;
}
