package tests.vwo.crud;

import Base.BaseTest;
import POJO.response.vwo.Invalidloginresponse;
import POJO.response.vwo.Validloginresponse;
import org.testng.annotations.Test;

public class Testcase_login extends BaseTest {


   @Test
   public void negative_testcase1(){

       setup3();
            requestSpecification.body(vwOpayloadmanager.loginrequest2());
       response = requestSpecification.when().log().all().post();
         validatableResponse  = response.then().log().all();

       Invalidloginresponse data = vwOpayloadmanager.invalidloginresponse(response.asString());

       assertactions.verifystatuscode(response,401);
       assertactions.verifyingKey(data.getMessage(), "Invalid User");


   }
@Test
   public void positive_testcase1(){

       setup3();
       requestSpecification.body(vwOpayloadmanager.loginrequest1());

       response = requestSpecification.when().log().all().post();
       response.then().log().all();

       Validloginresponse data = vwOpayloadmanager.validloginresponse(response.asString());

       assertactions.verifystatuscode(response,200);
       assertactions.verifyingKey(data.getName(), "Violet Berg");
       assertactions.verifyingKey(data.getEmail(), "qecyp@flipkart.com");


   }
}
