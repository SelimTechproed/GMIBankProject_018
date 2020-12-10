package gmibank.pages;

import com.sun.xml.internal.ws.wsdl.writer.W3CAddressingWSDLGeneratorExtension;
import gmibank.utilities.Driver;
import io.cucumber.java.nl.Wanneer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class US_11_Page {

public US_11_Page(){
    PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath="//form/div[1]/div[1]/input[@id='login']")
    public WebElement loginname;
    @FindBy(id="account-menu")
    public WebElement accountMenu;
    @FindBy(id="login-item")
    public WebElement signINButonu;
    @FindBy(name="username")
    public  WebElement usernameBox;
    @FindBy(name="password")
    public WebElement passBox;
    @FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[2]/span[1]")
    public WebElement SignINButonu;
    @FindBy(id="entity-menu")
    public WebElement myOperationButon;
    @FindBy(xpath="//span[contains(text(),'Manage Customers')]")
    public WebElement manageCustomerButonu;
    @FindBy(xpath="//span[contains(text(),'Create a new Customer')]")
    public WebElement createNewCustiomerButonu;










}



