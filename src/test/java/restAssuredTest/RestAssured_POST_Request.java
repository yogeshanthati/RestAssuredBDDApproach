package restAssuredTest;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;


public class RestAssured_POST_Request {
	
	HashMap<String,String> map= new HashMap<String,String>();
	@BeforeClass()
	
	public void setUP(){
		
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getUserName());
		map.put("Email", RestUtils.getPassword());
	}
	
	
	
	@Test()
	public void RestAssured_POSTData(){
		
	  given()
	  .headers("Content-Type", "application/json")
	  .body(map)
	  .when()
	  .post()
	  .then()
	  .statusCode(201)
	  .and()
	  .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
	  .and()
	  .body("Message", equalTo("Operation completed successfully"));	
	}


}

/* body:
 * { "FirstName" : "Yogesh", "LastName":"Anthati", "UserName" : "yogeshanthati",
 * "Password":"yogesh123", "Email" : "yogesh213@gmail.com" }
 * 
 * 
 * out put
 * {
"SuccessCode": "OPERATION_SUCCESS",
"Message": "Operation completed successfully"
}
 * 
 * 
 */
