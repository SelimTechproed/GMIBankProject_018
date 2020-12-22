package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;

import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;
import gmibank.com.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.*;

public class ApiStepDef {

    Response response;

    @Given("user read all customer and sets response using to api end point {string}")
    public void user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint) {
         response=given().headers(
                "Authorization",  //sitenin bilgileri almamiz icin izin vermesi
                "Bearer " + ConfigurationReader.getProperty("token"), //tokeni yazdigimiz yer Bearer'dan sonra bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
     //   response.prettyPrint();  //response'u yazdirir

        /*  alternatif kullanim

        Response response=given()
        .auth()
        .oauth2(ConfigurationReader.getProperty("token"))
        .contentType(ContentType.JSON)
        .when()
                    .get(api_endpoint)
        .then()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .extract()
                    .response();
          response.prettyPrint();
         */

    }

    @Given("user deserialization customer data json to java pojo")
    public void user_deserialization_customer_data_json_to_java_pojo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Customer[] customers = objectMapper.readValue(response.asString(),Customer[].class);
     //   System.out.println(customers[0].getFirstName()); //sadece ilk firstname
        for ( int i = 0; i< customers.length ; i++){
            System.out.println(customers[i].getFirstName());
        }
        System.out.println("===================================");

        for ( int i = 0; i< customers.length ; i++){
            if (customers[i].getUser()!=null) {
                System.out.println(customers[i].getUser().getLastName());
            }
        }

    }

    @Then("user validates all data")
    public void user_validates_all_data() {
       
    }
 //user story 21
    @Given("user read all country and sets response using to api end point {string}")
    public void user_read_all_country_and_sets_response_using_to_api_end_point(String string) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(string)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();

    }

    @Given("user deserialization country data json to java pojo")
    public void user_deserialization_country_data_json_to_java_pojo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Country [] country = objectMapper.readValue(response.asString(), Country[].class);
         System.out.println(country[0].getName()); //sadece ilk name


    }
    @Then("user validates all country data")
    public void user_validates_all_country_data() {

    }

    @Given("two user read all customer and sets response using to api end point {string}")
    public void two_user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint_url) {

          response = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

         //  response.prettyPrint();



          /*
        response = given()
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
  */



    }

    @Given("two user deserialization customer data json to java pojo")
    public void two_user_deserialization_customer_data_json_to_java_pojo() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer [] customers = objectMapper.readValue(response.asString(),Customer[].class);
        System.out.println(customers[0].getFirstName());

        System.out.println("=========================================================");

        for(int i = 0 ; i < customers.length ; i++){
            System.out.println(customers[i].getCity());
        }

        System.out.println("=========================================================");

        for(int i = 0 ; i < customers.length ; i++){
            if(customers[i].getAddress()!=null)
            System.out.println(customers[i].getAddress());
        }

        System.out.println("=========================================================");

        System.out.println(customers.length);

        System.out.println("=========================================================");

        for(int i = 0 ; i < customers.length ; i++){
            if(customers[i].getFirstName().equals("Bekir"))
                System.out.println(customers[i].getFirstName());
        }


    }

    @Then("two user validates all customer data")
    public void two_user_validates_all_customer_data() {

    }







}
