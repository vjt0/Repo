package ApiAutomation.Apidemo;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;

public class DynamicData {
	public static void getplace(String value) {
		String response=given().queryParam("key", "qaclick123").queryParam("place_id", value).header("Content-Type","application/json")
		.when().get("/maps/api/place/get/json").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		JsonPath js= new JsonPath(response);
		String Actualvalue=js.getString("location.latitude");
		String Expected ="-";
		System.out.println("Latitide is:  "+js.getString("location.latitude"));
		Assert.assertEquals(Actualvalue, Expected);
        System.out.println("PASSED");
	    
	}

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(Testap1.add_place()).when()
		.post("maps/api/place/add/json").then().assertThat().statusCode(200).extract().body().asString();
		System.out.println(response);
		JsonPath js= new JsonPath(response);
		String value=js.getString("place_id");
		getplace(value);

	}

}
