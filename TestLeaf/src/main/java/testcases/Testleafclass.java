package testcases;


import org.junit.Test;

import wrappers.GenericWrappers;


	public class Testleafclass extends GenericWrappers {
		
		@Test 
		public void login(){
			invokeApp("chrome", "http://leaftaps.com");
			enterById("username", "DemoSalesManager");
			enterById("password", "crmsfa");
			clickByClassName("decorativeSubmit");
			clickByLink("CRM/SFA");
		}
	}
