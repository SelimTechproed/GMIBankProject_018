package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country;
import gmibank.com.pojos.Customer;

import gmibank.com.utilities.*;

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
import static io.restassured.RestAssured.*;

public class ApiStepDef {

    Response response;
    Customer [] customers;
    Response responseAll;

    //=============================== User-Story-20 Customer Step definitions ==================================

    @Given("user read all customer and sets response using to api end point {string}")
    public void user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint) {
         response=given().headers(
                "Authorization",  //sitenin bilgileri almamiz icin izin vermesi
                "Bearer " + ConfigurationReader.getProperty("token"), //tokeni yazdigimiz yer Bearer'dan sonra bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()    // when() kadar istedigimiz bilgiler girilir
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
       response.prettyPrint();  //response'u yazdirir

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

 // ==================================User-Story-21 Country Step Definitions=========================================

    @Given("user read all country and sets response using to api end point {string}")
    public void user_read_all_country_and_sets_response_using_to_api_end_point(String string) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),// token guncel olmazsa (401) hatasi verir
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

    //=============================== User-Story-20 Customer Step definitions ==================================


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

    List<String> allSsn = new ArrayList<>();
    @Given("two user deserialization customer data json to java pojo")
    public void two_user_deserialization_customer_data_json_to_java_pojo() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(),Customer[].class);

        /*
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
        */


        for(int i = 0 ; i < customers.length ; i++){
           allSsn.add(customers[i].getSsn());
        }
     //   System.out.println(allSsn);

     //   WriteToTxt.saveDataInFileWithAllCustomerInfo2("allCustomerInfo.txt",customers);

        WriteToTxt.saveDataInFileWithSSN("allCustomerSsn1.txt",customers);
        List<String> customerSsnList = ReadTxt.returnCustomerSNNList("allCustomerSsn1.txt");

        Assert.assertEquals("not verify",allSsn,customerSsnList);

    }

    @Then("two user validates all customer data")
    public void two_user_validates_all_customer_data() {



    }

    //======================== Create Country === Read Country === Delete Country ============================

    // ======  Create Country  =======

    @Given("user sets the response using api end point {string} and creates country using {string} and {string}")
    public void user_sets_the_response_using_api_end_point_and_creates_country_using_and(String endpoint, String type, String country) {
         response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().body("{\""+type+"\":\""+country+"\"}")
                .post(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

    }

    // ======  Read Country  =======

    @Given("user sets the countries to response using {string}")
    public void user_sets_the_countries_to_response_using(String endpoint) {

        responseAll= given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
      //  responseAll.prettyPrint();


    }

    @Given("user saves the countries to correspondent files")
    public void user_saves_the_countries_to_correspondent_files() {

        JsonPath jsonPath=responseAll.jsonPath();

        String id=jsonPath.getString("id");

        Assert.assertTrue("not verify",id.contains("57094"));

    }

    @Then("user validates the countries")
    public void user_validates_the_countries() {

    }


    // ======  Delete Country  =======

    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void user_deletes_a_country_using_endpoint_and_its_extension(String endpoint, String id) {

        Response response =given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(endpoint+id)
                .then()
                .extract()
                .response();

        responseAll=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        JsonPath jsonPath=responseAll.jsonPath();

        String idAll=jsonPath.getString("id");

        Assert.assertFalse("not verify",idAll.contains(id));

    }



    //=============================== User-Story-20 Customer Step definitions 2  ==================================

    @Given("three user read all customer and sets response using to api end point {string}")
    public void three_user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint_url) {

        response = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()  //when den sonra --get, post,put,patch,delete-- mehodlari calistirilir
                .get(api_endpoint_url) // get te sadece Endpoint kullanilir
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

      //    response.prettyPrint();

        // get ile aldigimiz datayi consolda gormek isriyoruz
        // gelen datayi bir konteynir icersine alip yazdirmak gerekiyor. Response
        // kullanarak postmandeki ciktinin aynisini elde edecegiz
        //Response body kismina yazdirir


    }

    List<String> ssnNumbers = new ArrayList<>();
    @Given("three user deserialization customer data json to java pojo")
    public void three_user_deserialization_customer_data_json_to_java_pojo() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(),Customer[].class);

        for(int i = 0 ; i < customers.length ; i++ ){
           ssnNumbers.add(customers[i].getSsn());
        }

        WriteToTxt.saveDataInFileWithSSN("allCustomerSsnNumber.txt1",customers);
        List<String> readSsnNumbers = ReadTxt.returnCustomerSNNList("allCustomerSsnNumber.txt1");

        Assert.assertEquals("not match",ssnNumbers,readSsnNumbers);

    }

    @Then("three user validates all customer data")
    public void three_user_validates_all_customer_data() {

    }

    //======================== Create Country === Read Country === Delete Country ============================

    // ======  Create Country  =======

    @Given("two user sets the response using api end point {string} and creates country using {string} and {string}")
    public void two_user_sets_the_response_using_api_end_point_and_creates_country_using_and(String api_endpoint_url, String type, String country) {


        response = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
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

         /*
        response = given()
                .contentType(ContentType.JSON)
                .spec(apiCountryLogin)
                .auth()
                .basic()
                .body("{\""+type+"\":\""+country+"\"}").... devam ediyor
           */




        response.prettyPrint();


    }

    // ======  Read Country  =======

    @Given("two user sets the countries to response using {string}")
    public void two_user_sets_the_countries_to_response_using(String api_endpoint_url) {

        response = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when() // yapmak istedigimiz islemleri yaziyoruz
                .get(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

            response.prettyPrint();


    }


    @Then("two user validates the countries")
    public void two_user_validates_the_countries() {

        JsonPath jsonPath = response.jsonPath();

        String countryId = jsonPath.getString("id");

        Assert.assertTrue("not find", countryId.contains("60108"));


    }


    // ======  Update Country  =======


    @Given("two user updates a country using api end point {string}  {string} and its extension {string}")
    public void two_user_updates_a_country_using_api_end_point_and_its_extension(String api_endpoint_url, String name, String id) {

        Map<String ,Object> putCountryName = new HashMap<>();

        putCountryName.put("id",id);
        putCountryName.put("name",name);
        putCountryName.put("states",null);



        response = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when() // yapmak istedigimiz islemleri yaziyoruz
                .body(putCountryName)
                .put(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();


    }



    // ======  Delete Country  =======

    @Given("two user deletes a country using endpoint {string} and its extension {string}")
    public void two_user_deletes_a_country_using_endpoint_and_its_extension(String api_endpoint_url, String id) {

        response = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when() // yapmak istedigimiz islemleri yaziyoruz
                .delete(api_endpoint_url+id)  // silmek istedigimiz ulkenin id sini "/" ile birlikte url'nin devamina yaziyoruz
                .then()
                .extract()
                .response();

        responseAll = given().headers(
                "Authorization", //sitenin bilgilerini almamiz icin izin veriyor
                "Bearer " + ConfigurationReader.getProperty("token"), // Bearer'dan sonra bir bosluk birakilir
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when() // yapmak istedigimiz islemleri yaziyoruz
                .get(api_endpoint_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();


        JsonPath jsonPath = responseAll.jsonPath();
        String kalan_IDler = jsonPath.getString("id");
        Assert.assertFalse("not delete",kalan_IDler.contains(id));


    }

    // =============================   JDBS....  ==============================

    @Given("user gets all customer column data using {string} and {string}")
    public void user_gets_all_customer_column_data_using_and(String query, String columnName) {

        List<Object> allColumnData = DatabaseUtility.getColumnData(query,columnName);
        System.out.println(allColumnData);
    }

    @Given("user sets all customer info to coreepondent files")
    public void user_sets_all_customer_info_to_coreepondent_files() {

    }

    @Then("user validates all db customer info")
    public void user_validates_all_db_customer_info() {

    }





}
