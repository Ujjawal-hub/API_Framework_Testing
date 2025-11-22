package tests.restfullbooker.Crud;

import Base.BaseTest;
import POJO.response.restfullbooker.Authresponse;
import POJO.response.restfullbooker.Bookingresponse;
import endpoints.API_constants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase_create_booking extends BaseTest {


    @Test(groups = {"reg"}, priority = 1)
    public void create_booking_positive_1() {

        RequestSpecification requestSpecification = setup2();


        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
        requestSpecification.body(payloadmanager.sendbookingreques1());
        response = requestSpecification.when().post();

        Bookingresponse bookingresponse = payloadmanager.recivingbookingresponse(response.asString());

        assertactions.verifyingKey(bookingresponse.getBooking().getFirstname(), "dandolien");
        assertactions.verifyingKeynotNull(bookingresponse.getBookingid());
        assertactions.verifystatuscode(response, 200);
    }

    @Test
    public void create_booking_positive_2() {

        RequestSpecification requestSpecification = setup2();

        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
        requestSpecification.body(payloadmanager.sendbookingreques2());
        response = requestSpecification.when().post();

        Bookingresponse bookingresponse = payloadmanager.recivingbookingresponse(response.asString());


        assertactions.verifyingKeynotNull(bookingresponse.getBookingid());
        assertactions.verifystatuscode(response, 200);


    }

    @Test
    public void create_booking_positive_3() {

        RequestSpecification requestSpecification = setup2();

        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
        requestSpecification.body(payloadmanager.sendbookingreques3());
        response = requestSpecification.when().post();

        Bookingresponse bookingresponse = payloadmanager.recivingbookingresponse(response.asString());
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        assertactions.verifyingKeynotNull(bookingresponse.getBookingid());


    }

    @Test
    public void create_booking_negative_1() {

        RequestSpecification requestSpecification = setup2();

        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
        requestSpecification.contentType("{ }");
        requestSpecification.body(payloadmanager.sendbookingreques3());
        response = requestSpecification.when().post();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(500);
    }


    @Test
    public void create_booking_negative_2(){

        RequestSpecification requestSpecification = setup2();

        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
        requestSpecification.body("{}");
        response = requestSpecification.when().post();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(500);





    }

    @Test
    public void create_booking_negative_3(){
        RequestSpecification requestSpecification = setup2();

        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);
        requestSpecification.contentType("application/HTML");
        requestSpecification.body(payloadmanager.sendbookingreques3());
        response = requestSpecification.when().post();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(500);





    }

    @Test
    public void create_booking_negative_4() {

        RequestSpecification requestSpecification = setup2();
        requestSpecification.baseUri(API_constants.App_Vwo_login_URL);
        requestSpecification.basePath(API_constants.Create_Update_Booking_URL);

        requestSpecification.body(payloadmanager.sendbookingreques3());
        response = requestSpecification.when().post();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(404);

    }
        @Test
        public void gettokentestcase() {

            RequestSpecification requestSpecification = setup2();
            requestSpecification.basePath(API_constants.Auth_URL).body(payloadmanager.sendTokenrequest());

            response = requestSpecification.when().log().all().post();

            response.then().log().all();
            Authresponse data = payloadmanager.tokenreciver(response.asString());

            assertactions.verifyingKeynotNull(data.getToken());
            assertactions.verifystatuscode(response, 200);


        }



}