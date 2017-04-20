package testNG;

import org.testng.annotations.Test;


public class TestCase1 extends Testleafclass {
//String var1 ="";
			@Test(invocationCount= 2)
			public void createLead() {			
			clickByLink("Create Lead");
			enterById("createLeadForm_companyName", "Aon");
			enterById("createLeadForm_firstName", "Swathi");
			enterById("createLeadForm_lastName", "Reddy");
			selectVisibileTextById("createLeadForm_dataSourceId", "Cold Call");
			selectIndexById("createLeadForm_marketingCampaignId", 2);
			enterById("createLeadForm_primaryPhoneNumber", "9600612987");
			enterById("createLeadForm_primaryEmail", "abc@gmail.com");
			clickByClassName("smallSubmit");
			//var1 = getTextById("viewLead_companyName_sp");
			//var1=var1.replaceAll("[^0-9]","");
			//System.out.println("lead company name is " +var1);				
			}		
}
				

