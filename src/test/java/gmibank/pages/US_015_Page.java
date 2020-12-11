package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_015_Page {
    public US_015_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy( id = "username")
    public WebElement username;

    @FindBy( id = "password")
    public WebElement password;

    @FindBy( xpath = "//span[contains(text(),'Manage Accounts')]")
    public WebElement manageAcc;

    @FindBy( xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody/tr/td[4]")
    public List<WebElement> accountType;

    @FindBy( xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody/tr/td[3]")
    public List<WebElement> balance;

    @FindBy( xpath = "//table/tbody/tr")
    public List<WebElement> transactions;

    @FindBy( xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/a[1]")
    public WebElement userEmployee;

    @FindBy( xpath = "//span[.='Sign out']")
    public WebElement signOut;



}