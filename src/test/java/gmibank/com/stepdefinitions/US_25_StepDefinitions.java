package gmibank.com.stepdefinitions;
import gmibank.com.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static gmibank.com.jsonModels.CountryJson.createCountry;
import static io.restassured.RestAssured.given;
public class US_25_StepDefinitions {
    Response response;
    Response responseAll;
    @Given("user sets the response using api end point {string} and creates country")
    public void user_sets_the_response_using_api_end_point_and_creates_country(String endpoint) {
        response=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().body(createCountry)
                .post(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }
    @Then("user reads all countries from end point {string}")
    public void user_reads_all_countries_from_end_point(String endpoint) {
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
        responseAll.prettyPrint();
    }
    @Then("user asserts for new country")
    public void user_asserts_for_new_country() {
        // String response2=responseAll.asString();
        // String response1=response.asString();
        // JsonPath jsonPath=responseAll.jsonPath();
        //  JsonPath jsonPath2=response.jsonPath();
        // Assert.assertTrue("not find", response2.contains(response1));
        JsonPath jsonPath=responseAll.jsonPath();
        JsonPath jsonPath2=response.jsonPath();
        String countryName=jsonPath2.getString("name");
        String countryNames=jsonPath.getString("name");
        Assert.assertTrue("not verify",countryNames.contains(countryName));
        System.out.println("================Countries can be addded=================");
    }
}