package groups;


import org.testng.annotations.Test;


public class TestCase3 extends Testleafclass {
String var1="";
//@Test(dependsOnMethods = {"testNG.TestCase1.createLead"})
	//@Test(timeOut=15000)
@Test(groups ={"regression"})
	public void deletLead() {
		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("(//span[@class='x-tab-strip-inner'])[2]");
		enterByName("phoneNumber", "9600");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		var1 =getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println("Selected record is :"+var1);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByClassName("subMenuButtonDangerous");
		clickByLink("Find Leads");
		//enterByXpath("//input[@class=' x-form-text x-form-field ']", var1);
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", var1);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		verifyTextByXpath("//div[@class='x-paging-info']", "No records to display");
		
			

	}
}
