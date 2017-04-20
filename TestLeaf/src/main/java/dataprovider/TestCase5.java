package dataprovider;

import org.testng.annotations.Test;

public class TestCase5 extends Testleafclass {
	String var1="";
	@Test(groups ={"regression"})
	public void dupliLead() {
		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpathNoSnap("//span[contains(text(),'Email')]");
		enterByName("emailAddress", "sulochana996@gmail.com");
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		var1=getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		System.out.println("The text get from Xpath is : "+var1);
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByLink("Duplicate Lead");
		verifyTitle("Duplicate Lead");
		clickByName("Submit Button");
		var1.equalsIgnoreCase("22861");
		


	}
}