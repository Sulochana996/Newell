package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("This is not View Leads Page", "FAIL");
		}
	}

	public ViewLeadPage verifyFirstName(String capturedFName) {
		verifyTextById("viewLead_firstName_sp", capturedFName);
		return this;
	}

	public ViewLeadPage verifyCompanyName(String capturedCompName) {
		String CompName_afterEdit = null;
		CompName_afterEdit = getTextById("viewLead_companyName_sp");
		Assert.assertEquals(CompName_afterEdit.substring(0, CompName_afterEdit.indexOf(" ")), capturedCompName);
		return this;
	}

	public OpenTapsPage clickEdit() {
		clickByXpath("//a[text()='Edit']");
		return new OpenTapsPage(driver, test);
	}

	public DuplicateLeadPage clickDuplicateLead() {
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver, test);
	}

	public MyLeadsPage clickDelete() {
		clickByXpath("//a[text()='Delete']");
		return new MyLeadsPage(driver, test);
	}

	// Click Find Leads link
	public FindLeadsPage clickFindLeads() {
		clickByLink(prop.getProperty("MyLeads.FindLeads.Link"));

		return new FindLeadsPage(driver, test);

	}

}
