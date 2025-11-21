package Base;

import Assert.Assertactions;
import endpoints.API_constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import modules.Payloadmanager;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    public Response response;
    public ValidatableResponse validatableResponse;

    public Assertactions assertactions;
    public Payloadmanager payloadmanager;

@BeforeTest
    public void setup(){

    assertactions = new Assertactions();
    payloadmanager = new Payloadmanager();


}

public RequestSpecification setup2(){

    return RestAssured.given().baseUri(API_constants.Base_URL).contentType("application/json").log().all();


}




}
