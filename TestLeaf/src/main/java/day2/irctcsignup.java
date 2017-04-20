package day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctcsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassName object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
				
		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//maximize
		driver.manage().window().maximize();	
				
		WebElement  dropDown=driver.findElementById("userRegistrationForm:securityQ");
		Select dDown=new Select(dropDown);
		//dDown.selectByVisibleText("What is your pet name?");
		//dDown.selectByIndex(6);
		//dDown.selectByValue("6");
		List<WebElement> mylist=dDown.getOptions();
        int s=mylist.size();
        for(int i=1;i<s-1;i++)
        {
        	if(i!=4)
        	System.out.println(mylist.get(i).getText());
        }
	}

}


	
