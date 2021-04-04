package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.ReadTxt;
import gmibank.com.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static gmibank.com.jsonModels.CountryJson.createCountry;
import static io.restassured.RestAssured.given;

public class Api_Testing_Country {




    Response response;
    Country [] country;
    Response responseAll;
    int createdCountryId;
    String stringCreatedId;

    //=================== read === create === update === delete ==== validate country =====================

    // ========================= read country  =================================


    @Given("read all countries and sets response using to api end point {string}")
    public void read_all_countries_and_sets_response_using_to_api_end_point(String country_api_endpoint) throws IOException {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(country_api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();
/*
        // validate isleminde kullanmak icin tum id leri bir listin icine  atalim

        List<String> countryId = new ArrayList<>();

        // objectmapper kullanilarak deserilazition yapiyoruz

        ObjectMapper objectMapper = new ObjectMapper();
        country = objectMapper.readValue(response.asString(),Country[].class);

        // for dongusu ile tum country idleri bir listin icine atiyoruz

        for(int i = 0 ; i < country.length ; i++){
            countryId.add(country[i].getId().toString());
        }

        // tum ulke idlerini txt olarak yazdiralim

        WriteToTxt.saveDataInFileWithCountrId("allCountryIds",country);

        // txt olarak yazdirdigimiz idleri readtxt uzerinden okutalim

        List <String> readId = ReadTxt.returnCountryIdList("allCountryIds");

        Assert.assertEquals("not match",country,readId);
        System.out.println("Validation is succesfull");

 */


    }

    // ================== create country ========================

    @Given("create a country {string}")
    public void create_a_country(String api_endpoint_url) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(createCountry)
                .post(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        createdCountryId = jsonPath.getInt("id");
        System.out.println(createdCountryId);

    }

    @Then("validate created country")
    public void validate_created_country() {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        String ids = jsonPath.getString("id");
        System.out.println(ids);

        stringCreatedId = String.valueOf(createdCountryId);

        Assert.assertTrue("not match", ids.contains(stringCreatedId));
        System.out.println("Validation is succesfull");


    }



    // ================== update country ========================

    @Given("update created country using api end point {string}  {string} and its extension {string}")
    public void update_created_country_using_api_end_point_and_its_extension(String api_endpoint_url, String name, String id) {


        Map<String ,Object> putCountryName = new HashMap<>();

        putCountryName.put("id",id);
        putCountryName.put("name",name);
        putCountryName.put("states",null);

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(putCountryName)
                .put(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();


    }

    // ================== delete and validate country ========================

    @Given("deletes updated country using endpoint {string} and its extension {string} and validate")
    public void deletes_updated_country_using_endpoint_and_its_extension_and_validate(String api_endpoint_url, String id) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(api_endpoint_url+id)
                .then()
                .extract()
                .response();

        responseAll = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
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


        JsonPath jsonPath = responseAll.jsonPath();
        String kalan_IDler = jsonPath.getString("id");
        Assert.assertFalse("not delete",kalan_IDler.contains(id));
        System.out.println("Validation is succesfull");

    }


    @Then("read all countries again and validate")
    public void read_all_countries_again_and_validate() {

    }

    /*

     */

}
