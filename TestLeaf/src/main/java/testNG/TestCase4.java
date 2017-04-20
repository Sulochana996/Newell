package testNG;


import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TestCase4 extends GenericWrappers {

	@Test(enabled = false)
	public void mergelead(){
		
		
		clickByLink("Leads");
		clickByLink("Merge Leads");
		
		clickByXpath("(//img[@alt='Lookup'])[1]");
		
		switchToLastWindow();
		
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","21");
		
		clickByXpath("//button[contains(text(),'Find Leads')]");		
		
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
				
		switchToParentWindow();
				
		clickByXpath("(//img[@alt='Lookup'])[2]");
				
		//move to new window
		switchToLastWindow();
				
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","22");
				
				
		clickByXpath("//button[contains(text(),'Find Leads')]");
				
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
				
				//switch back to primary window
				
		switchToParentWindow();
				
				//click merge
				
		clickByLinkNoSnap("Merge");
				
				//click accept alert
		acceptAlert();
				
				//click find leads
		clickByLink("Find Leads");
				
				
				enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","13218");
				
				clickByXpath("//button[contains(text(),'Find Leads')]");
				
				clickByXpath("//div[contains(text(),'No records to display')]")	;
				
				
		
	}

}
