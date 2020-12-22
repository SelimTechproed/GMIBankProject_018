package gmibank.com.stepdefinitions;

import gmibank.com.pojos.*;
import gmibank.com.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class US_26_StepDefinitions {
    Response response;
    Customer[] customers;
    Country[] countries;
    States[] states;
    User[] users;
    Accounts[] accounts;

    @Given("use api end point {string}")
    public void use_api_end_point(String api_endpoint) {

         response=given().
                headers("Authorization",
                        "Bearer "+ ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                        get(api_endpoint).
                then().
                        contentType(ContentType.JSON).
                statusCode(200).
                extract().
                response();
    //   response.prettyPrint();

    }

    @Given("get all countries information as De-serialization")
    public void get_all_countries_information_as_De_serialization() throws IOException {

        ObjectMapper objectMapper=new ObjectMapper();
     countries=objectMapper.readValue(response.asString(),Country[].class);
     for (int i=0; i<countries.length; i++){

         System.out.println(countries[i].getName());

     }

    }

    @Then("find out how many countries and verify that there are number country")
    public void find_out_how_many_countries_and_verify_that_there_are_number_country() {
        System.out.println("country sayisi : " + countries.length);


    }

    @Given("user updates a country using api end point {string}  {string} and its extension {string}")
    public void user_updates_a_country_using_api_end_point_and_its_extension(String endPoint, String replaceContry, String idCountry) {

        Map<String, Object> putBody = new HashMap<>();

        putBody.put("id", 11133);
        putBody.put("name", replaceContry );
        putBody.put("states",null);

        Response responsePut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                body(putBody).
                when().
                put(endPoint);

        responsePut.prettyPrint();

        responsePut.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
    }


}
