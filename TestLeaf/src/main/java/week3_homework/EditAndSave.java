package week3_homework;

import org.junit.Test;

import junit.framework.Assert;
import wrappers.LoginWrapper;

public class EditAndSave extends LoginWrapper {
	
	@Test
	public void editAndsave_TC001() {
		
		login();
		clickByLink("Accounts");
		clickByLink("Find Accounts");
		enterByXpath("(//input[@name='accountName'])[2]", "test");
		clickByXpath("//button[text()='Find Accounts']");
		sleep(5000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		sleep(5000);
		Assert.assertTrue(verifyTitle("Account Details | opentaps CRM"));
		clickByLink("Edit");
		enterById("accountName", "TestGouthami");
		clickByXpath("//input[@type='submit' and @value='Save']");
		String capturedAcctName=getTextByXpath("//span[text()='Account Name']/following::span");
		System.out.println("Actual account name value-->"+capturedAcctName);
		String accountName = capturedAcctName.substring(0,capturedAcctName.indexOf(" "));
		System.out.println("Account name after separation->"+accountName);
		Assert.assertEquals("TestGouthami", accountName);
		closeBrowser();
	}

}
