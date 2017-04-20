package week4_wrappers;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class Testleaf_LoginWrapper extends GenericWrappers {
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void loginTestLeaf(String browser, String url, String username, String password){
		
		invokeApp(browser, url);
		enterById("username", username);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		System.out.println("Login into LeafTaps successful");
	}
	
	@AfterMethod	
	public void CloseBrowser(){
	
		closeBrowser();
	}
	
	

}
