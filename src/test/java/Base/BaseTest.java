package Base;

import Assert.Assertactions;
import endpoints.API_constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import modules.Payloadmanager;
import modules.VWOpayloadmanager;
import org.testng.annotations.BeforeTest;


public class BaseTest {

   public Response response;
   public ValidatableResponse validatableResponse;
   public RequestSpecification requestSpecification;
   public Assertactions assertactions;
    public Payloadmanager payloadmanager;
    public VWOpayloadmanager vwOpayloadmanager;


    @BeforeTest
 public void setup(){

     assertactions = new Assertactions();
     payloadmanager = new Payloadmanager();
     vwOpayloadmanager = new VWOpayloadmanager();


 }



public void setup2(){





  requestSpecification =    RestAssured.given().baseUri(API_constants.Base_URL).contentType("application/json").log().all();


}

public void setup3(){

        requestSpecification = RestAssured.given().baseUri(API_constants.App_Vwo_login_URL).contentType("application/json").log().all();

}


}
