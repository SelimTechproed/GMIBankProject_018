package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country5;
import gmibank.com.pojos.Customer5;
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

public class apiDersBank7 {

    Response response;
    int createdCountryId;
    Response responseAll;

    @Given("read all customer data using with api endpoint {string}")
    public void read_all_customer_data_using_with_api_endpoint(String api_endpoint)  {

         response = given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,"Accept",ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        System.out.println("===================================================================================");


    }

    @Then("validate customer data")
    public void validate_customer_data() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer5[] customer5 = objectMapper.readValue(response.asString(),Customer5[].class);

        // ilk musterinin ismi
        System.out.println(customer5[0].getFirstName());

        // 5. musterinin email adresi
        System.out.println(customer5[4].getEmail());

        System.out.println("===================================================================================");

        // tum musterilerin SsN numaralari
        for(int i = 0 ; i < customer5.length ; i++){
            System.out.println(customer5[i].getSsn());
        }

        System.out.println("===================================================================================");

    // M harfi ile baslayan musteri isimleri
        for(int i = 0 ; i < customer5.length ; i++){
            if(customer5[i].getFirstName().startsWith("M")){
                System.out.println(customer5[i].getFirstName());
            }
        }

        System.out.println("===================================================================================");

        for(int i = 0 ; i < customer5.length ; i++ ) {
            if(customer5[i].getUser() != null) {
                System.out.println(customer5[i].getUser().getFirstName());
            }
        }

    }


    // ============================  read all countries =================================


    @Then("read all countries and write country ids to txt using api endpoint {string}")
    public void read_all_countries_and_write_country_ids_to_txt_using_api_endpoint(String api_url) throws IOException {

            response = given().headers("Authorization",
                    "Bearer "+ConfigurationReader.getProperty("token"),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept", ContentType.JSON)
                    .when()
                    .get(api_url)
                    .then()
                    .contentType(ContentType.JSON)
                    .extract()
                    .response();

            response.prettyPrint();

            // validate isleminde kullanmak icin tum ulke idlerini bir listin icine atalim

        List<String> countryId = new ArrayList<>();

        // objectmapper kullanarak deserilazition yapiyoruz

        ObjectMapper objectMapper = new ObjectMapper();

        Country5 [] country5 = objectMapper.readValue(response.asString(),Country5[].class);

        // for dongusu ile tum country id lerini daha  once olusturdugumuz listin icine ekleyelim

        for(int i = 0 ; i < country5.length ; i++){
            countryId.add(String.valueOf(country5[i].getId()));
        }

        // ulke idlerini txt olarak yazdiralim

        WriteToTxt.saveDataInFileWithCountry5Id("countryId2",country5);

        // txt olarak yazdirdigimiz idleri readtxt uzerinden okutalim

        List<String> readId = ReadTxt.returnCountry5IdList("countryId2");

        // validasyon

        Assert.assertEquals("mot match" , countryId ,readId);
        System.out.println("Validation is succesfull");




    }


    // ============================  create all countries =================================


    @Given("create country {string}")
    public void create_country(String api_url) {

        response = given().headers("Authorization",
                "Bearer "+ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .body(createCountry)
                .post(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        createdCountryId = jsonPath.getInt("id");

        System.out.println("=======================================================");

        System.out.println(createdCountryId);


    }

    // ============================  validate created country =================================
    @Then("validate created a country")
    public void validate_created_a_country() {

        response = given().headers("Authorization",
                "Bearer "+ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        String stringIds = jsonPath.getString("id");

        String stringCreatedCountryId = String.valueOf(createdCountryId);

        Assert.assertTrue("not contain" ,stringIds.contains(stringCreatedCountryId));
        System.out.println("Validation is succesfull");



    }




    // ============================  update created country =================================


    @Given("update created a country using api end point {string}  {string} and its extension {string}")
    public void update_created_a_country_using_api_end_point_and_its_extension(String api_url, String name, String id) {

        Map <String , Object> putCountry = new HashMap<>();
        putCountry.put("id",id);
        putCountry.put("name",name);
        putCountry.put("states",null);


        response = given().headers("Authorization",
                "Bearer "+ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept", ContentType.JSON)
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


    @Given("delete updated a country using endpoint {string} and its extension {string} and validate")
    public void delete_updated_a_country_using_endpoint_and_its_extension_and_validate(String api_url, String id) {

        response = given().headers("Authorization",
                "Bearer "+ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .delete(api_url+id)
                .then()
                .extract()
                .response();

       Response responseNew = given().headers("Authorization",
                "Bearer "+ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

       JsonPath jsonPath =responseNew.jsonPath();
       String ids = jsonPath.getString("id");

       Assert.assertFalse("not delete" , ids.contains(id));
       System.out.println("Validation is succesfull");



    }




}
