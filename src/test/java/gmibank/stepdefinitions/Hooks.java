package gmibank.stepdefinitions;

import gmibank.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before(order = 1)
    public void setUp(){

    }

    @Before(value = "iphone",order = 2)
    public void searchIphone(){

    }


    public void tearDown(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }

      Driver.closeDriver();
    }




}
