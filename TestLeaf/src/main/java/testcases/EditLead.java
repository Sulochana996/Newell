package testcases;

import org.junit.Test;

import junit.framework.Assert;
import wrappers.LoginWrapper;

public class EditLead extends LoginWrapper{
	
	@Test
	public void editLead_TC001() {
	
	login();
	
	//Click Leads link
	clickByLink("Leads");
	//Click Find leads
	clickByLink("Find Leads");
	sleep(3000);
	//Enter First Name
	
	enterByXpath("(//label[contains(text(),'First name:')])[3]/following::input[1]", "demo1");
	//Click Find Leads
	clickByXpath("//button[text()='Find Leads']");
	sleep(6000);
	//click on first resulting link
    clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
    //verify title page
    boolean title = verifyTitle("View Lead | opentaps CRM");
    Assert.assertEquals(true, title);
    //click on edit button
    clickByXpath("//a[text()='Edit']");
	//Change the company name
    enterById("updateLeadForm_companyName", "Demo4");
    //click update button
    clickByXpath("//input[@type='submit' and @value='Update']");
    //Confirm the changed name appears
    verifyTextContainsByXpath("//span[contains(text(),'Demo4')]", "Demo4");
    closeBrowser();
	
	}

}
