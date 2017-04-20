package dataprovider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TestCase4 extends GenericWrappers {

	//@Test(enabled = false)
	//@Test(groups ={"regression"})
	@Test(dataProvider ="datasource")
	public void mergeLead(String fName,String lName) {
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","21");
		clickByXpath("//button[contains(text(),'Find Leads')]");		
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","22");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","13218");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("//div[contains(text(),'No records to display')]")	;
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


