package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Find Leads | opentaps CRM")) {
			reportStep("This is not My Create Leads Page", "FAIL");
		}
	}

	// Enter firstname
	public FindLeadsPage enterFirstName(String fName) {
		enterByXpath("(//input[@name='firstName'])[3]", fName);
		return this;

	}

	// Enter firstname
	public FindLeadsPage enterLeadID(String leadID) {
		enterByName("id", leadID);
		return this;

	}

	// Enter email
	public FindLeadsPage enterEmail(String email) {
		enterByXpath("//input[@name='emailAddress']", email);
		return this;

	}

	// Enter phone
	public FindLeadsPage enterPhone(String phone) {
		enterByXpath("//input[@name='phoneNumber']", phone);
		return this;

	}

	// Click email tab
	public FindLeadsPage clickEmailTab() {
		clickByXpath("//span[contains(text(),'Email')]");
		return this;

	}

	// Click phone tab
	public FindLeadsPage clickPhoneTab() {
		clickByXpath("//span[text()='Phone']");
		return this;

	}

	// click find leads button
	public FindLeadsPage clickFindLeadsButton() {
		clickByXpath("//button[text()='Find Leads']");
		return this;

	}

	// Capture the firstName
	public String captureFirstName() {
		String capturedFname = null;
		capturedFname = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");

		return capturedFname;

	}

	// Capture the firstName
	public String captureLeadID() {
		String capturedLeadID = null;
		capturedLeadID = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");

		return capturedLeadID;

	}

	// verify error message
	public FindLeadsPage verifyErrorMsg(String errorMsg) {
		verifyTextByXpath("//div[text()='No records to display']", errorMsg);
		return this;

	}

	public ViewLeadPage clickFirstResultingLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		sleep(5000);
		return new ViewLeadPage(driver, test);

	}
}
