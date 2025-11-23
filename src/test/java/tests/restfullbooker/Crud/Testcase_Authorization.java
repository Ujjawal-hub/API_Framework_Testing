package tests.restfullbooker.Crud;

import Base.BaseTest;
import POJO.response.restfullbooker.Authinvalidresponse;
import POJO.response.restfullbooker.Authresponse;
import endpoints.API_constants;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Testcase_Authorization extends BaseTest {


    @Test
    public void gettokentestcase() {

       setup2();
        requestSpecification.basePath(API_constants.Auth_URL).body(payloadmanager.sendTokenrequest());

        response = requestSpecification.when().log().all().post();

        response.then().log().all();
        Authresponse data = payloadmanager.tokenreciver(response.asString());

        assertactions.verifyingKeynotNull(data.getToken());
        assertactions.verifystatuscode(response, 200);


    }

    @Test
    public void gettokentestcase2(){

 setup2();
        requestSpecification.basePath(API_constants.Auth_URL);
        requestSpecification.body("{ }");

        response = requestSpecification.when().log().all().post();
        response.then().log().all();
        Authinvalidresponse data = payloadmanager.invalidtokenresponse(response.asString());

        assertactions.verifyingKeynotNull(data.getReason());
        assertactions.verifyingKey(data.getReason(),"Bad credentials");


    }
}
