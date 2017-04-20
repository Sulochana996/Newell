package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wrappers.LeafTapsWrappers;

public class TC006_DeleteLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login and DeleteLead (Positive)";
		testDescription="Login To Opentaps and Delete Lead";
		browserName="chrome";
		dataSheetName="TC006";
		category="Sanity";
		authors="Gou";
		
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phone,String errorMsg){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhone(phone)
		.clickFindLeadsButton();
		String capturedLeadID=new FindLeadsPage(driver, test).captureLeadID();
		new FindLeadsPage(driver, test)
		.clickFirstResultingLead()
		.clickDelete()
		.clickFindLeads()
		.enterLeadID(capturedLeadID)
		.clickFindLeadsButton()
		.verifyErrorMsg(errorMsg);
		

	}

}
