package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DeleteLeadPage extends LeafTapsWrappers {

	public DeleteLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not Home Page", "FAIL");
		}
	}

	public DeleteLeadPage enterCompanyName(String data)

	{
		enterById("createLeadForm_companyName", data);
		return this;

	}

	public DeleteLeadPage enterFirstName(String data)

	{
		enterById("createLeadForm_firstName", data);
		return this;

	}

	public DeleteLeadPage enterLastName(String data)

	{
		enterById("createLeadForm_lastName", data);
		return this;

	}

	public ViewLeadPage clickSubmit()

	{
		clickByName(prop.getProperty("MyLeads.CreateLead.Button"));
		return new ViewLeadPage(driver, test);

	}

}
