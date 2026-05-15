package utils;

import config.TestConfig;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsNull.notNullValue;

public class TokenUtils {

    public static String getAccessToken(String username, String password){
        String payload = "{\n" +
                "\"username\": \"" + username +  "\",\n" +
                "\"password\": \"" + password + "\"\n" +
                "} \n";

        String accessToken = given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post(TestConfig.DUMMY_DOMAIN + "/auth/login")
                .then()
                .statusCode(200)
                .body("accessToken", notNullValue())
                .extract()
                .path("accessToken");

        return accessToken;
    }
}
