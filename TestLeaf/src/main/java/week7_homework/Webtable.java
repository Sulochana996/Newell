package week7_homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import wrappers.GenericWrappers;

public class Webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://leafground.com/pages/table.html");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		//String input="Learn Locators";
		//String input="Learn to interact with Elements";
		String input="Handle Exceptions";
		
		//Locate the table
		WebElement table=driver.findElementByXPath("//div[@id='contentblock']/section/div[1]/table");
		
		//Identify how many rows in a table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows in a table is "+rows.size());
		
		//Identify how many columns in a row
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
		System.out.println("No of columns in a row is "+columns.size());
		
		int rowNo=0;
		for (WebElement row : rows) {
			
			if((rowNo>0) && (rowNo<=rows.size()-1)){
			   System.out.println("current row No is "+rowNo);
			   List<WebElement> col=row.findElements(By.tagName("td"));
			    
				System.out.println("String text in first column of first row "+col.get(0).getText());
			
				if(col.get(0).getText().equalsIgnoreCase(input)){
				System.out.println("The progres percentage for a given input string is "+col.get(1).getText());
			    break;
				}
				
			}
			rowNo=rowNo+1;
			
		}
		
		driver.close();

	}

}
