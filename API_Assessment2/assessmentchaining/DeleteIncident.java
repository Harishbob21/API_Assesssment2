package assessmentchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentchaining.PutIncidentWithFile.put")
	public void delete() {
    	
    	Response response = RestAssured.given().header("Authorization","Bearer qePtdkhJERZCKfqy4TNfJwVlL2uTUb5ozvmVgjFguQ3iCQVbkJfelfumjm80hgiOu_r9HCUInR_0ZFlmR6217g")
    			.delete("/incident/"+sys_id);
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}
