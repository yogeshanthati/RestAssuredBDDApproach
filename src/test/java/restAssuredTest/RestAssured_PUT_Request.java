package restAssuredTest;



import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class RestAssured_PUT_Request {

	HashMap<String,String> map= new HashMap<String,String>();
	
	String name=RestUtils.getFirstName();
	String job=RestUtils.getLastName();
	
	
	@BeforeClass()
	
	public void setUP(){
		
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users/2";
		map.put("name", name);
		map.put("job", job);
	
	}
	
	
	
	@Test()
	public void RestAssured_PUTData(){
		
	  given()
	  .headers("Content-Type", "application/json")
	  .body(map)
	  .when()
	  .put()
	  .then()
	  .statusCode(200)
	  .and()
	  .body("name", equalTo(name))
	  .and()
	  .body("job", equalTo(job))
	  .and()
	  .assertThat()
	  .body(containsString("2020-01-05"));
	}


	
	
	
	
	
	
}
