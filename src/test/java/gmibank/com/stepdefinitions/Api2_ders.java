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

public class Api2_ders {

    Response response;
    Country [] country;
    int createdCountryId;
    Response responseAll;

    // ============================  read all countries =================================


    @Given("ders read all countries and sets response using to api end point {string}")
    public void ders_read_all_countries_and_sets_response_using_to_api_end_point(String api_url) throws IOException {

        response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        // validate isleminde kullanmak icin tum id leri bir listin icine  atalim

        List<String> countryId = new ArrayList<>();

        // objectmapper kullanilarak deserilazition yapiyoruz

        ObjectMapper objectMapper = new ObjectMapper();
        country = objectMapper.readValue(response.asString(),Country[].class);

        // for dongusu ile tum country idleri bolusturdugumuz listin icine atiyoruz

        for(int i = 0 ; i < country.length ; i++){
            countryId.add(country[i].getId().toString());
        }

        // tum ulke idlerini txt olarak yazdiralim

      //  WriteToTxt.saveDataInFileWithCountrId("allCountryId1",country);

        // txt olarak yazdirdigimiz idleri readtxt uzerinden okutalim

        List<String> readId = ReadTxt.returnCountryIdList("allCountryId1");

        Assert.assertEquals("not match",countryId,readId);
        System.out.println("Validation is succesfull");


    }

    // ============================  create all countries =================================


    @Given("ders create a country {string}")
    public void ders_create_a_country(String api_url) {

        response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(createCountry)
                .post(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

   //     JsonPath jsonPath = response.jsonPath();
    //    createdCountryId = jsonPath.getInt("id");
    //    System.out.println(createdCountryId);


    }

    // ============================  validate created country =================================


    @Then("ders validate created country")
    public void ders_validate_created_country() {


        response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
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
        String newIds = jsonPath.getString("id");

        String stringCreatedCountryId = String.valueOf(createdCountryId);

        Assert.assertTrue("mot match",newIds.contains(stringCreatedCountryId));
        System.out.println("Validation is succesfull");

    }


    // ============================  update created country =================================

    @Given("ders update created country using api end point {string}  {string} and its extension {string}")
    public void ders_update_created_country_using_api_end_point_and_its_extension(String api_url, String name, String id) {


        Map<String , Object> putCountry = new HashMap<>();

        putCountry.put("id",id);
        putCountry.put("name",name);
        putCountry.put("states",null);


        response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(putCountry)
                .put(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();


    }

    // ============================  delete and validate created country =================================


    @Given("ders deletes updated country using endpoint {string} and its extension {string} and validate")
    public void ders_deletes_updated_country_using_endpoint_and_its_extension_and_validate(String api_url, String id) {


        response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(api_url+id)
                .then()
                .extract()
                .response();

        responseAll = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = responseAll.jsonPath();
        String kalanIdler = jsonPath.getString("id");

        Assert.assertFalse("not delete" , kalanIdler.contains(id));
        System.out.println("Validation is succesfull");



    }




}
