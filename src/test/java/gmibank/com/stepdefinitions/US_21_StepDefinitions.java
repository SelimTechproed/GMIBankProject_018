package gmibank.com.stepdefinitions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
@JsonIgnoreProperties(ignoreUnknown = true)
public class US_21_StepDefinitions {
    Response response;
    JsonPath jsonPath;
   // Countries[] countries;
   Country[] countries;

    @Given("In countries user sets all response using end point {string}")
    public void In_countries_user_sets_all_response_using_end_point(String countries_url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(countries_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }



    List<Integer> id=new ArrayList<>();
    @Given("In countries user deserialization data json to java pojo")
    public void In_countries_user_deserialization_data_json_to_java_pojo () throws IOException {

        jsonPath=response.jsonPath();

        ObjectMapper objectMapper=new ObjectMapper();
       //
        // countries=objectMapper.readValue(response.asString(), Countries[].class);
        countries=objectMapper.readValue(response.asString(), Country[].class);
        System.out.println(countries[0].getName());//sadece ilk name

        for(int i=0;i<countries.length;i++){
            id.add(countries[i].getId());
            System.out.println(id);
        }
        WriteToTxt.saveDataInFileWithCountrId("allCountriesid.txt",countries);



    }

    @Given("In countries user validates data.")
    public void In_countries_user_validates_data () {

        //countries icindeki id value larini list halinde return eder ve verify yapar
        List<Integer> listid=jsonPath.getList("id");
        System.out.println(listid);
        Assert.assertTrue(" id kaydi yok",listid.contains(30848));

        //countries icindeki name value larini list halinde return eder ve verify yapar
        List<String> listname=jsonPath.getList("name");
        System.out.println(listname);
        Assert.assertTrue("name kaydi yok",listname.contains("Norwegan"));


        //countries icindeki states value larini list halinde return eder ve verify yapar
        List<String> liststates=jsonPath.getList("states");
        System.out.println(liststates);

    }

}


