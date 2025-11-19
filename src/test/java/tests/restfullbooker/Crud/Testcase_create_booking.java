package tests.restfullbooker.Crud;

import Base.BaseTest;
import POJO.response.restfullbooker.Bookingresponse;
import endpoints.API_constants;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase_create_booking extends BaseTest {


@Test
public void create_booking_positive(){

requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
requestSpecification.body(payloadmanager.sendbookingreques1());
response = requestSpecification.when().post();

Bookingresponse bookingresponse =  payloadmanager.recivingbookingresponse(response.toString());

}

}
