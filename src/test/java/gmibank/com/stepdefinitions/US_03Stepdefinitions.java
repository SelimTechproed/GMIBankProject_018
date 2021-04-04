package gmibank.com.stepdefinitions;

import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.Driver;
import io.cucumber.java.en.Given;

public class US_03Stepdefinitions {
    @Given("kullanici gmibank_url gider")
    public void kullanici_gmibank_url_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }


}
