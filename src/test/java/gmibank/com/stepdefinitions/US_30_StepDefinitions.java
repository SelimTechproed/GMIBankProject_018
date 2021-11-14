package gmibank.com.stepdefinitions;


import gmibank.com.pojos.Customer;

import gmibank.com.utilities.PDFGenerator;
import io.cucumber.java.en.Given;


import static gmibank.com.utilities.DatabaseUtility.createConnection;
import static gmibank.com.utilities.DatabaseUtility.getQueryResultList;

import java.util.ArrayList;
import java.util.List;


public class US_30_StepDefinitions {

    @Given("pdf user creates a connection with db using {string} , {string} and {string}")
    public void demo_pdf_user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        createConnection(url, user, password);
    }

    @Given("pdf user provides the query {string}")
    public void demo_pdf_user_provides_the_query(String query) {

        List <Customer> listOfCustomers = new ArrayList<>();

        List <List< Object>> list =getQueryResultList(query);
        for (int i=0; i<=5; i++){
            Customer customer = new Customer();

            customer.setFirstName(list.get(i).get(1).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(5).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());

            listOfCustomers.add(customer);
        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirst5("First Five Customers  Data",listOfCustomers,"FirstFiveCustomer.pdf" );


    }


    /*
    public static void main(String[] args) {
        String query = "Select * from tp_customer;";
        createConnection("jdbc:postgresql://157.230.48.97:5432/gmibank_db","techprodb_user","Techpro_@126");

        List <Customer> listOfCustomers = new ArrayList<>();

        List <List< Object>> list =getQueryResultList(query);
        for (int i=0; i<=5; i++){
            Customer customer = new Customer();

            customer.setFirstName(list.get(i).get(1).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(5).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());

            listOfCustomers.add(customer);
        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("First Five Customers  Data",listOfCustomers,"FirstFiveCustomer.pdf" );

    }

 */

}


