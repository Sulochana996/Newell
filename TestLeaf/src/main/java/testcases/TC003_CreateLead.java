package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login and EditLead (Positive)";
		testDescription="Login To Opentaps and Create Lead";
		browserName="chrome";
		dataSheetName="TC003";
		category="Sanity";
		authors="Gou";
		
	}

	@Test(dataProvider="fetchData")
	public void CreateLead(String userName, String password, String CompanyName, String FName, String LName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FName)
		.enterLastName(LName)
		.clickCreateLeadButton()
		.verifyFirstName(FName);

	}

}
