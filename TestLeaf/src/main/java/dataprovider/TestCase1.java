package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCase1 extends Testleafclass {
//String var1 ="";
	
			@Test(dataProvider ="datasource")
			public void createLead(String fName,String lName) {			
			clickByLink("Create Lead");
			enterById("createLeadForm_companyName", "Aon");
			enterById("createLeadForm_firstName", fName);
			enterById("createLeadForm_lastName", lName);
			selectVisibileTextById("createLeadForm_dataSourceId", "Cold Call");
			selectIndexById("createLeadForm_marketingCampaignId", 2);
			enterById("createLeadForm_primaryPhoneNumber", "9600612987");
			enterById("createLeadForm_primaryEmail", "abc@gmail.com");
			clickByClassName("smallSubmit");
			//var1 = getTextById("viewLead_companyName_sp");
			//var1=var1.replaceAll("[^0-9]","");
			//System.out.println("lead company name is " +var1);				
			}	
			@DataProvider(name="datasource")
			
			public Object[][] fetchData(){
				Object[][] testdata= new Object[2][2];
				testdata[0][0]="sulo";
				testdata[0][1]="chen";
				testdata[1][0]="vasanthi";
				testdata[1][1]="saahitra";
				return testdata;			
				
			}
			
			
			
			
}
				

