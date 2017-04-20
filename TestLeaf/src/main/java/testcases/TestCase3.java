package testcases;

import org.junit.Test;

public class TestCase3 extends Testleafclass {
String var1="";
	@Test
	public void deletLead() {
		login();
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
		enterByXpath("//input[@class=' x-form-text x-form-field ']", var1);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		verifyTextByXpath("//div[@class='x-paging-info']", "No records to display");
		closeBrowser();
			

	}
}
