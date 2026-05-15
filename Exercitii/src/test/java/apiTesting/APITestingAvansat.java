package apiTesting;

import config.TestConfig;
import org.testng.annotations.Test;
import utils.TokenUtils;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class APITestingAvansat {

    @Test
    public void dummyJsonLimit5() {
        given()
                .queryParam("limit", 5)
                .when()
                    .get(TestConfig.DUMMY_DOMAIN + TestConfig.PRODUCTS_ENDPOINT)
                .then()
                    .statusCode(200)
                    .body("limit", equalTo(5));
    }

    @Test
    public void dummyJsonProductsSearch() {
        given()
                .queryParam("q", "phone")
                .when()
                .get(TestConfig.DUMMY_DOMAIN + TestConfig.SEARCH_ENDPOINT)
                .then()
                .statusCode(200);
    }

    @Test
    public void courseNameAPIAutomation() {
        given()
                .header("Course-Name", "API Automation")
                .when()
                .get(TestConfig.HTTP_BIN_DOMAIN + TestConfig.HEADERS_ENDPOINT)
                .then()
                .statusCode(200)
                .body("headers.Course-Name", equalTo("API Automation"));
    }

    @Test
    public void contentTypeVerification(){
        String payload = "{\n" +
                "  \"title\": \"API advanced session\",\n" +
                "  \"level\": \"beginner-intermediate\"\n" +
                "}";
        given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post(TestConfig.HTTP_BIN_DOMAIN + "/post")
                .then()
                .statusCode(200)
                .body("headers.Content-Type", equalTo("application/json"))
                .body("json.title", equalTo("API advanced session"));
    }

    @Test
    public void basicAuthValidCredentials(){
        given()
                .auth()
                .basic("user", "passwd")
                .when()
                .get(TestConfig.HTTP_BIN_DOMAIN + "/basic-auth/user/passwd")
                .then()
                .statusCode(200)
                .body("authenticated", equalTo(true))
                .body("user", equalTo("user"));
    }

    @Test
    public void basicAuthInvalidCredentials(){
        given()
                .auth()
                .basic("user", "wrongPAssword")
                .when()
                .get(TestConfig.HTTP_BIN_DOMAIN + "/basic-auth/user/passwd")
                .then()
                .statusCode(401);
    }

    @Test
    public void loginToGetAccessToken(){
        String payload = "{\n" +
                "\"username\": \"emilys\",\n" +
                "\"password\": \"emilyspass\"\n" +
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

        System.out.println(accessToken);
    }

    @Test
    public static void loginWithToken(){
        String token = TokenUtils.getAccessToken("emilys", "emilyspass");

        given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get(TestConfig.DUMMY_DOMAIN + "/auth/me")
                .then()
                .statusCode(200)
                .body("username", equalTo("emilys"));
    }


}
