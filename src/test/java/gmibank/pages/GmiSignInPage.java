package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmiSignInPage {

    public GmiSignInPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css ="#account-menu")
    public WebElement accountMenu;

    @FindBy(id="login-item")
    public WebElement SignIn;

    @FindBy(xpath = "//input[contains(@id,'username')]")
    public WebElement username;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath ="//span[contains(text(),'Operations')]")
    public WebElement myOperations;

    @FindBy(xpath =" //*[text()='Cancel']")
    public WebElement cancelButton;


}
