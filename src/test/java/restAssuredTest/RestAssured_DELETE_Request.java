package restAssuredTest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class RestAssured_DELETE_Request {

	
	@Test()
	public void deleteTheRecord() {	
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.statusLine("HTTP/1.1 204 No Content");
		
	}
}
