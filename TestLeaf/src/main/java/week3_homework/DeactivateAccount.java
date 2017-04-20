package week3_homework;

import org.junit.Test;

import junit.framework.Assert;

import wrappers.LoginWrapper;

public class DeactivateAccount extends LoginWrapper{
	static String captureID;
		@Test

public void deactivateAcct_TC001() {
			
	login();
	clickByLink("Accounts");
	clickByLink("Find Accounts");
	enterByXpath("(//input[@name='accountName'])[2]", "test");
	clickByXpath("//button[text()='Find Accounts']");
	sleep(5000);
	String capturedID=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	System.out.println("Captured ID-->"+capturedID);
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	sleep(5000);
	Assert.assertTrue(verifyTitle("Account Details | opentaps CRM"));
	clickByLink("Deactivate Account");
	Assert.assertEquals("Are you sure?",getAlertText());
	acceptAlert();
	verifyTextContainsByXpath("//span[contains(text(),'This account was deactivated as of')]", "This account was deactivated as of");
	clickByLink("Find Accounts");
	enterByXpath("//input[@name='id']", capturedID);
	clickByXpath("//button[text()='Find Accounts']");
	sleep(5000);
	verifyTextByXpath("//div[contains(text(),'No records to display')]", "No records to display");
	closeBrowser();
	}
}
