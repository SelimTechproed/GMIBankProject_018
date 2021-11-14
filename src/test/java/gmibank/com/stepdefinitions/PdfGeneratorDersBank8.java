package gmibank.com.stepdefinitions;

import gmibank.com.pojos.*;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

import static gmibank.com.utilities.DatabaseUtility.*;
import static gmibank.com.utilities.PDFGenerator.*;

public class PdfGeneratorDersBank8 {

    public static void main(String[] args) {

    // pdfGenerator("Deneme_Bank8","Deneme_Ders_Bank8.pdf");
    //  pdfGeneratorRowsAndCells("Deneme2","Ders_Bank8_2.pdf");

        List <Customer6> list = new ArrayList<>();
        Customer6 customer6 = new Customer6();
        customer6.setFirstName("Ali");
        customer6.setSsn("1478");
        Country6 country6 = new Country6();
        country6.setName("Canada");
        customer6.setCountry(country6);
        customer6.setState("ohio");
        customer6.setZipCode("185487");

        list.add(customer6);

        pdfGeneratorRowsAndCellsWithList6("                                   Deneme3",list,"Ders_Bank8_3.pdf");


    }

    @Given("pdf_ders_bank8 user creates a connection with db using {string} , {string} and {string}")
    public void pdf_ders_bank8_user_creates_a_connection_with_db_using_and(String url, String user, String password) {

      //  createConnection();
        createConnection(url, user, password);

    }

    @Given("pdf_ders_bank8 user provides the query {string}")
    public void pdf_ders_bank8_user_provides_the_query(String query) {

        List<Customer6> customer6List = new ArrayList<>();

        List<List<Object>> lists = getQueryResultList(query);

        for (int i = 0 ; i < 10  ; i++ ){

            Customer6 customer6 = new Customer6();

            customer6.setFirstName(lists.get(i).get(1).toString());
            customer6.setLastName(lists.get(i).get(2).toString());
            customer6.setId(Integer.parseInt(lists.get(i).get(0).toString()));
            customer6.setEmail(lists.get(i).get(4).toString());
            customer6.setMobilePhoneNumber(lists.get(i).get(5).toString());

            customer6List.add(customer6);

        }

        pdfGeneratorRowsAndCellsWithListFirstToTenBank8("                       **** Pdf_Son_Deneme_Bank8 ****          \n" +
                "                    ===== First Ten Customer Some Info =====               " , customer6List ,
                "Ders_Sonu_Pdf_Bank8.pdf ");

        closeConnection();


    }


}
