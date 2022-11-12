package tests;

import base_url.RestfulBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.BukingdatesPojo;
import pojos.BukingPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get01 extends RestfulBaseUrl {
        /*
         Given
             https://restful-booker.herokuapp.com/booking/19
         When
        I send GET Request to the URLbooking
       Then
        Status code is 200
    And
        Response body is like:
       {
      "firstname": "Joe",
      "lastname": "Morante Briones",
      "totalprice": 111,
      "depositpaid": true,
      "bookingdates": {
          "checkin": "2018-01-01",
          "checkout": "2019-01-01"
      },
      "additionalneeds": "Breakfast"
     }
      */
    @Test
    public void get01(){
        // Set The Url
        spec.pathParams("first","booking","second",19);

        // Set The Expected Data
        BukingdatesPojo bukingdatesPojo = new BukingdatesPojo("2018-01-01","2019-01-01");
        BukingPojo expectedData = new BukingPojo("Joe","Morante Briones",111,
                                                    true, bukingdatesPojo, "Breakfast");
        System.out.println("expectedData = " + expectedData);

        // Set the Request and The Response
        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        // Do Assertion
        BukingPojo actualData = response.as(BukingPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(expectedData.getFirstname(),actualData.getFirstname());
        assertEquals(expectedData.getLastname(),actualData.getLastname());
        assertEquals(expectedData.getTotalprice(),actualData.getTotalprice());
        assertEquals(expectedData.getDepositpaid(),actualData.getDepositpaid());
        assertEquals(expectedData.getAdditionalneeds(),actualData.getAdditionalneeds());

        assertEquals(bukingdatesPojo.getCheckin(),actualData.getBukingdatesPojo().getCheckin());
        assertEquals(bukingdatesPojo.getCheckout(),actualData.getBukingdatesPojo().getCheckout());


    }
}
