package testcases;

import org.junit.Test;

public class createaccount extends Testleafclass {
	//String var1="";
	@Test
	public void crtacct() {
		login();
		
		clickByLink("Accounts");
		clickByLink("Create Account");
		enterById("accountName","vasukarthi10");
		enterById("groupNameLocal","Karthik Vasu");
		enterById("officeSiteName", "Google");
		enterByName("annualRevenue", "80000000");
		selectVisibileTextById("currencyUomId", "INR - Indian Rupee");
		selectIndexById("industryEnumId", 2);
		enterById("numberEmployees", "800");
		selectIndexById("//select[@name='ownershipEnumId']", 1);
		enterById("sicCode", "TL");
		enterById("tickerSymbol","Test Ticker");
		selectVisibileTextById("dataSourceId", "Employee");
		selectIndexById("marketingCampaignId", 1);
		selectIndexById("initialTeamPartyId", 1);
		enterByXpath("//textarea[@name='description']","Test Description");
	    enterByName("importantNote","Test Important Note");
	    enterById("primaryPhoneCountryCode", "+91");
	    enterById("primaryPhoneNumber","9600116715");
	    enterByName("generalCity","Chennai");
	    enterById("primaryEmail", "vasukarthi@mail.com");
	    selectVisibileTextById("generalCountryGeoId", "India");
	    selectVisibileTextById("generalStateProvinceGeoId", "TAMILNADU");
	    clickByXpathNoSnap("//input[@value='Create Account']");
	    String str=getTextByXpath("//*[text()='Account Name']/../following-sibling::td/span");
	    
	    String aID=str.substring(str.indexOf("(")+1,str.indexOf(")"));
	    String aName=str.substring(0,str.indexOf(" "));
	    System.out.println("Account Id : "+aID);
	    System.out.println("Accout Name : "+aName);
	    
	    clickByLink("Find Accounts");
	    enterByXpath("//label[text()='Account ID:']/following::div/input[1]",aID);
	    enterByXpath("(//label[text()='Account ID:']/following::div/input)[2]",aName);
	    clickByXpathNoSnap("//button[text()='Find Accounts']");
	    
	    verifyTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a", aID);
	    verifyTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-groupName'])[1]/a", aName); 
	    closeBrowser();
	
	}
}