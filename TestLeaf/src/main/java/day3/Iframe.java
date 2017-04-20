package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		//Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
				
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//maximize
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		driver.switchTo().alert().sendKeys("vasanthi");
		driver.switchTo().alert().accept();
		String str=driver.findElementById("demo").getText();
		
		if(str.contains("vasanthi"))
				{ 
			System.out.println("Value Matched");
				}
		else
		{
			System.out.println("Value Unmatched");
		}
		


	}

}
