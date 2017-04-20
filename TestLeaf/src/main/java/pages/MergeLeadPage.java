package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("This is not merge lead Page", "FAIL");
		}
	}

	// Click fromLead icon
	public MergeLeadPage clickfromLeadIcon() {
		clickByXpath("(//img[@alt='Lookup'])[1]");

		return this;

	}

	// Click fromLead icon
	public MergeLeadPage clicktoLeadIcon() {
		clickByXpath("(//img[@alt='Lookup'])[2]");

		return this;

	}

	// Click merge
	public MergeLeadPage clickMerge() {
		clickByLinkNoSnap("Merge");

		return this;

	}
	
	public ViewLeadPage acceptAlertDialog() {
		acceptAlert();

		return new ViewLeadPage(driver, test);

	}

	public FindLeadsWindowPage switchTolastwindow() {
		switchToLastWindow();
		return new FindLeadsWindowPage(driver, test);
	}

}
