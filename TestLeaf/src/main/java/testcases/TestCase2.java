package testcases;

import org.junit.Test;

public class TestCase2 extends Testleafclass {
	//String var1="";
	@Test
	public void dupliLead() {
		login();
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//div/input[@name='firstName'])[3]", "Sulochana");
		clickByXpath("//button[text()='Find Leads']");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", "Google_Sulo");
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		verifyTextById("viewLead_companyName_sp", "Google_Sulo1");		
		closeBrowser();		

	}
}