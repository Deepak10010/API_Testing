package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


//Created for performing CRUD operations for the user API
public class UserEndPoints {
	
	public static Response createUser(User payload){
	Response response = given()
			.contentType(ContentType.JSON) //What type of data I am sending? - JSON
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(Routes.post_url);//Have to get this from Routes class
	
	return response;
	}
	
	
	
	public static Response readUser(String userName){
		Response response = given()
				.pathParam("username",userName) //What type of data am I sending? - JSON
				
			.when()
				.get(Routes.get_url);//Have to get this from Routes class
		
		return response;
		}
	
	
	
	public static Response updateUser(String userName, User payload){
		Response response = given()
				.contentType(ContentType.JSON) //What type of data I am sending? - JSON
				.accept(ContentType.JSON)
				.pathParam("userName", userName)
				.body(payload)
			.when()
				.put(Routes.update_url);//Have to get this from Routes class
		
		return response;
		}
	
	
	
	public static Response deleteUser(String userName){
		Response response = given()
				.pathParam("username",userName) //What type of data am I sending? - JSON
				
			.when()
				.delete(Routes.delete_url);//Have to get this from Routes class
		
		return response;
		}

}
