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

    public RequestSpecification requestSpecification;
    public Response response;
    public ValidatableResponse validatableResponse;

    public Assertactions assertactions;
    public Payloadmanager payloadmanager;

@BeforeTest
    public void setup(){

    assertactions = new Assertactions();
    payloadmanager = new Payloadmanager();
    requestSpecification = RestAssured.given().baseUri(API_constants.Base_URL);
    requestSpecification.contentType("application/json").log().all();

}




}
