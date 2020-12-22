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
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_20_StepDefinitions {

    Response response;


    @Given("user sets all response using api endpoint {string}")
    public void user_sets_all_response_using_api_endpoint(String string) {

        response = given().
                headers("Authorization", "Bearer " + ConfigurationReader.getProperty("token"),
                "Content_Type", ContentType.JSON, "Accept", ContentType.JSON).
                when().
                get(string).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
        //response.prettyPrint();

    }

    @Given("user deserializers country data as json to java")
    public void user_deserializers_country_data_as_json_to_java() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Customer[] customers = objectMapper.readValue(response.asString(), Customer[].class);
        for ( int i = 0; i< customers.length ; i++){

            System.out.println(customers[i].getFirstName());
        }

    }

    @Then("user validates the data")
    public void user_validates_the_data() {
        JsonPath jsonPath = response.jsonPath();
        String validates = jsonPath.getString("firstName");
        Assert.assertTrue("not found", validates.contains("alina"));




    }

}
