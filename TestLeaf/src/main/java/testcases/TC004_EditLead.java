package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login and EditLead (Positive)";
		testDescription="Login To Opentaps and Edit Lead";
		browserName="chrome";
		dataSheetName="TC004";
		category="Smoke";
		authors="Gou";
		
	}

	@Test(dataProvider="fetchData")
	public void CreateLead(String userName, String password, String FName, String editCompName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickFindLeads()
		.enterFirstName(FName)
		.clickFindLeadsButton()
		.clickFirstResultingLead()
		.clickEdit()
		.enterCompanyName(editCompName)
		.clickUpdate()
		.verifyCompanyName(editCompName);

	}

}
