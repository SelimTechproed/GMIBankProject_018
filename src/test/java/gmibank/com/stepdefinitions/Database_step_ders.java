package gmibank.com.stepdefinitions;

import gmibank.com.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static gmibank.com.utilities.DatabaseUtility.*;

public class Database_step_ders {

    public static void main(String[] args) {

        createConnection();
        String queryCustomer = "Select * from tp_customer";
        System.out.println(getColumnNames(queryCustomer));
        System.out.println("===================================================");
        System.out.println(getColumnData(queryCustomer,"first_name"));
        System.out.println("===================================================");
        System.out.println(getCellValue(queryCustomer,1,4));
        closeConnection();

    }

    List<Object> objectList;

    @Given("ders user creates a connection with db using {string} , {string} and {string}")
    public void ders_user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        DatabaseUtility.createConnection(url, user, password);
    }

    @Given("ders user reads the Customers data using {string} and {string}")
    public void ders_user_reads_the_Customers_data_using_and(String query, String ssn) {
       objectList = DatabaseUtility.getColumnData(query, ssn);
        System.out.println(objectList.toString());

    }

    @Then("ders validate customers data")
    public void ders_validate_customers_data() {

        Assert.assertTrue(objectList.contains("357-51-5210"));
        System.out.println("============================================");
        System.out.println("Validation is succesfull");
    }







}
