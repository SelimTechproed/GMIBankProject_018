package gmibank.com.stepdefinitions;

import gmibank.com.pojos.*;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.WriteToTxt;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
import org.junit.Assert;

public class US_26_StepDefinitions {
    Response response;

    Country[] countries;


    @Given("use api end point {string}")
    public void use_api_end_point(String api_endpoint) throws Exception {

        response = given().
                headers("Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
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

        ObjectMapper objectMapper = new ObjectMapper();
       countries=objectMapper.readValue(response.asString(),Country[].class);
        for (int i=0; i<countries.length; i++){
            System.out.println(countries[i].getName());
        }


    }

    @Given("users can update any country with endPoint {string} {string} and its id {string}")
    public void users_can_update_any_country_with_endPoint_and_its_id(String endPoint, String newname, String id) throws Exception {

        Map<String, Object> countryPut = new HashMap<>();
        System.out.println("*********************************************");

        countryPut.put("id", id);
        countryPut.put("name", newname);
        countryPut.put("states", null);

        response = given()
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .body(countryPut)
                .put(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
       response.prettyPrint();

       Assert.assertEquals("Country Name is not update", countryPut.get("name"),"Urfali Pasa");


    }




}
