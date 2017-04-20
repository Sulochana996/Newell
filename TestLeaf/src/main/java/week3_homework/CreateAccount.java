package week3_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import wrappers.LoginWrapper;

public class CreateAccount extends LoginWrapper{
	
	@Test
	public void createAccount_TC001() {
		
		login();
		clickByLink("Accounts");
		clickByLink("Create Account");
		enterById("accountName", "Test");
	//	selectVisibileTextByName("industryEnumId", "Computer Software");
		selectVisibileTextById("currencyUomId", "USD - United States Dollar");
		selectVisibileTextById("dataSourceId", "Employee");
		selectVisibileTextById("marketingCampaignId", "Automobile");
		enterById("primaryPhoneNumber", "98560283972");
		enterById("generalCity", "chennai");
		enterById("primaryEmail", "gou@gmail.com");
		selectVisibileTextById("generalCountryGeoId", "United States");
		selectVisibileTextById("generalStateProvinceGeoId", "California");
		clickByXpath("//input[@type='submit' and @value='Create Account']");
		
		String capturedAcctID=getTextByXpath("//span[text()='Account Name']/following::span");
		System.out.println("Actual account name value-->"+capturedAcctID);
		String accountID = capturedAcctID.substring(capturedAcctID.indexOf("(")+1,capturedAcctID.indexOf(")"));
		System.out.println("Account ID after separation->"+accountID);
		closeBrowser();
				
	}

}
