package gmibank.com.stepdefinitions;

import gmibank.com.pojos.Customer;
import gmibank.com.utilities.DatabaseUtility;
import gmibank.com.utilities.ReadTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static gmibank.com.utilities.DatabaseUtility.*;

public class database_stepdef {

    public static void main(String[] args) {
        createConnection();
        String queryCustomer = "Select * from tp_customer;";
        System.out.println(getColumnNames(queryCustomer));
       // System.out.println(getColumnData(queryCustomer,"first_name"));
        System.out.println(getCellValue(queryCustomer,1,1));
        closeConnection();

    }

    List<Object> objectList = new ArrayList<>();


    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String user, String password) {
      DatabaseUtility.createConnection(url, user, password);
    }

    @Given("user reads the Customers data using {string} and {string}")
    public void user_reads_the_Customers_data_using_and(String query, String ssn) {
       objectList = DatabaseUtility.getColumnData(query, ssn);
        System.out.println(objectList.toString());
        System.out.println("============================================");

    }

    @Then("validate customers data")
    public void validate_customers_data() {
     List<String> stringApiList = ReadTxt.returnCustomerSNNList("allCustomerSsn.txt");
      //  System.out.println(stringApiList);
     List<String> objectToString = new ArrayList<>();
     for(int i = 0 ; i < objectList.size() ; i++) {
             objectToString.add(objectList.get(i).toString().trim());
     }

        Assert.assertTrue("not match",objectToString.contains(stringApiList));
        System.out.println("Validation is succesfull");

    }

}
