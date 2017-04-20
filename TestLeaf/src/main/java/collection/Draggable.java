package collection;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://jqueryui.com/draggable/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  WebElement frame =driver.findElementByXPath("//iframe[@class='demo-frame']");
	  driver.switchTo().frame(frame);
	  WebElement drag = driver.findElementById("draggable");
	 Actions builder = new Actions(driver);
	 builder.dragAndDropBy(drag, 100, 100).perform();
	  
	  

	}

}*/
//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://jqueryui.com/draggable/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		WebElement frame = driver.findElementByClassName("demo-frame");

		driver.switchTo().frame(frame);
		
		
		WebElement draggable = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 100, 100).perform();
	}

}

