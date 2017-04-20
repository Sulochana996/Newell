package week1_homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact_In_TestLeaf {

	public static void main(String[] args) throws InterruptedException {
         
		 //To specify & set the chrome driver location path
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium_softwares\\chromedriver.exe" );  
		 //Initialize browser
		 WebDriver driver = new ChromeDriver();
		 
		 //To tell the webdriver to wait for 15 sec 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 //To launch chrome browser and load the application url in the browser
		 driver.get("http://www.leaftaps.com");
		 //To maximize the browser window
		 driver.manage().window().maximize();
		  
		 //To enter username
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 //To enter password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //To submit form 
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).submit();
		 //To click on CRMSFA link
		 driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		 //To click on Create Contact
		 driver.findElement(By.linkText("Create Contact")).click();
		 //To enter data in mandatory fields
		 driver.findElement(By.id("firstNameField")).sendKeys("Test_FN");
		 driver.findElement(By.id("lastNameField")).sendKeys("Test_LN");
		 //Finally to click 'create contact' submit button
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Create Contact']")).click();
		 //Wait for 5 sec for page submission.
		 Thread.sleep(5000);
		 System.out.println("View Contact Page Title - "+driver.getTitle());
		 //To close the chrome browser
		 driver.quit();
		 

	}

}
