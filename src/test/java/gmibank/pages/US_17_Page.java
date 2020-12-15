package gmibank.pages;
import com.github.javafaker.Faker;
import gmibank.stepdefinitions.US_17_StepDefinitions;
import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class US_17_Page {
    public US_17_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // @FindBy(xpath= "//*[@id=\"admin-menu\"]/a/span")
    //  @FindBy(xpath = "//*[@id=\"admin-menu\"]/a/span")
    //*[@id="admin-menu"]
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox ;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox ;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton ;
    @FindBy(css= " #admin-menu")
    public WebElement administrationButton ;
    @FindBy(partialLinkText = "User management")
    public WebElement userManagementButton ;
    @FindBy(partialLinkText= "Create a new user")
    public WebElement createANewUserButton ;
    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginNameBox ;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement nameBox ;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement surnameBox ;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox ;
    @FindBy(id= "langKey")
    public WebElement languageDropDown ;
    @FindBy(xpath = "//*[@id=\"authorities\"]/option[1]")
    public WebElement roleAdminOption ;
    @FindBy(xpath = "//*[@id=\"authorities\"]/option[2]']")
    public WebElement roleUserOption ;
    @FindBy(xpath = "//*[@id=\"authorities\"]/option[3]")
    public WebElement roleEmployeeOption ;
    @FindBy(xpath = "//*[@id=\"authorities\"]/option[4]")
    public WebElement roleManagerOption ;
    @FindBy(xpath = "//*[@id=\"authorities\"]/option[5]")
    public WebElement roleCustomerOption ;
    //@FindBy(xpath = "//button[@type='submit']")
    //*[@id="app-view-container"]/div[1]/div/div/div/div[2]/div/form/button
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div/form/button")
    public WebElement saveButton ;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div[1]/div/span")
    public WebElement lastPageButton ;
    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement selectButton ;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement succesText ;
}