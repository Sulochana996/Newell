package week1_homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC_Registration {

	public static void main(String[] args) throws InterruptedException {
		
		//To specify & set the chrome driver location path
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium_softwares\\chromedriver.exe" );  
		 //Initialize browser
		 WebDriver driver = new ChromeDriver();
		 
		 //To tell the webdriver to wait for 20 sec before throwing exception if element is not present.
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //To launch chrome browser and load the application url in the address bar
		 driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf ");
		 //To maximize the browser window
		 driver.manage().window().maximize();
		 
		//To enter username
		 driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("TestID123");
		//To click on the check availability link
		 driver.findElement(By.id("userRegistrationForm:checkavail")).click();
		//To get the text of userid availability status and print the text.
		 String text=driver.findElement(By.id("userRegistrationForm:useravail")).getText();
		 System.out.println(text);
		//To enter password
		 driver.findElement(By.id("userRegistrationForm:password")).sendKeys("P@ssword123"); 
		 //To enter confirm password
		 driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("P@ssword123"); 
		 
		 //To select the security question in the drop down
		 WebElement securityQDD = driver.findElement(By.id("userRegistrationForm:securityQ"));
		 Select selectDD= new Select(securityQDD);
		 selectDD.selectByVisibleText("What was the name of your first school?");
		 
		 //To enter security answer
		 driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("svec");
		 //To enter first name
		 driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("TestFName");
		 //To enter Last name
		 driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("TestLName");
		 //To click female radio button
		 driver.findElement(By.id("userRegistrationForm:gender:1")).click();
		 //To click unmarried radio button
		 driver.findElement(By.id("userRegistrationForm:maritalStatus:1")).click();
		 
		 //To select the birth date in the drop down
		 WebElement dateDD = driver.findElement(By.id("userRegistrationForm:dobDay"));
		 Select selectDate= new Select(dateDD);
		 selectDate.selectByIndex(4);
		 
		 //To select the birth month in the drop down
		 WebElement monthDD = driver.findElement(By.id("userRegistrationForm:dobMonth"));
		 Select selectMonth= new Select(monthDD);
		 selectMonth.selectByVisibleText("NOV");
		 
		 //To select the birth month in the drop down
		 WebElement yearDD = driver.findElement(By.id("userRegistrationForm:dateOfBirth"));
		 Select selectYear= new Select(yearDD);
		 selectYear.selectByValue("1989");
		 
		 //To select the occupation in the drop down
		 WebElement occupationDD = driver.findElement(By.id("userRegistrationForm:occupation"));
		 Select selectOccupation= new Select(occupationDD);
		 selectOccupation.selectByVisibleText("Private");
		 //To enter email
		 driver.findElement(By.id("userRegistrationForm:email")).sendKeys("TestMail@gmail.com");
		 //To enter mobile number
		 driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("9842288972"); 
		
		 //To select the nationality in the drop down
		 WebElement nationalityDD = driver.findElement(By.id("userRegistrationForm:nationalityId"));
		 Select selectNationality= new Select(nationalityDD);
		 selectNationality.selectByVisibleText("India");
		 //To enter address
		 driver.findElement(By.id("userRegistrationForm:address")).sendKeys("PlotNo 17");
		 
		 //To select the first matching country that starts with G
		 WebElement countryDD = driver.findElement(By.id("userRegistrationForm:countries"));
		 countryDD.click();
		 
		 List<WebElement> countryList = countryDD.findElements(By.tagName("option"));
		 System.out.println("Size of country list is "+countryList.size());
		 		 
		 for(WebElement option : countryList){
		        String optTxt = option.getText();
		           if(optTxt.startsWith("G")){
		        	   System.out.println("first matching country that starts with G is "+optTxt);
		               option.click();                            
		               break;
		           }   
		        }
		
		 
		 //To select the country India in the drop down
		 Select selectCounty= new Select(countryDD);
		 selectCounty.selectByVisibleText("India");
		 //To enter pin code
		 driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("517501");
		 //To click on state text field and wait for 5 sec
		 driver.findElement(By.id("userRegistrationForm:statesName")).click();
		 Thread.sleep(5000);
		 //To check the state text field is in disabled or enabled state
		 boolean stateStatus=driver.findElement(By.id("userRegistrationForm:statesName")).isEnabled();
		 System.out.println("State text field is in enable state? - "+stateStatus);
		 
		 //To select the city/Town in the drop down and wait for 5 sec
		 WebElement cityDD = driver.findElement(By.id("userRegistrationForm:cityName"));
		 Select selectCity= new Select(cityDD);
		 selectCity.selectByVisibleText("Chittoor");
		 Thread.sleep(5000); 
		 
		 //To select the post office in the drop down
		 WebElement postofficeDD = driver.findElement(By.id("userRegistrationForm:postofficeName"));
		 Select selectPostOffice= new Select(postofficeDD);
		 selectPostOffice.selectByVisibleText("Tirupati Bazar S.O");
		 
		 //Tp enter landline number
		 driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("31574");
		 //To enter Captcha
		 driver.findElement(By.id("captcha")).sendKeys("HQHDH");
		 
		 //driver.switchTo().frame("aa").
		 

	}

}
