package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Duplicate Lead | opentaps CRM")) {
			reportStep("This is not duplicate Page Page", "FAIL");
		}
	}

	public ViewLeadPage clickCreateLeadButton()

	{
		clickByName(prop.getProperty("Duplicate.CreateLead.Button"));
		return new ViewLeadPage(driver, test);

	}

}
