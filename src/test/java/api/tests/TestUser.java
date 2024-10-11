package api.tests;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoint;
import api.payloads.User;
import io.restassured.response.Response;

public class TestUser {

	User user = new User();

	@BeforeClass
	public void setData() {

		user.setId(3);
		user.setUsername("AasMohd");
		user.setFirstName("Random");
		user.setLastName("body");
		user.setEmail("random@gmail.com");
		user.setPassword("123456");
		user.setPhone("735140085");
		user.setUserStatus(45);

	}

	@Test(priority=1)
	public void testPostUser(ITestContext context) {

		Response res = UserEndPoint.createUser(user);
		context.getSuite().setAttribute("Response", res);
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.jsonPath().get().toString());

	}
	
	@Test(priority=2)
	public void testGetUser()
	{
		Response res=UserEndPoint.getUser(user.getUsername());
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.jsonPath().get().toString());
		
	}
	
	@Test(priority=3)
	public void testUpdateUser()
	{
		user.setEmail("Here@gmail.com");
		Response res=UserEndPoint.updateUser(user);
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.jsonPath().get().toString());
		
	}
	
	@Test(priority=4)
	public void testGetUser2()
	{
		Response res=UserEndPoint.getUser(user.getUsername());
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.jsonPath().get().toString());
		System.out.println(res.jsonPath().get("id").toString());
		System.out.println(res.jsonPath().get("firstName").toString());
		System.out.println(res.jsonPath().get("lastName").toString());
		
		
	}
	
	@Test(priority=5)
	public void testDeleteUser()
	{
		Response res=UserEndPoint.deleteUser(user.getUsername());
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.jsonPath().get().toString());
		
	}
	
	@Test(priority=6)
	public void testGetUser3()
	{
		Response res=UserEndPoint.getUser(user.getUsername());
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.jsonPath().get().toString());
		
	}

}
