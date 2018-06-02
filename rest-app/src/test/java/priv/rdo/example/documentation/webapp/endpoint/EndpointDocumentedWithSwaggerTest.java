package priv.rdo.example.documentation.webapp.endpoint;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EndpointDocumentedWithSwaggerTest {
    @LocalServerPort
    private int port;

    @Test
    public void randomResponse() {
        //given
        RequestSpecification requestSpecification = RestAssured.given()
                .port(port)
                .log().ifValidationFails();

        //when
        Response response = requestSpecification.when()
                .get("api/random-numbers/integers");

        //then
        response.then()
                .assertThat()
                .statusCode(200)
                .body("nextInt", CoreMatchers.notNullValue())
                .body("uuid", CoreMatchers.notNullValue());
    }
}
