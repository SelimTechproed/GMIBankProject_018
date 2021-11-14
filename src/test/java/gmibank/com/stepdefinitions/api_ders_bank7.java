package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Customer;
import gmibank.com.pojos.Customer3;
import gmibank.com.pojos.Customer4;
import gmibank.com.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class api_ders_bank7 {

    @Given("read alll customer data using with api endpoint {string}")
    public void read_alll_customer_data_using_with_api_endpoint(String api_end_point) throws IOException {

        Response response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader
                .getProperty("token"), "Content-Type",
                ContentType.JSON,"Accept",
                ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

       response.prettyPrint();

        ObjectMapper objectMapper = new ObjectMapper();
        Customer4[]customer = objectMapper.readValue(response.asString(),Customer4[].class);
    //    System.out.println(customer[0].getFirstName());
   //     System.out.println(customer[2].getFirstName());

        /*
        for(int i = 0 ; i < customer.length ; i++){
            System.out.println(customer[i].getFirstName());
        }

         */

        for(int i = 0 ; i < customer.length ; i++) {
            if (customer[i].getUser() != null) {
                System.out.println(customer[i].getUser().getFirstName());
            }
        }


    }

    // ================================  Api Testing 1 Session ===============================


}
