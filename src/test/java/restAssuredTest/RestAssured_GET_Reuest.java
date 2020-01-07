package restAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssured_GET_Reuest {
	/*
	 * given()
	 * set cookies,add auth,add param,set headers info etc..
	 * when() get,post,put ,delete
	 * then() Validate status code,extract response,extract header cookies &
	 * response body...
	 */
	@Test()
	public void getWeatherDetails() {	
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City",equalTo("Hyderabad") )
		.headers("Content-Type",equalTo("application/json"));
	}
}
