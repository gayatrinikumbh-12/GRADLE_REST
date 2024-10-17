
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HealthCheckTest extends BaseTest {

    @Test
    public void testHealthCheckEndpoint() {
        given().
        when().
            get("/healthcheck").
        then().
            assertThat().
            statusCode(200).
            body("status", equalTo("ok"))
            .log().all();
        
    }
}