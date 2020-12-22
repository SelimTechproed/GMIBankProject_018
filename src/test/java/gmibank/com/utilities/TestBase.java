package gmibank.com.utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBase {

    protected RequestSpecification apiCountryLogin;

    @Before
    public void setApiCountryLogin(){
      apiCountryLogin = new RequestSpecBuilder().setBaseUri("https://www.gmibank.com/api/tp-countries").build();
    }



}
