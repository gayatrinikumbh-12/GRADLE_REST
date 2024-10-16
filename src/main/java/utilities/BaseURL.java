package utilities;

public class BaseURL {
  
	
	String BaseURLRead()
	{
		String baseUrl;
		return   baseUrl = PropertyUtils.getProperty("base.url");
	}
}
