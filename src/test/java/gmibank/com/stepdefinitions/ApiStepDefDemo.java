package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;
import gmibank.com.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.*;

import static gmibank.com.jsonModels.CountryJson.createCountry;

import static gmibank.com.utilities.DatabaseUtility.createConnection;
import static gmibank.com.utilities.DatabaseUtility.getQueryResultList;
import static io.restassured.RestAssured.*;

public class ApiStepDefDemo {

    Response response;
    Response responseAll;
    JsonPath jsonPath;
    Country [] country;
    List <Country> dbCountry = new ArrayList<>();

    //================================ Read Country ========================================

    @Given("demo read all country and sets response using to api end point {string}")
    public void demo_read_all_country_and_sets_response_using_to_api_end_point(String country_api_endpoint) {

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

        // response.prettyPrint();


    }

    List <String> listId = new ArrayList<>();

    @Given("demo user send all country data in a file and validate")
    public void demo_user_send_all_country_data_in_a_file_and_validate() throws IOException {


       ObjectMapper objectMapper = new ObjectMapper();
       country = objectMapper.readValue(response.asString(), Country[].class);

        for ( int i = 0; i< country.length ; i++){
            listId.add(country[i].getId().toString());
        }


        WriteToTxt.saveDataInFileWithCountrId("allCountriesId.txt", country);
        List<String> readId = ReadTxt.returnCustomerSNNList("allCountriesId.txt");

        Assert.assertEquals("not match",listId,readId);
        System.out.println("Validation is succesfull");

    }

    //================================ Create Country ========================================

    @Given("demo user create a country using to api end point {string}")
    public void demo_user_create_a_country_using_to_api_end_point(String api_endpoint_url) {
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
    }


    //================================ Validate Created  Country Using Database ========================================

    @Given("demo user creates a connection with db using {string} , {string} and {string}")
    public void demo_user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        createConnection(url, user, password);
    }

    @Given("demo user provides the query {string} and {string}")
    public void demo_user_provides_the_query_and(String query, String columnName) {
        List<Object> list = DatabaseUtility.getColumnData(query,columnName);
        Country[]countries1 = new Country[list.size()];
        for (int i=0; i<list.size()-1; i++){
            Country country  = new Country();
            country.setId(Integer.parseInt(list.get(i).toString().trim()));
            dbCountry.add(country);
           // System.out.println(dbCountry.get(i).getId());
        }


    }

    @Then("demo validate created country with {int}")
    public void demo_validate_created_country_with(Integer createdCountryId) {
        List <Integer> createdIds = new ArrayList<>();
        for(int i = 0 ; i<dbCountry.size();i++){
            createdIds.add(dbCountry.get(i).getId());
        }

        System.out.println("=================================");
        System.out.println();

        Assert.assertTrue(createdIds.contains(createdCountryId));

        System.out.println("Validation is succesfull");
    }


    //================================ Update Country ========================================

    @Given("demo user updates a country using api end point {string}  {string} and its extension {string}")
    public void demo_user_updates_a_country_using_api_end_point_and_its_extension(String api_endpoint_url, String name, String id) {

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
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();

    }

    //================================ Delete Country ========================================

    @Given("demo user deletes a country using endpoint {string} and its extension {string}")
    public void demo_user_deletes_a_country_using_endpoint_and_its_extension(String api_endpoint_url, String id) {

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



    //================================ Pdf ========================================


    @Given("demo pdf user creates a connection with db using {string} , {string} and {string}")
    public void demo_pdf_user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        createConnection(url, user, password);
    }

    @Given("demo pdf user provides the query {string}")
    public void demo_pdf_user_provides_the_query(String query) {

        List <Customer> listOfCustomers = new ArrayList<>();

        List <List< Object>> list =getQueryResultList(query);
        for (int i=0; i<=5; i++){
            Customer customer = new Customer();

            customer.setFirstName(list.get(i).get(1).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(5).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());

            listOfCustomers.add(customer);
        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("                    *** Team 18 Presentation *** \n                                                      === First Five Customers Data ===",listOfCustomers,"FirstFiveCustomer.pdf" );


    }


}