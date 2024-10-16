package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class CommonRequestSpec {

	
	static RequestSpecification authRequestSpecBuilder(String accessToken)
	{
		return new RequestSpecBuilder()
	            .setContentType("application/json")
	            .addHeader("Authorization", "Bearer " + accessToken)
	            .build();

	}
}
