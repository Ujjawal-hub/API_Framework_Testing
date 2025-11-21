package Assert;

import io.restassured.response.Response;
import org.testng.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.Assert.assertEquals;

public class Assertactions {

    public void verifyResponseBody(String expected,String Actual,String description ){

        assertEquals(expected,Actual,description);
    }
    public void verifyResponseBody(int expected,int Actual,String description ){

        assertEquals(expected,Actual,description);
    }

public void verifystatuscode(Response response, Integer Actual){

        assertEquals(response.getStatusCode(),Actual);
}

public void verifyingKey(String Key,String Actual){

    assertThat(Key).isNotNull().isNotBlank().isEqualTo(Actual);

}

public void verifyingKeynotNull(long Key){

        assertThat(Key).isNotNull();

}

public void verifyingKeynotNull(String Key){
        assertThat(Key).isNotNull();

}

public void verifyTrue(boolean Key){

        Assert.assertTrue(Key);
}
}
