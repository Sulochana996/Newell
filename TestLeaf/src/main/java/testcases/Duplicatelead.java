package testcases;

import org.junit.Test;
import wrappers.GenericWrappers;

public class Duplicatelead extends GenericWrappers {
	
	@Test
	public void login(){
		
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterByName("emailAddress", "test@gmail.com");
		clickByLink("Find Leads");		
		
		getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		clickByLink("Duplicate Lead");
		
		verifyTextByXpath("//div[contains(text(),'Duplicate Lead')]", "Duplicate Lead");
		
		closeBrowser();
		}
}

