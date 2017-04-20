package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class OpenTapsPage extends LeafTapsWrappers {

	// This is to confirm you are in Login Page
	public OpenTapsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("opentaps CRM")) {
			reportStep("This is not Open Taps Page", "FAIL");
		}
	}

	// Click lead
	public OpenTapsPage enterCompanyName(String updateCompanyName) {

		enterById("updateLeadForm_companyName", updateCompanyName);
		return this;

	}

	public ViewLeadPage clickUpdate()

	{
		clickByName(prop.getProperty("OpenTaps.Update.Button"));
		return new ViewLeadPage(driver, test);

	}

}
