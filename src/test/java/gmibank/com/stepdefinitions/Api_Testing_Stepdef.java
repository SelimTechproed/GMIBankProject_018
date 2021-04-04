package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Customer;
import gmibank.com.pojos.Customer2;
import gmibank.com.pojos.Customer3;
import gmibank.com.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.*;

public class Api_Testing_Stepdef {


    Response response;

    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String api_end_point) {

         response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                 .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();

        System.out.println("==============================================");

    }

    @Given("read all customer and set create pojo class")
    public void read_all_customer_and_set_create_pojo_class() throws IOException {
      ObjectMapper objectMapper = new ObjectMapper();
      Customer [] customer = objectMapper.readValue(response.asString(),Customer[].class);
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



    }

    @Then("Validate data")
    public void validate_data() {



    }







/*

    Response response;
    Customer2[] customer2;


    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String api_end_point) {

         response = given().headers(
                "Authorization", //sitenin bilgileri almamiz icin izin vermesi
                "Bearer "+ ConfigurationReader.getProperty("token"),//tokeni yazdigimiz yer Bearer'dan sonra bosluk birakilir
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

       // response.prettyPrint();
    }

    @Given("read all customer and set create pojo class")
    public void read_all_customer_and_set_create_pojo_class() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        customer2 = objectMapper.readValue(response.asString(),Customer2[].class);


       //customer3 = objectMapper.readValue(response.asString(),Customer3[].class);


        System.out.println(customer2[0].getFirstName());
        System.out.println(customer2[5].getSsn());
        System.out.println("==========================================================");
/*
        for(int i = 0 ; i<customer3.length;i++){
            System.out.println(customer3[i].getCity());
        }
        System.out.println("==========================================================");

        for(int i = 0 ; i<customer3.length;i++){
            System.out.println(customer3[i].getSsn());
        }

        System.out.println("==========================================================");


        for(int i = 0 ; i<customer3.length;i++) {
            if (customer3[i].getUser() != null) {
                System.out.println(customer3[i].getUser().getId());
            }
        }



    }

    @Then("Validate data")
    public void validate_data() {


    }


*/

}
