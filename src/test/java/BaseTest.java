

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utilities.PropertyUtils;

public class BaseTest {

	@BeforeClass
	public void setBaseURI()
	{
		String baseUrl = PropertyUtils.getProperty("base.url");
        
		RestAssured.baseURI = baseUrl;

       
		
	}
}
