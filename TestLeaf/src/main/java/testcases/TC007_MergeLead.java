package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.FindLeadsWindowPage;
import pages.LoginPage;
import pages.MergeLeadPage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import wrappers.LeafTapsWrappers;

public class TC007_MergeLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login and MergeLead (Positive)";
		testDescription="Login To Opentaps and merge Lead";
		browserName="chrome";
		dataSheetName="TC007";
		category="Sanity";
		authors="Gou";
		
	}

	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String password, String fromLeadID,String toLeadID,String errorMsg){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickMergeLeads()
		.clickfromLeadIcon()
		.switchTolastwindow()
		.enterFromleadID(fromLeadID)
		.clickFindLeadsButtonNoSnap();
		String captureFromLeadID=new FindLeadsWindowPage(driver, test).captureLeadID();
		new FindLeadsWindowPage(driver, test)
		.clickFirstResultingLead()
		.switchToparentwindow()
		.clicktoLeadIcon()
		.switchTolastwindow()
		.enterToleadID(toLeadID)
		.clickFindLeadsButtonNoSnap();
		String captureToLeadID=new FindLeadsWindowPage(driver, test).captureLeadID();
		new FindLeadsWindowPage(driver, test)
		.clickFirstResultingLead()
		.switchToparentwindow()
		.clickMerge()
		.acceptAlertDialog()
		.clickFindLeads()
		.enterLeadID(captureFromLeadID)
		.clickFindLeadsButton()
		.verifyErrorMsg(errorMsg);

	}

}
