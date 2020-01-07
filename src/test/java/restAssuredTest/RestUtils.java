package restAssuredTest;
 import org.apache.commons.lang3.RandomStringUtils;
public class RestUtils {

	
	public static String getFirstName() {
		

		 return "yogesh"+RandomStringUtils.randomAlphabetic(2);
		
	}

	public static String getLastName() {
		

		return "Anthati"+RandomStringUtils.randomAlphabetic(2);
		
	}
	
	public static String getUserName() {
		

		 return "yogesh"+RandomStringUtils.randomAlphabetic(2);
		
	}
	
	public static String getPassword() {
		
		 return "yogesh"+RandomStringUtils.randomAlphabetic(3);
		
	}
	
	public static String getEmail() {
		

		 return "yogesh"+RandomStringUtils.randomAlphabetic(2)+"@gmail.com";
		
	}


}

