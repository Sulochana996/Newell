package dataprovider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrappers.GenericWrappers;


public class Testleafclass extends GenericWrappers {
	@Parameters({"browser","url","usename","pwd"})

	@BeforeMethod	
	public void login(String browser, String url, String usename, String pwd){
		invokeApp(browser, url);
		enterById("username", usename);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");						
	}
	@AfterMethod	
	public void close(){
		closeBrowser();

	}
}
