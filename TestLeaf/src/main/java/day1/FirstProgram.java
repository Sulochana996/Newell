package day1;
	
	import org.openqa.selenium.chrome.ChromeDriver;

		public class FirstProgram {
			// TODO Auto-generated method stub
			
			public static void main(String[] args) {
	
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
			}
		}