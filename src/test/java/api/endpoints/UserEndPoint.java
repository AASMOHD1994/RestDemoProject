package api.endpoints;

import org.testng.annotations.Test;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class UserEndPoint {
	

	
	public static Response createUser(User payload)
	{
		Response res=given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.POST_URL);
		return res;
	}
	
	public static Response getUser(String username)
	{
		Response res=given()
		.pathParam("username", username)
		.when()
		.get(Routes.GET_URL);
		
		return res;
		
	}
	
	public static Response updateUser(User payload)
	{
		Response res=given()
		.contentType(ContentType.JSON)                      //give content type when you pass payload
		.pathParam("username", payload.getUsername())
		.body(payload)
		.when()
		.put(Routes.UPDATE_URL);
		
		return res;
	}
	
	public static Response deleteUser(String username)
	{
		Response res=given()
		.pathParam("username", username)
		.when()
		.delete(Routes.DELETE_URL);
		
		return res;
		
	}
	
	



}
