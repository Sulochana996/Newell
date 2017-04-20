package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCase2 extends Testleafclass {
	//String var1="";
	//@Test(dependsOnMethods = {"testNG.TestCase1.createLead"})
	//@Test(groups ={"sanity"})
	@Test(dataProvider ="datasource")
	public void createLead(String fName,String lName) {		

		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//div/input[@name='firstName'])[3]", fName);
		clickByXpath("//button[text()='Find Leads']");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", lName);
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		verifyTextById("viewLead_companyName_sp", lName);	
	}
	@DataProvider(name="datasource")
	public Object[][] fetchData(){
		Object[][] testdata= new Object[2][2];
		testdata[0][0]="sulo";
		testdata[0][1]="google";
		testdata[1][0]="vasanthi";
		testdata[1][1]="microsoft";
		return testdata;
	}
}