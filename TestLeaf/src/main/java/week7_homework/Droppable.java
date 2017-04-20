package week7_homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Droppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://jqueryui.com/droppable/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		WebElement frame = driver.findElementByClassName("demo-frame");

		driver.switchTo().frame(frame);
		
		
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		
		String drophereTxt= driver.findElementByXPath("//div[@id='droppable']/p").getText();
		Assert.assertEquals(drophereTxt, "Drop here");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
		
		String droppedTxt= driver.findElementByXPath("//div[@id='droppable']/p").getText();
		Assert.assertEquals(droppedTxt, "Dropped!");
		
		driver.close();

	}

}
