package gmibank.com.stepdefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.com.pojos.Country;
import gmibank.com.pojos.States;
import gmibank.com.utilities.ConfigurationReader;
import gmibank.com.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;//MANUEL OLARAK HER CLASTA KOPYALA
import org.json.JSONObject;
import org.junit.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;//*tum metodlari veririr
public class US_22_StepDefinitions {
    Response response;
    //  List<Map<String, Object>> allStatesData;
    List<Integer> id=new ArrayList<>();
    States[] states;
    JsonPath jsonPath;
    @Given("user gets all data for states using api end point {string}")
    public void user_gets_all_data_for_states_using_api_end_point(String states_url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(states_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }
    @Given("user deserializes states data as json to java pojo")
    public void user_deserializes_states_data_as_json_to_java_pojo()throws IOException {
        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("name");
        System.out.println(firstName);
        // HashMap<String, String> map = response.as(HashMap.class);
        // System.out.println(map);
        //  ObjectMapper objectMapper=new ObjectMapper();
        // countries=objectMapper.readValue(response.asString(), Countries[].class);
        // states=objectMapper.readValue(response.asString(), States[].class);
        //  System.out.println(states[0].getName());//sadece ilk name
        // for(int i=0;i<states.length;i++){
        //    id.add(states[i].getId());
        //    System.out.println(id);
        // }
        //WriteToTxt.saveAllStates("allStatesid.txt",states);
        // String allStatesData=json.getList("$").toString();
        //  System.out.println(allStatesData);
        //  System.out.println(allStatesData.size());
        //  System.out.println(allStatesData.get(80).get("name").toString());
    }
    @Then("user validates the data for states")
    public void user_validates_the_data_for_states() {
        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("name");
        String expectedStateName="Stendal";
        Assert.assertTrue("not find",firstName.contains(expectedStateName));
        System.out.println("Test passed: User validates the data for states");
        // String expectedId = "60862";
        //  String actualId =response.
        // Assert.assertEquals(expectedId,actualId);
    }
}