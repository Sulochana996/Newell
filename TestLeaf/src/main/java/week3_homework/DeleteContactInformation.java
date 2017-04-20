package week3_homework;

import org.junit.Test;

import wrappers.LoginWrapper;

public class DeleteContactInformation extends LoginWrapper{
	
	@Test
	public void deleteContact_TC001() {
		
		login();
		clickByLink("Accounts");
		clickByLink("Find Accounts");
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		//Click on phone tab
		clickByXpath("//span[text()='Phone']");
		//enter phone number
		enterByName("phoneNumber", "9");
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		String capturedID=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		sleep(5000);
		clickByXpath("(//div[text()[contains(.,'Phone Number')]])/following::a[2]");
		clickByXpath("(//div[text()[contains(.,'Email Address')]])/following::a[2]");
		clickByLink("Find Accounts");
		enterByName("id", capturedID);
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		sleep(5000);
		verifyTextByXpath("//div[text()='No contact information on file']","No contact information on file");
		
		closeBrowser();
	
	}

}
