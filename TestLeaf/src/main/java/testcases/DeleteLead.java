package testcases;

import org.junit.Test;

import wrappers.LoginWrapper;

public class DeleteLead extends LoginWrapper{
	
	@Test
	public void deleteLead_TC001() throws InterruptedException{
	
	login();
	
	//Click Leads link
		clickByLink("Leads");
		//Click Find leads
		clickByLink("Find Leads");
		//Click on phone tab
		clickByXpath("//span[contains(text(),'Phone')]");
		//enter phone number
		enterByXpath("//input[@name='phoneNumber']", "9884535076");
		//Click find leads button
		clickByXpath("//button[contains(text(),'Find Leads')]");
		sleep(6000);
		//Capture name of First Resulting lead ID
		String capturedLeadID=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		//Click First Resulting lead
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		//Click on delete button
		clickByXpath("//a[text()='Delete']");
		//Click Find leads
		clickByLink("Find Leads");
		//Enter the captured lead ID
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input[1]", capturedLeadID);
		//Click find leads button
		clickByXpath("//button[contains(text(),'Find Leads')]");
		sleep(7000);
		verifyTextByXpath("//div[contains(text(),'No records to display')]", "No records to display");
		closeBrowser();
	
	}

}
