package day2;
	
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class irctclogin {

		public static void main(String[] args) throws InterruptedException {
			//Setup Chrome Driver
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			
			//Username and Password
			driver.findElementById("userRegistrationForm:userName").sendKeys("vasanthilingappan");
			driver.findElementById("userRegistrationForm:password").sendKeys("letgot01");
			driver.findElementById("userRegistrationForm:confpasword").sendKeys("letgot01");
			
			//Security Question and Preferred Language
			WebElement sQues = driver.findElementById("userRegistrationForm:securityQ");
		    Select sel =  new Select(sQues);
		    List<WebElement> list=sel.getOptions();
		    sel.selectByIndex(list.size()-2);
		    driver.findElementByName("userRegistrationForm:securityAnswer").sendKeys("Spark");
		    
		    WebElement pLang = driver.findElementById("userRegistrationForm:prelan");
		    Select pLang_s =  new Select(pLang);
		    pLang_s.selectByVisibleText("English");
		    
		    
		    //Personal Details
		    driver.findElementByName("userRegistrationForm:firstName").sendKeys("Vasanthi");
		    driver.findElementByName("userRegistrationForm:middleName").sendKeys("Karthik");
		    driver.findElementByName("userRegistrationForm:lastName").sendKeys("Lingappan");
		    driver.findElementById("userRegistrationForm:gender:1").click();
		    driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		    
		    
		    WebElement dDay = driver.findElementById("userRegistrationForm:dobDay");
		    Select dDay_s =  new Select(dDay);
		    dDay_s.selectByVisibleText("06");
		    driver.findElementById("userRegistrationForm:dobMonth").sendKeys("APR");
		    driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1984");
		    
		    Select occup = new Select(driver.findElementById("userRegistrationForm:occupation"));
		    occup.selectByVisibleText("Private");
		    
		    driver.findElementById("userRegistrationForm:uidno").sendKeys("0000");
		    driver.findElementById("userRegistrationForm:idno").sendKeys("ABCD");
		    driver.findElementById("userRegistrationForm:email").sendKeys("ABCD@GMAIL.COM");
		    driver.findElementById("userRegistrationForm:mobile").sendKeys("9600116715");
		    Select nation = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		    nation.selectByIndex(1);
		    
		    //Address
		    driver.findElementById("userRegistrationForm:address").sendKeys("123 A Block");
		    driver.findElementById("userRegistrationForm:street").sendKeys("Greata Pearl Apartments");
		    driver.findElementById("userRegistrationForm:area").sendKeys("Choolaimedu high road");
		    Select country = new Select(driver.findElementById("userRegistrationForm:countries"));
		    country.selectByVisibleText("India");
		    driver.findElementByName("userRegistrationForm:pincode").sendKeys("600094",Keys.TAB);
		    
		    //Added sleep to wait until pull the state and city details
		    Thread.sleep(5000);
		    
		    Select city = new Select(driver.findElementById("userRegistrationForm:cityName"));
		    city.selectByIndex(1);
		    
		    Thread.sleep(3000);
		    Select po = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		    po.selectByIndex(1);
		    
		    driver.findElementById("userRegistrationForm:landline").sendKeys("04424819948");
		    
				    
		}

	}



