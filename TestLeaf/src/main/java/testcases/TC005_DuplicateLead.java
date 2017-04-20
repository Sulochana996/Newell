package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wrappers.LeafTapsWrappers;

public class TC005_DuplicateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login and DuplicateLead (Positive)";
		testDescription="Login To Opentaps and Duplicate Lead";
		browserName="chrome";
		dataSheetName="TC005";
		category="Sanity";
		authors="Gou";
		
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password, String email){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmail(email)
		.clickFindLeadsButton();
		String captureFname=new FindLeadsPage(driver, test).captureFirstName();
		new FindLeadsPage(driver, test)
		.clickFirstResultingLead()
		.clickDuplicateLead()
		.clickCreateLeadButton()
		.verifyFirstName(captureFname);

	}

}
