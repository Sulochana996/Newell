package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsWindowPage extends LeafTapsWrappers {

	public FindLeadsWindowPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Find Leads")) {
			reportStep("This is not Find Leads Window Page", "FAIL");
		}
	}

	// Enter from lead ID
	public FindLeadsWindowPage enterFromleadID(String fromleadID) {
		enterByName("id", fromleadID);
		return this;

	}

	// Enter to lead ID
	public FindLeadsWindowPage enterToleadID(String toleadID) {
		enterByName("id", toleadID);
		return this;

	}

	// click find leads button
	public FindLeadsWindowPage clickFindLeadsButtonNoSnap() {
		clickByXpathNoSnap("//button[text()='Find Leads']");
		sleep(6000);
		return this;

	}

	// Capture the firstName
	public String captureLeadID() {
		String capturedLeadID = null;
		capturedLeadID = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");

		return capturedLeadID;

	}

	public FindLeadsWindowPage clickFirstResultingLead() {
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		sleep(5000);
		return this;

	}

	public MergeLeadPage switchToparentwindow() {
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}
}
