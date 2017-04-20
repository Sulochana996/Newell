package testcases;


import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers {

	@Test
	public void login(){
		
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","AON");
		enterById("createLeadForm_firstName","vasanthi");
		
		enterById("createLeadForm_firstNameLocal","vasu");
		enterById("createLeadForm_personalTitle","Ms");
		enterById("createLeadForm_generalProfTitle","software");
		enterById("createLeadForm_annualRevenue","1000000");
		
		
		enterById("createLeadForm_sicCode","1234");
		enterById("createLeadForm_description","hardworking");			
		enterById("createLeadForm_importantNote","qwerty");
		enterById("createLeadForm_lastName","lingappan");
		enterById("createLeadForm_lastNameLocal","l");
		enterById("createLeadForm_birthDate","04/06/84");
		enterById("createLeadForm_departmentName","DB");
		
		enterById("createLeadForm_numberEmployees","1000");
		enterById("createLeadForm_tickerSymbol","VOD.L");
		
		
		enterById("createLeadForm_primaryPhoneCountryCode","91");
		enterById("createLeadForm_primaryPhoneAreaCode","044");
		enterById("createLeadForm_primaryPhoneExtension","75");
		enterById("createLeadForm_primaryEmail","vasanthilingappan@gmail.com");
		enterById("createLeadForm_primaryPhoneNumber","24819948");
		enterById("createLeadForm_primaryPhoneAskForName","vasu");
		enterById("createLeadForm_primaryWebUrl","www.abcd.com");
		
		
		enterById("createLeadForm_generalToName","Alt");
		enterById("createLeadForm_generalAttnName","kart");
		enterById("createLeadForm_generalAddress1","No:123 A Block Greata Pearl Apartmenrts");
		enterById("createLeadForm_generalAddress2","174 choolaimedu high road");
		enterById("createLeadForm_generalCity","Dubai");
		enterById("createLeadForm_generalStateProvinceGeoId","Guam");
		enterById("createLeadForm_generalPostalCode","600094");
		enterById("createLeadForm_generalPostalCodeExt","12345");
			
		
		clickByXpath("//*[@id='ext-gen598']");
		//System.out.println(getTextById(idVal));
	

		
		
		
	}
	
}
