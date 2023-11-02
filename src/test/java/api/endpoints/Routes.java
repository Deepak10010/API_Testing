//I only maintain the URLs in this class.
//Where do I get the URLs? - From Swagger UI
package api.endpoints;

/*
Swagger URI : https://petstore.swagger.io
Create user(Post) : https://petstore.swagger.io/v2/user
Get user(Get) : https://petstore.swagger.io/v2/user/{username}
Update user(Put) : https://petstore.swagger.io/v2/user/{username}
Delete user(Delete) : https://petstore.swagger.io/v2/user/{username}
*/
public class Routes {
	/*I am making this public so that I can access where ever I want in the project
	 I am making it static so that I can use it directly by using class name without using an object
	 */
	public static String base_url = "https://petstore.swagger.io/v2";
	
	
	//user module
	public static String post_url = base_url+"/user";
	public static String get_url = base_url+"/user/{username}";
	public static String update_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";
	
	//store module
			//Here you will create Store module URLs
	
	
	//Pet module
			//Here you will create pet module URLs

}
