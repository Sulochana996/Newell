package day3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class leaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
									
		//Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
						
				//Load the URL
				driver.get("http://leaftaps.com/control/main");
				
				//maximize
				driver.manage().window().maximize();		
				
				//Enter UserName""
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//Enter Password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//Click Login
				driver.findElementByClassName("decorativeSubmit").click();

				driver.findElementByLinkText("CRM/SFA").click();
				
				driver.findElementByLinkText("Leads").click();
				
				driver.findElementByLinkText("Merge Leads").click();
				
				driver.findElementByXPath("//img[@alt='Lookup'])[1]").click();
				
				//new window
				
				
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input");
				
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]a").click();
				
				//switch back to primary window
				
				driver.findElementByXPath("//img[@alt='Lookup'])[2]").click();
				
				//move to new window
				
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input");
				
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]a").click();
				
				//switch back to primary window
				
				//click merge
				
				//click accept alert
				
				//click find leads
				
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input");
				
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				
				driver.findElementByXPath("//div[contains(text(),'No records to display')]")	;
				
				}
	
				

	}


