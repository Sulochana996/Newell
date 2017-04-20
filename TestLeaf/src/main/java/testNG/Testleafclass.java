package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import wrappers.GenericWrappers;


	public class Testleafclass extends GenericWrappers {
		@BeforeMethod 		
	
		public void login(){
			invokeApp("chrome", "http://leaftaps.com");
			enterById("username", "DemoSalesManager");
			enterById("password", "crmsfa");
			clickByClassName("decorativeSubmit");
			clickByLink("CRM/SFA");
			
			
		}
		
		@AfterMethod		
		public void close(){
			closeBrowser();
			
		}
		
		
	}
