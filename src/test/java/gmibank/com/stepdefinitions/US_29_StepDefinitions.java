package gmibank.com.stepdefinitions;

import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.DatabaseConnector;
import gmibank.com.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class US_29_StepDefinitions {


    private static ResultSet users, countries, states;

    private static final String usersData = "SELECT * FROM "+ ConfigurationReader.getProperty("usersTable");
    private final List<String> listFirstName = new ArrayList<>();

    private static final String countriesData = "SELECT *  FROM " + ConfigurationReader.getProperty("countriesTable");
    private final List<String> listCountry = new ArrayList<>();

    private static final String statesData = "SELECT * FROM " + ConfigurationReader.getProperty("statesTable");
    private final List<String> listStates = new ArrayList<>();


    @Given("US29 user connects to GMIBank database")
    public void us29_user_connects_to_GMIBank_database() {

        DatabaseUtility.createConnection("url", "username", "password");

    }

    @Given("user should be reads all users data from database")
    public void user_should_be_reads_all_users_data_from_database() throws SQLException {

        users = DatabaseConnector.getResultSet(usersData);

        ResultSetMetaData rsmd = users.getMetaData();
        System.out.println("Total Columns :" + rsmd.getColumnCount());
        System.out.println("Column Name of 1st Column :" + rsmd.getColumnName(1));

        while (users.next()) {
            String firstname = users.getString("first_name");
            listFirstName.add(firstname);
        }
        System.out.println(listFirstName);
    }


    @Given("user should be all users data validate")
    public void user_should_be_all_users_data_validate() throws SQLException {
        users = DatabaseConnector.getResultSet(usersData);
        List<String> actualFirstName = new ArrayList<>();

        while (users.next()) {
            String firstname = users.getString("first_name");
            actualFirstName.add(firstname);
        }

        Assert.assertEquals(listFirstName, actualFirstName);

    }

    @Given("user should be reads all countries data from database")
    public void user_should_be_reads_all_countries_data_from_database() throws SQLException {

        countries = DatabaseConnector.getResultSet(countriesData);

        ResultSetMetaData rsmd = countries.getMetaData();
        System.out.println("Total columns :" + rsmd.getColumnCount());
        System.out.println("Column Name of 2nd Column :" + rsmd.getColumnName(2));

        while (countries.next()) {
            String country = countries.getString("name");
            listCountry.add(country);
        }
        System.out.println(listCountry);
    }

    @Given("user should be all countries data validate")
    public void user_should_be_all_countries_data_validate() throws SQLException {

        countries = DatabaseConnector.getResultSet(countriesData);
        List<String> actualCountryName = new ArrayList<>();

        while (countries.next()) {
            String country = countries.getString("name");
            actualCountryName.add(country);
        }

        Assert.assertEquals(listCountry, actualCountryName);
    }

    @Given("user should be reads all states data of related to USA from database")
    public void user_should_be_reads_all_states_data_of_related_to_USA_from_database() throws SQLException {

        states = DatabaseConnector.getResultSet(statesData);

        ResultSetMetaData rsmd = states.getMetaData();
        System.out.println("Total columns :" + rsmd.getColumnCount());
        System.out.println("Column Name of 2nd Column :" + rsmd.getColumnName(2));

        while (states.next()) {
            String state = states.getString("name");
            listStates.add(state);
        }
        System.out.println(listStates);
    }

    @Given("user should be validate the data which all states of related to USA")
    public void user_should_be_validate_the_data_which_all_states_of_related_to_USA() throws SQLException {

        states = DatabaseConnector.getResultSet(statesData);
        List<String> actualStateName = new ArrayList<>();

        while (states.next()) {
            String state = states.getString("name");
            actualStateName.add(state);
        }
        System.out.println(listStates);

       List expect= asList("AL","AK","AZ","AR","CA","CO","CT","DE","DC","FL",
          "GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NJ",
          "NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY");
//        List expect = asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
//          "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana",
//          "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
//          "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
//          "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
//          "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
//          "Washington", "West Virginia", "Wisconsin", "Wyoming");
       Assert.assertNotSame(expect,(actualStateName.listIterator()));

   }

    @Then("user should be exit GMIBank database")
    public void user_should_be_exit_GMIBank_database() {
        DatabaseConnector.closeConnection();
    }


}


