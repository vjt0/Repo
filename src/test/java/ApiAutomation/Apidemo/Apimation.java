package ApiAutomation.Apidemo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Apimation {

	@Test(dataProvider = "data")
	public void add_place(String name, String latname) throws InterruptedException {
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Testap1.add_place()).when().post("maps/api/place/add/json").then().log().all().assertThat()
				.statusCode(200).body("place_id", equalTo("220adba65c77a7f999a78f58ec63614a"))
				.header("key", "qaclick123");
		System.out.println(name +"  "+latname);

	}

	@DataProvider(name = "data")
	public Object[][] getdata() {
		return new Object[][] { { "AP1", "test" }, { "ap2", "tes" } };
	}

	@Test()
	public void get_place() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", "220adba65c77a7f999a78f58ec63614a")
				.header("Content-Type", "application/json")
				.body("{\r\n" + "    \"place_id\":\"220adba65c77a7f999a78f58ec63614a\"\r\n" + "}\r\n" + "").when()
				.get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200);
	}

	@Test(dependsOnMethods = { "get_place" })
	public void del_place() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick").header("Conten-type", "application/json")
				.body("{\r\n" + "    \"place_id\":\"220adba65c77a7f999a78f58ec63614a\"\r\n" + "}\r\n" + "").when()
				.delete("/maps/api/place/delete/json").then().log().all().assertThat().statusCode(200);

	}
}