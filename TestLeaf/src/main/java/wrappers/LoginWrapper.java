package wrappers;

import org.junit.Test;

public class LoginWrapper extends GenericWrappers {
	
	public void login(){
		
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		System.out.println("Login into LeafTaps successful");
		clickByLink("CRM/SFA");
	}
	

}
