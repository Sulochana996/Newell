package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("This is not My Create Leads Page", "FAIL");
		}
	}

	// Click Create Lead
	public CreateLeadPage clickCreateLead() {
		clickByLink(prop.getProperty("MyLeads.CreateLead.Link"));

		return new CreateLeadPage(driver, test);

	}

	// Click Find Leads link
	public FindLeadsPage clickFindLeads() {
		clickByLink(prop.getProperty("MyLeads.FindLeads.Link"));

		return new FindLeadsPage(driver, test);

	}

	// Click merge Leads link
	public MergeLeadPage clickMergeLeads() {
		clickByLink(prop.getProperty("MyLeads.MergeLeads.Link"));

		return new MergeLeadPage(driver, test);

	}

	public MyLeadsPage clicktoLeadIcon() {
		clickByXpath("(//img[@alt='Lookup'])[2]");

		return this;

	}

}
