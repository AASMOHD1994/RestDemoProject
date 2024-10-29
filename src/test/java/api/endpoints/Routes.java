package api.endpoints;

public interface Routes {
	
	//User Module
	public static final String BASE_URL="https://petstore.swagger.io/v2";
	public static final String POST_URL=BASE_URL+"/user";
	public static final String GET_URL=BASE_URL+"/user/{username}";
	public static final String UPDATE_URL=BASE_URL+"/user/{username}";
	public static final String DELETE_URL=BASE_URL+"/user/{username}";
	
	//next module
	public static final String BASE_URL2 ="https://reqres.in/";
	public static final String GET_URL2=BASE_URL2+"api/users?page=2";

}
