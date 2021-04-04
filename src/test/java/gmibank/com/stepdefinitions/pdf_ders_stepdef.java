package gmibank.com.stepdefinitions;

import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;
import gmibank.com.utilities.PDFGenerator;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

import static gmibank.com.utilities.DatabaseUtility.createConnection;
import static gmibank.com.utilities.DatabaseUtility.getQueryResultList;
import static gmibank.com.utilities.PDFGenerator.*;

public class pdf_ders_stepdef {

    public static void main(String[] args) {
       // pdfGenerator();
       // pdfGeneratorRowsAndCells();


    }

    @Given("pdf_ders user creates a connection with db using {string} , {string} and {string}")
    public void pdf_ders_user_creates_a_connection_with_db_using_and(String url, String user, String password) {

        createConnection(url,user,password);

    }

    @Given("pdf_ders user provides the query {string}")
    public void pdf_ders_user_provides_the_query(String query) {


        List<Customer> customerList =new ArrayList<>();

        List<List<Object>> lists =getQueryResultList(query);

        for(int i = 0 ; i <= 5 ; i++){
            Customer customer = new Customer();

            customer.setFirstName(lists.get(i).get(1).toString());
            customer.setLastName(lists.get(i).get(2).toString());
            customer.setEmail(lists.get(i).get(4).toString());
            customer.setCity(lists.get(i).get(9).toString());
            customer.setSsn(lists.get(i).get(10).toString());

            customerList.add(customer);
        }


       // pdfGeneratorRowsAndCellsWithListFirstToFive("");
        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("                    *** Pdf_Ders_Son_Deneme *** \n                                                      === First Five Customers Some Data ===",customerList,"Ders_Sonu.pdf" );


    }

}
