package IDE;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstProgram {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium_softwares\\chromedriver.exe" );  
    driver = new ChromeDriver();
    
    baseUrl = "http://testleaf.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMyFirstRecording() throws Exception {
    driver.get(baseUrl + "/home.html");
	  
    driver.findElement(By.cssSelector("img.wp-categories-icon.svg-image")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("gouthami423@gmail.com");
    driver.findElement(By.xpath("//input[@value='Append ']")).clear();
    driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Append sucessfull");
    assertEquals("Append sucessfull", driver.findElement(By.xpath("//input[@value='Append ']")).getAttribute("value"));
    String MyText = driver.findElement(By.name("username")).getAttribute("value");
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("");
    try {
      assertEquals("gouthami423@gmail.com", driver.findElement(By.id("email")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    System.out.println(MyText);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
	
	//boolean

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
