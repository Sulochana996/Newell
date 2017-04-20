package week7_homework;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://leafground.com/pages/Calendar.html");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//click on the calender link
		driver.findElementById("datepicker").click();
		
		//Locate the table
		WebElement table=driver.findElementByXPath("//table[@class='ui-datepicker-calendar']/tbody");
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows in a calnder table is "+rows.size());
		
		
		for (WebElement row : rows) {
			List<WebElement> columns= row.findElements(By.tagName("td"));
			    System.out.println("column size in each row is "+columns.size()); 
			  	for(int i=0;i<=(columns.size()-1);i++){
				
			  			if(columns.get(i).getText().equalsIgnoreCase("10")){
			  			System.out.println("Data present in the column is ->"+columns.get(i).getText());
			  			driver.findElementByXPath("//a[text()='10']").click();
			  			//System.out.println("date selected ->"+driver.findElementById("datepicker").getText());
			  			break;
			  		    }
			     }
		    
		}
	
		driver.close();
		
	}

}
