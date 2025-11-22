package modules;

import POJO.request.resfullbooker.Auth;
import POJO.request.resfullbooker.Bookingdates;
import POJO.request.resfullbooker.Bookingrequest;
import POJO.response.restfullbooker.Authresponse;
import POJO.response.restfullbooker.Bookingresponse;
import com.github.javafaker.Faker;
import com.google.gson.Gson;

public class Payloadmanager {


// serelialization


  public String sendbookingreques1(){

      Bookingrequest booking = new Bookingrequest();

      booking.setAdditionalneeds("coffe");

      booking.setTotalprice(900l);
      booking.setDepositpaid(true);
      booking.setLastname("the poet");
      booking.setFirstname("dandolien");


      Bookingdates bookingdates = new Bookingdates();
      bookingdates.setCheckin("09-09-1256");
      bookingdates.setCheckout("11-09-1256");

      booking.setBookingdates(bookingdates);


      Gson gson = new Gson();

      String data = gson.toJson(booking);
      return data;
  }



public String sendbookingreques2(){

    Bookingrequest booking = new Bookingrequest();

    booking.setAdditionalneeds("coffe");

    booking.setTotalprice(900l);
    booking.setDepositpaid(true);
    booking.setLastname("詩人");
    booking.setFirstname("タンポポ");


    Bookingdates bookingdates = new Bookingdates();
    bookingdates.setCheckin("09-09-1256");
    bookingdates.setCheckout("11-09-1256");

    booking.setBookingdates(bookingdates);


    Gson gson = new Gson();

    String data = gson.toJson(booking);
    return data;
}

    public String sendbookingreques3(){

        Bookingrequest booking = new Bookingrequest();
        Faker faker = new Faker();

        booking.setAdditionalneeds("coffe");

        booking.setTotalprice(faker.random().nextLong());
        booking.setDepositpaid(faker.random().nextBoolean());
        booking.setLastname(faker.name().firstName());
        booking.setFirstname(faker.name().firstName());


        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("09-09-1256");
        bookingdates.setCheckout("11-09-1256");

        booking.setBookingdates(bookingdates);


        Gson gson = new Gson();

        String data = gson.toJson(booking);
        return data;
    }


 // Deserielization


 public Bookingresponse recivingbookingresponse(String response){

      Gson gson = new Gson();

     Bookingresponse bookingresponse =  gson.fromJson(response, Bookingresponse.class);

     return bookingresponse;


 }


 public String sendTokenrequest(){

     Auth auth = new Auth();
     auth.setUsername("admin");
     auth.setPassword("password123");

     Gson gson = new Gson();

     return gson.toJson(auth);

 }

public Authresponse tokenreciver(String response){

      Gson gson = new Gson();

       Authresponse data = gson.fromJson(response,Authresponse.class);

 return data;
}


}


