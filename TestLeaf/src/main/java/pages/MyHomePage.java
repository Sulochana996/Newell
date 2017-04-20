package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {

	// This is to confirm you are in Login Page
	public MyHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("My Home | opentaps CRM")) {
			reportStep("This is not Login Page", "FAIL");
		}
	}

	// Click lead
	public MyLeadsPage clickLead() {

		clickByLink(prop.getProperty("MyHome.Leads.Link"));
		return new MyLeadsPage(driver, test);

	}

}
