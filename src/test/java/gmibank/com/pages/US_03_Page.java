package gmibank.com.pages;

import gmibank.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_03_Page {

    public static US_03_Page us_03_page;

    public US_03_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement userButton;
    @FindBy (xpath = "//*[.='Register']")
    public WebElement registerButton;
    @FindBy (id = "firstPassword")
    public WebElement firstPassBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement messageUnderTextBox;
    @FindBy (id = "secondPassword")
    public WebElement secondPassBox;
    @FindBy (xpath = "(//li[@class='point'])[1]")
    public WebElement line1;
    @FindBy (xpath = "(//li[@class='point'])[2]")
    public WebElement line2;
    @FindBy (xpath = "(//li[@class='point'])[3]")
    public WebElement line3;
    @FindBy (xpath = "(//li[@class='point'])[4]")
    public WebElement line4;
    @FindBy (xpath = "(//li[@class='point'])[5]")
    public WebElement line5;

}
