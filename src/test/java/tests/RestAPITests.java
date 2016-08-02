package tests;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.internal.matchers.StringContains.containsString;

/**
 * Rest API Simple Tests for the https://emakhachek.testrail.net/ site
 */
public class RestAPITests {

    @Test
    public void basicPingTestRailIs() {
        //given().authentication().form("kmahachek@gmail.com","Ekateriwa33");
        given().auth().basic("kmahachek@gmail.com", "Ekateriwa33").expect().statusCode(200).when().get("https://emakhachek.testrail.com/index.php?/api/v2/get_case/1");
        //given().when().get("https://emakhachek.testrail.com/index.php?/api/v2/get_case/1").then()
                //.statusCode(200);
    }

    @Test
    public void verifyTestCaseTitle() {
        given().when().get("https://emakhachek.testrail.com/index.php?/api/v2/get_case/1").then()
                .body("title",equalTo("Verify successful user login"));
    }

}
