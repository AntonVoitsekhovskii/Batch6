package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import org.apache.hc.core5.http.ContentType;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

/**
 * This @FixMethodOrder(MethodSorters.Name_Ascending) will execute @Test annotation in ascending alphabetical order
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HardCodedExamples {

	/**
	 * Rest Assured
	 * given - prepare your request
	 * when - you are making the call to the endpoint
	 * then - validating
	 * @param args
	 */
	
	static String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	static String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTU2ODkzNjQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NT"
			+ "czMjU2NCwidXNlcklkIjoiNjQ1In0.TNIHlqrXHo3kR67wxZurk1KxFGpfIclBkjStb2nVllA";
	
	static String employeeID;
		
	public void sampleTestNotes() {
		
		/**
		 * Base URI for all calls
		 */
		//RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
		
		/**
		 * JWT required for all calls = expires every 12 hours
		 */
		//String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUwOTQ4MzcsImlzcyI6ImxvY2FsaG9zd"
				//+ "CIsImV4cCI6MTU5NTEzODAzNywidXNlcklkIjoiNjQ1In0.Pyc3CPASP3Qx7hV70g-atVXHZPJNF3Gtaem4diRqa-o";
		
		/**
		 * Preparing /getOneEmployee.php request
		 */
		RequestSpecification getOneEmployeeRequest = given().header("Content-Type", ContentType.JSON).header("Authorization", token).queryParam("employee_id", "16490A");//.log().all();
		
		/**
		 * Storing response
		 */
		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
		
		/**
		 * Two ways to print response
		 *prettyPrint() method converts JSON object into String and prints - no need to SOP
		 */
		
		getOneEmployeeResponse.prettyPrint();
		//String response = getOneEmployeeResponse.body().asString();
		//System.out.println(response);
		//System.out.println(getOneEmployeeResponse);
		
		/**
		 * Verifying status code is 200
		 */
		getOneEmployeeResponse.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void aPOSTcreateEmployee() {
		
		/**
		 * Preparing request for /createEmployee.php
		 */
		RequestSpecification createEmployeeRequest = given().header("Content-Type", "application/json").header("Authorization",token).body("{\n" + 
				"  \"emp_firstname\": \"syntaxFirstName\",\n" + 
				"  \"emp_lastname\": \"syntaxLastName\",\n" + 
				"  \"emp_middle_name\": \"syntaxMiddleName\",\n" + 
				"  \"emp_gender\": \"F\",\n" + 
				"  \"emp_birthday\": \"2000-07-11\",\n" + 
				"  \"emp_status\": \"Employee\",\n" + 
				"  \"emp_job_title\": \"Cloud Architect\"\n" + 
				"}");
		
		/**
		 * Storing response into createEmployeeResponse
		 */
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
		
		/**
		 * Printing response using prettyPrint() method
		 */
		createEmployeeResponse.prettyPrint();
		
		/**
		 * jsonPath() to view response body which lets us get the employee ID
		 * We store employee ID as a global variable so that we may use it with our other calls
		 */
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
		
		//optional to print employee ID
		System.out.println(employeeID);
		
		/**\
		 * Verifying response status code is 201
		 */
		createEmployeeResponse.then().assertThat().statusCode(201);
		
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
		
		/**
		 * Verifying created first name
		 */
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("syntaxFirstName"));
		
		//createEmployeeResponse.then().header("Content-Type", "text/plain");
		
		createEmployeeResponse.then().assertThat().header("Content-Type", "application/json");
	}
	
	@Test
	public void bGETcreatedEmployee() {
		
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json").header("Authorization", token).queryParam("employee_id", employeeID);//.log().all();
		
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
		
		String response = getCreatedEmployeeResponse.prettyPrint();
		
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		
		boolean verifyingEmployeeIDsMatch = empID.contentEquals(employeeID);
		System.out.println(verifyingEmployeeIDsMatch);
		
		Assert.assertTrue(verifyingEmployeeIDsMatch);
		
		/**
		 * Verifying status code 200
		 */
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);
		
		JsonPath js = new JsonPath(response);
		String emplID = js.getString("employee[0].employee_id");
		String firstName = js.getString("employee[0].emp_firstname");
		String middleName = js.getString("employee[0].emp_middle_name");
		String lastName = js.getString("employee[0].emp_lastname");
		String empBday = js.getString("employee[0].emp_birthday");
		String gender = js.getString("employee[0].emp_gender");
		String jobTitle = js.getString("employee[0].emp_job_title");
		String status = js.getString("employee[0].emp_status");
		
		System.out.println(emplID);
		System.out.println(firstName);
		
		//Verifying employee ID's match
		Assert.assertTrue(emplID.contentEquals(employeeID));
		
		//Verifying expected first name matches actual first name
		Assert.assertTrue(firstName.contentEquals("syntaxFirstName"));
		
		//Verifying expected middle name matches actual middle name
		Assert.assertTrue(middleName.contentEquals("syntaxMiddleName"));
		
		//Verifying expected last name matches actual last name
	    Assert.assertTrue(lastName.contentEquals("syntaxLastName"));
	    
	    //Verifying expected birthday matches actual birthday
	    Assert.assertTrue(empBday.contentEquals("2000-07-11"));
	    
	    //Verifying expected gender matches actual gender
	    Assert.assertTrue(gender.contentEquals("Female"));
	    
	    //Verifying expected job title matches actual job title
	    Assert.assertTrue(jobTitle.contentEquals("Cloud Architect"));
	    
	    //Verifying expected status matches actual status
	    Assert.assertTrue(status.contentEquals("Employee"));
		
	}
	
	@Test
	public void cGETallEmployees() {
		
		/**
		 * Preparing /getAllEmployee.php request
		 */
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json").header("Authorization", token);
		
		/**
		 * Storing response into getAllEmployeesResponse
		 */
		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
		//getAllEmployeesResponse.prettyPrint();
		
		String allEmployees = getAllEmployeesResponse.body().asString();
		
		//allEmployees.contains(employeeID);
		/**
		 * ---------------- DO RESEARCH -----------------
		 */
		//allEmployees.matches(employeeID);
		
		JsonPath js = new JsonPath(allEmployees);
		int sizeOfList = js.getInt("Employees.size()");
		System.out.println(sizeOfList);
		
		/**
		 * Print all employees ID's
		 */
		for(int i = 0; i <= sizeOfList; i++) {
			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
			//System.out.println(allEmployeeIDs);
			
			/**
			 * If statement inside for loop to find stored employee ID and break the loop when found
			 */
			if(allEmployeeIDs.contentEquals(employeeID)) {
				System.out.println("Employee ID: " + employeeID + " is present in body");
				String employeeFirstName = js.getString("Employees[" + i + "].emp_firstname");
				System.out.println(employeeFirstName);
				
				break;
			}
		}
	}
	
	@Test
	public void dPUTupdateCreatedEmployee() {
		
		RequestSpecification updateCreatedEmployeeRequest = given().header("Content-Type", "application/json").header("Authorization", token).body("{\n" + 
				"  \"employee_id\": \""+ employeeID + "\",\n" + 
				"  \"emp_firstname\": \"syntaxUpdatedFirstName\",\n" + 
				"  \"emp_lastname\": \"syntaxUpdatedLastName\",\n" + 
				"  \"emp_middle_name\": \"syntaxUpdatedMiddleName\",\n" + 
				"  \"emp_gender\": \"F\",\n" + 
				"  \"emp_birthday\": \"2000-07-11\",\n" + 
				"  \"emp_status\": \"Employee\",\n" + 
				"  \"emp_job_title\": \"Cloud Consultant\"\n" + 
				"}");
		Response updateCreatedEmployeeResponse = updateCreatedEmployeeRequest.when().put("/updateEmployee.php");
		
		String response = updateCreatedEmployeeResponse.prettyPrint();
		
		
	}
}
