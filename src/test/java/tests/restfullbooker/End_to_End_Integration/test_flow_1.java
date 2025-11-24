package tests.restfullbooker.End_to_End_Integration;

import Base.BaseTest;
import POJO.response.restfullbooker.Booking;
import POJO.response.restfullbooker.Bookingresponse;
import endpoints.API_constants;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class test_flow_1 extends BaseTest {


    @Test(priority = 1)
    public void test_create_booking(ITestContext iTestContext){

        setup2();
     response =    requestSpecification.basePath(API_constants.Create_Update_Booking_URL)
             .body(payloadmanager.sendbookingreques1()).when().log().all().post();

        Bookingresponse data = payloadmanager.recivingbookingresponse(response.asString());

        assertactions.verifystatuscode(response,200);
        assertactions.verifyingKey(data.getBooking().getFirstname(),"dandolien");
        assertactions.verifyingKeynotNull(data.getBookingid());

iTestContext.setAttribute("bookingid",data.getBookingid());


    }

@Test(priority = 2)
public void test_get_booking(ITestContext iTestContext){
    setup2();

    requestSpecification.basePath(API_constants.Create_Update_Booking_URL + "/" + iTestContext.getAttribute("bookingid"));

    response = requestSpecification.when().log().all().get();

    response.then().log().all();

  Booking data = payloadmanager.bookingidresponse(response.asString());

  assertactions.verifystatuscode(response,200);
  assertactions.verifyingKeynotNull(data.getAdditionalneeds());



    }
@Test(priority = 3)
public void test_update_booking(ITestContext iTestContext){

        setup2();
        String token = set_get_token();
        iTestContext.setAttribute("token",token);
        requestSpecification.basePath(API_constants.Create_Update_Booking_URL+"/"+iTestContext.getAttribute("bookingid")).cookie("token",token).body(payloadmanager.sendbookingreques2());
        response = requestSpecification.when().log().all().put();

        Booking data = payloadmanager.bookingidresponse(response.asString());

        assertactions.verifyingKey(data.getFirstname(), "タンポポ");


}
@Test(priority = 4)
public void delete_booking(ITestContext iTestContext){

        setup2();
        requestSpecification.basePath(API_constants.Create_Update_Booking_URL+"/"+iTestContext.getAttribute("bookingid")).cookie("token",iTestContext.getAttribute("token"));
        response = requestSpecification.when().log().all().delete();

        validatableResponse = response.then();

        validatableResponse.statusCode(201);

}



}
