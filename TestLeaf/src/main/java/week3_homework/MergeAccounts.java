package week3_homework;

import org.junit.Test;

import junit.framework.Assert;
import wrappers.LoginWrapper;

public class MergeAccounts extends LoginWrapper{
	
	@Test
	public void mergeAcct_TC001() {
		login();
		clickByLink("Accounts");
		clickByLink("Merge Accounts");
		//Click on Icon near from lead
		clickByXpath("(//img[@alt='Lookup'])[1]");
		//Switch to a window
		switchToLastWindow();
		//Now the control move to the second window
		boolean title = verifyTitle("Find Accounts");
		Assert.assertEquals(true, title);
		//Enter lead  say 12 in the text field
		enterByXpath("//input[@name='id']", "18");
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		String capturedFromID=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		System.out.println("Captured ID-->"+capturedFromID);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		//Switch to a window
		switchToLastWindow();
		enterByXpath("//input[@name='id']", "17");
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		String capturedToID=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		System.out.println("Captured ID-->"+capturedToID);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		switchToParentWindow();
		//Now Click on Merge link
		clickByLinkNoSnap("Merge");
		//Here confirmation alert will be shown.
		 //First switch to alert
		acceptAlert();
		clickByLink("Find Accounts");
		enterByXpath("//input[@name='id']", capturedFromID);
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		verifyTextByXpath("//div[contains(text(),'No records to display')]", "No records to display");
		closeBrowser();
		
		
		
		
	}

}
