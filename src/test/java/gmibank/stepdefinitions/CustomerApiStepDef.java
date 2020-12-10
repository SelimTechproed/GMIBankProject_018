package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.*;

public class CustomerApiStepDef {

    Response response;

    @Given("user read all customer and sets response using to api end point {string}")
    public void user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint) {
         response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
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
     //   response.prettyPrint();

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
        Customer [] customers = objectMapper.readValue(response.asString(),Customer[].class);
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


}
