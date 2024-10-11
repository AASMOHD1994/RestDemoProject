package api.tests;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test2User {

	@Test
	public void m1(ITestContext con) {
		
		Response res=(Response) con.getSuite().getAttribute("Response");
	
		System.out.println("I m in Test2User "+res.jsonPath().get().toString());
		
	}

}
