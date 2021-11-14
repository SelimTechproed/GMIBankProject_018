package gmibank.com.stepdefinitions;

import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;
import gmibank.com.pojos.Customer5;
import gmibank.com.utilities.PDFGenerator;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

import static gmibank.com.utilities.DatabaseUtility.createConnection;
import static gmibank.com.utilities.DatabaseUtility.getQueryResultList;
import static gmibank.com.utilities.PDFGenerator.*;

public class PdfGeneratorDersBank7 {

    public static void main(String[] args) {

       // pdfGenerator("Deneme","Bank7Ders.pdf");
       // pdfGeneratorRowsAndCells("Deneme2","Bank7Ders2.pdf");

        List <Customer> list = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Ali");
        customer.setSsn("1234");
        Country country = new Country();
        country.setName("USA");
        customer.setCountry(country);
        customer.setState("ohio");
        customer.setZipCode("00000");

        list.add(customer);


        pdfGeneratorRowsAndCellsWithList("                    Deneme2",list,"Bank7Ders3.pdf");


    }

    @Given("pdf_ders_bank7 user creates a connection with db using {string} , {string} and {string}")
    public void pdf_ders_bank7_user_creates_a_connection_with_db_using_and(String url, String user, String password) {

     //   createConnection();
        createConnection(url, user, password);

    }

    @Given("pdf_ders_bank7 user provides the query {string}")
    public void pdf_ders_bank7_user_provides_the_query(String query) {

        List<Customer5> customer5List = new ArrayList<>();

        List<List<Object>> lists = getQueryResultList(query);

        for (int i = 0 ; i <= 10 ; i++){

            Customer5 customer5 = new Customer5();

            customer5.setFirstName(lists.get(i).get(1).toString());
            customer5.setLastName(lists.get(i).get(2).toString());
            customer5.setMiddleInitial(lists.get(i).get(3).toString());
            customer5.setEmail(lists.get(i).get(4).toString());
            customer5.setMobilePhoneNumber(lists.get(i).get(5).toString());

            customer5List.add(customer5);
        }

        pdfGeneratorRowsAndCellsWithListFirstToTen("                              **** Pdf_Son_Deneme ****   \n                          " +
                "                                      ==== First Ten Customers Some Info =====                " ,
                customer5List , "Ders_Sonu.pdf"         );




    }

}
