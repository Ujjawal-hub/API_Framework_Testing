package tests.restfullbooker.Crud;

import Base.BaseTest;
import endpoints.API_constants;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Testcase_Healthcheck extends BaseTest {

    @Test

    public void testacse_healthcheckup(){

       setup2();

        requestSpecification.basePath(API_constants.Ping_URL);
        response = requestSpecification.log().all().get();

       validatableResponse =  response.then().log().all();

        validatableResponse.statusCode(201);

assertactions.verifystatuscode(response,201);
    }

}
