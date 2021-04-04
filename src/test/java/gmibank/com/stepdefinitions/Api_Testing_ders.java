package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Customer;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Api_Testing_ders {


    Response response;
    Customer[] customer;


    @Given("Gmi Bank user go to api end point {string}")
    public void gmi_Bank_user_go_to_api_end_point(String api_end_point) {
        response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        System.out.println("==============================================");
    }

    @Given("Gmi Bank read all customer and set create pojo class")
    public void gmi_Bank_read_all_customer_and_set_create_pojo_class() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        customer = objectMapper.readValue(response.asString(),Customer[].class);

/*
        System.out.println(customer[0].getFirstName());
        System.out.println("==============================================");
        System.out.println(customer[2].getAddress());
        System.out.println("==============================================");

        for(int i = 0 ; i < customer.length ; i++){
            System.out.println(customer[i].getFirstName());
        }

        System.out.println("==============================================");

        for(int i = 0 ; i < customer.length ; i++){
            System.out.println(customer[i].getAddress());
        }
        System.out.println("==============================================");

        for(int i = 0 ; i < customer.length ; i++) {
            if (customer[i].getUser() != null) {
                System.out.println(customer[i].getUser().getFirstName());
            }
        }

*/


    }




    @Then("Gmi Bank Validate data")
    public void gmi_Bank_Validate_data() {

        WriteToTxt.saveDataInFileWithSSN("allCustomerSsn.txt",customer);

    }





}
