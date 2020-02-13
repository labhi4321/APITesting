import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class response_body {
	
	@Test	
	public void GetWeatherDetails() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";		
		RequestSpecification httpRequest = RestAssured.given();		
		Response response =httpRequest.request(Method.GET,"/Hyderabad");
		String responseBody = response.body().asString();
		System.out.println("The response Body is " + responseBody);		
		Assert.assertEquals(responseBody.toLowerCase().contains("hyderabad"), true);
		
		
		
		
		
	}
	

	

}
