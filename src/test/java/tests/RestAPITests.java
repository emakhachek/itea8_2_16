package tests;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.basic;
import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.internal.matchers.StringContains.containsString;

/**
 * Rest API Simple Tests for the https://emakhachek.testrail.net/ site
 */
public class RestAPITests {

    @Before
    public void setUp() {
        RestAssured.authentication = basic("kmahachek@gmail.com","Ekateriwa33");
    }

    @Test
    public void basicPingTestRaiIs() {
        given().when().get("https://emakhachek.testrail.com/index.php?/api/v2/get_case/1").then()
                .statusCode(200);
    }

    @Test
    public void verifyTestCaseTitle() {
        given().when().get("https://emakhachek.testrail.com/index.php?/api/v2/get_case/1").then()
                .body("title",equalTo("Verify successful user login"));
    }

}
