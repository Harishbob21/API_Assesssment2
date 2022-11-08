package assessmentoauth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteWithOauth {
    @Test
	public void delete() {
    	
    	RestAssured.baseURI="https://dev120775.service-now.com/api/now/table";
    	Response response = RestAssured.given().header("Authorization","Bearer qePtdkhJERZCKfqy4TNfJwVlL2uTUb5ozvmVgjFguQ3iCQVbkJfelfumjm80hgiOu_r9HCUInR_0ZFlmR6217g")
    			.delete("/incident/d4f9327697721110aba1318c1253af97");
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}
