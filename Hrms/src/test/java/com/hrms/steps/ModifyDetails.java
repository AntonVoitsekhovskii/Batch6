package com.hrms.steps;

import java.util.List;
import java.util.Map;

import hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyDetails extends CommonMethods{

	@When("user modify other information")
	public void user_modify_other_information(DataTable dataTable) {
	    List<Map<String, String>> empInfo = dataTable.asMaps();
	    
	    for(Map<String, String> map : empInfo) {
	    	String licNum = map.get("LicenseNumber");
	    	String licExp = map.get("LicExpDate");
	    	String ssn = map.get("SsnNum");
	    	String sin = map.get("SinNum");
	    	String gender = map.get("Gender");
	    
	    	
	    	sendText(pdetails.driversLic, licNum);
	    	sendText(pdetails.expiryLic, licExp);
	    	sendText(pdetails.ssnNumber, ssn);
	    	sendText(pdetails.sinNumber, sin);
	    	click(pdetails.saveEditBtn);
	    	wait(4);
	    	
	    }
	}

	@Then("user information was added successfully")
	public void user_information_was_added_successfully() {
	   
	}
	
	@And("user clicks edit button")
	public void user_clicks_edit_button() {
		click(pdetails.saveEditBtn);
	}
}
