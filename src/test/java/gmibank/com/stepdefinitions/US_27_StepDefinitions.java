package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;
import gmibank.com.pojos.States;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.ReadTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

//import static gmibank.com.jsonModels.StateJson.CREATE_STATE;
//import static gmibank.com.jsonModels.StateJson.CREATE_STATE2;
import static io.restassured.RestAssured.*;



import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_27_StepDefinitions {

    Response response;
    Customer[] customers;
    Response responseAll;
    States[] states;
    ObjectMapper objectMapper = new ObjectMapper();
    Response  responsedelete;
    States[]  statedeleted;
    List <String> list;
    JsonPath jsonPath;

    @Given("user should create a state data from {string}")
    public void user_should_create_a_state_data_from(String endpoint_states) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body("{\"countryId\": 1,\"name\":\"Germany\" }")
                .post(endpoint_states)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

       @Then("user should create a state with  {string} and {string}")
        public void user_should_create_a_state_with_and (String string, String string2){

        }

        @Given("user should be reads all states data from {string}")
        public void user_should_be_reads_all_states_data_from (String stateendpoint){

            response = given().accept(ContentType.JSON).auth().oauth2(ConfigurationReader.getProperty("token"))
                    .when()
                    .get(stateendpoint);
            //response.prettyPrint();

    }


        @Then("user should be delete a state with {string} and verify")
        public void user_should_be_delete_a_state_with_and_verify (String id)
 throws IOException {

        String endpoint = "https://www.gmibank.com/api/tp-states";

            responsedelete = given().headers(
                    "Authorization",
                    "Bearer " + ConfigurationReader.getProperty("token"),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept",
                    ContentType.JSON)
                    .when()
                    .delete(endpoint + id)
                    .then()
                    .extract()
                    .response();


            response = given().accept(ContentType.JSON).auth().oauth2(ConfigurationReader.getProperty("token"))
                    .when()
                    .get(endpoint)
                    .then()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .extract()
                    .response();

            jsonPath= response.jsonPath();
            String stateId = jsonPath.getString("id");

            Assert.assertFalse("State is not deleted",stateId.contains("61746"));
            System.out.println("State is deleted");

        }

    }


