package ApiAutomation.Apidemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Assertions {

	@Test
	public void get_course() {
	String response=	Testap1.dummy_json();
	JsonPath js = new JsonPath(response);
	System.out.println("The total number is:           "+js.getInt("courses.size()"));
	System.out.println("The total purchase amount is:  "+js.getString("dashboard.purchaseAmount"));
	System.out.println("The Title of first course is:  "+js.getString("courses[0].title"));
	int total_amount=0;
	for(int i=0;i<3;i++) {
	String course_name=js.getString("courses["+i+"].title");
	if(course_name.equalsIgnoreCase("RPA")) {
		System.out.println("The no of copies sold by RPA are:  "+js.getInt("courses["+i+"].copies"));
	}
	int course_price=js.getInt("courses["+i+"].price");
	int no_copies =js.getInt("courses["+i+"].copies");
	System.out.println("The course name is:  "+course_name+"  !! Price:  "+course_price);
	
	total_amount=total_amount+(course_price*no_copies);
	}
	System.out.println("The Total amount is :   "+total_amount);
	int expected_amt=js.getInt("dashboard.purchaseAmount");
	Assert.assertEquals(total_amount, expected_amt);
}}
