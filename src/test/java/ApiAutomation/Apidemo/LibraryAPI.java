package ApiAutomation.Apidemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class LibraryAPI {

	@Test
	public void add_book() {
		RestAssured.baseURI="http://216.10.245.166";
		given().body(Testap1.input_payload()).when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200);
	}
}
