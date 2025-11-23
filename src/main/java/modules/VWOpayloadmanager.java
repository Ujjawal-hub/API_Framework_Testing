package modules;

import POJO.request.vwo.Loginrequest;
import POJO.response.vwo.Invalidloginresponse;
import POJO.response.vwo.Validloginresponse;
import com.google.gson.Gson;

public class VWOpayloadmanager {

   public String loginrequest1(){

       Loginrequest loginrequest = new Loginrequest();

       loginrequest.setUsername("qecyp@flipkart.com");
       loginrequest.setPassword("Pa$$w0rd!");
       loginrequest.setRemember(false);
       loginrequest.setRecaptchaResponseField("");

       Gson gson = new Gson();

       String data = gson.toJson(loginrequest);

       return data;

   }



    public String loginrequest2(){

        Loginrequest loginrequest = new Loginrequest();

        loginrequest.setUsername("q");
        loginrequest.setPassword("P");
        loginrequest.setRemember(false);
        loginrequest.setRecaptchaResponseField("");

        Gson gson = new Gson();

        String data = gson.toJson(loginrequest);

        return data;

    }

   public Invalidloginresponse invalidloginresponse(String response){

       Gson gson = new Gson();

        Invalidloginresponse data =  gson.fromJson(response,Invalidloginresponse.class);

        return data;

   }

      public Validloginresponse validloginresponse(String response){

       Gson gson = new Gson();
       Validloginresponse data = gson.fromJson(response,Validloginresponse.class);

       return data;

      }
}
