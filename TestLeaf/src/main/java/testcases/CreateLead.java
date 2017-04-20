package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;
import wrappers.LoginWrapper;

public class CreateLead extends LoginWrapper {

	@Test
	public void createLead_TC001(){
		login();
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "CTS");
		enterById("createLeadForm_firstName", "Manoj");
		enterById("createLeadForm_lastName", "Shetty");
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");
		selectIndexById("createLeadForm_marketingCampaignId",3);
		enterByName("firstNameLocal", "Mano");
		enterByName("lastNameLocal", "Shetty");
		enterByName("personalTitle", "Smiley");
		enterByName("generalProfTitle", "Happy");
		enterById("createLeadForm_departmentName", "Selenium");
		enterById("createLeadForm_annualRevenue", "20000");
		selectVisibileTextById("createLeadForm_currencyUomId", "INR - Indian Rupee");
		selectVisibileTextById("createLeadForm_industryEnumId", "Computer Software");
		enterByName("numberEmployees", "30");
		selectVisibileTextById("createLeadForm_ownershipEnumId", "Corporation");
		enterById("createLeadForm_sicCode", "05NOV");
		enterById("createLeadForm_tickerSymbol", "11");
		enterById("createLeadForm_description", "Lead Creation Description");
		enterById("createLeadForm_importantNote", "Important Note");
		
		//Contact Information
		enterByName("primaryPhoneCountryCode", "044");
		enterById("createLeadForm_primaryPhoneNumber", "9830284972");
		enterById("createLeadForm_primaryPhoneAreaCode", "044");
		enterByName("primaryPhoneExtension","31574");
		enterByName("primaryPhoneAskForName", "9907736507");
		enterById("createLeadForm_primaryEmail", "gouthami423@gmail.com");
		enterByName("primaryWebUrl","http://testleaf.herokuapp.com/");
		
		//Primary Address
		enterById("createLeadForm_generalToName", "Manoj1");
		enterById("createLeadForm_generalAttnName", "Manoj2");
		enterById("createLeadForm_generalAddress1", "Plot No 17");
		enterById("createLeadForm_generalAddress2", "Sabari Nagar");
		enterById("createLeadForm_generalCity", "Chennai");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", "California");
		enterById("createLeadForm_generalPostalCode", "517501");
		selectVisibileTextById("createLeadForm_generalCountryGeoId", "United States");
		enterById("createLeadForm_generalPostalCodeExt", "891");
		
		
		clickByName("submitButton");
		System.out.println("Create Lead is successfull");
		closeBrowser();
	}

}
