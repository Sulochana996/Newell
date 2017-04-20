package testcases;

import org.junit.Test;

public class Editsave extends Testleafclass {
	//String var1="";
	@Test
	public void editacct() {
		login();
		
		clickByLink("Accounts");
		clickByLink("Create Account");
		enterById("accountName", "vasu karthik");
		
		
		enterByName("industryEnumId", "Aerospace");
		
		enterById("currencyUomId", "SGD - Singapore Dollar");
		enterById("dataSourceId", "Coldcall");
		enterById("marketingCampaignId", "Affiliate Sites");
		enterById("primaryPhoneNumber", "24819948");
		enterById("generalCity", "Dubai");
		enterById("primaryEmail", "abc@xyz.com");
		enterById("generalCountryGeoId", "India");
		enterById("generalStateProvinceGeoId", "TAMILNADU");
		clickByClassName("smallSubmit");
	}
}