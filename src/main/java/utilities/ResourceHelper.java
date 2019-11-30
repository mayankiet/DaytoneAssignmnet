package utilities;

import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class ResourceHelper {

    public ResourceHelper() throws IOException {
    }

    public static Response create(String url, String Json){
        return given()
                .auth()
                .basic("Authorization", "Basic cVY3MzBibUdHbTJtM0I5UlJyeDYxVmJkS0x3YTpiVlZ4Qm5UZWg2WDF6aDFfdWZnX05lR0cxQzBh")
                //.header("Authorization", "Basic cVY3MzBibUdHbTJtM0I5UlJyeDYxVmJkS0x3YTpiVlZ4Qm5UZWg2WDF6aDFfdWZnX05lR0cxQzBh")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .when()
                .body(Json)
                .post(url);
    }

    public static Response update(String url, String Json){
        return given()
                .header("", "")
                .header("Content-Type", "application/json")
                .when()
                .body(Json)
                .put(url);
    }

    public static Response get(String url){
        return given()
                .header("", "")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()
                .get(url);
    }

    public static Response createNew(String url, String Json){
        return given()
                .header("", "")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()
                .body(Json)
                .post(url);
    }
}
