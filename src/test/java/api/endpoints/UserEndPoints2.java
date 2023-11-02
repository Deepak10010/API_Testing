package api.endpoints;
import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


//Created for performing CRUD operations for the user API
public class UserEndPoints2 {
	
	//method for getting URLs from properties file
	static ResourceBundle getURL(){
		ResourceBundle routes = ResourceBundle.getBundle("routes");//Loads the properties file //name of the properties file
		return routes;
	}
	
	
	public static Response createUser(User payload){
		
		String post_url = getURL().getString("post_url");
	Response response = given()
			.contentType(ContentType.JSON) //What type of data I am sending? - JSON
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(post_url);//Have to get this from Routes class
	
	return response;
	}
	
	
	
	public static Response readUser(String userName){
		String get_url = getURL().getString("get_url");
		
		Response response = given()
				.pathParam("username",userName) //What type of data am I sending? - JSON
				
			.when()
				.get(get_url);//Have to get this from Routes class
		
		return response;
		}
	
	
	
	public static Response updateUser(String userName, User payload){
		
		String update_url = getURL().getString("update_url");
		Response response = given()
				.contentType(ContentType.JSON) //What type of data I am sending? - JSON
				.accept(ContentType.JSON)
				.pathParam("userName", userName)
				.body(payload)
			.when()
				.put(update_url);//Have to get this from Routes class
		
		return response;
		}
	
	
	
	public static Response deleteUser(String userName){
		
		String delete_url = getURL().getString("delete_url");
		Response response = given()
				.pathParam("username",userName) //What type of data am I sending? - JSON
				
			.when()
				.delete(delete_url);//Have to get this from Routes class
		
		return response;
		}

}
