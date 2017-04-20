package day3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) {
		//Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
				
		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Contact Us").click();
		Set<String> irctcWindow =driver.getWindowHandles();	
		System.out.println("no of windows:"+irctcWindow.size());
		
		for (String wins : irctcWindow) {
			driver.switchTo().window(wins);
			
		}
		System.out.println("title ="+driver.getTitle());
		driver.close();
	}

}
