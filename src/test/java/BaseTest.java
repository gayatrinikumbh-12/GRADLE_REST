

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utilities.PropertyUtils;

public class BaseTest {

	@BeforeClass
	void setBaseTest()
	{
		String baseUrl = PropertyUtils.getProperty("base.url");
        
		RestAssured.baseURI = baseUrl;

       
		
	}
}
