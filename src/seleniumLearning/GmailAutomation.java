package seleniumLearning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	//Google chrome browser
	public static String collegeName = "JNTU";
	int stdNum ; // default value zero
	String stdName ; // null
	ChromeDriver driver ; // null  // Chrome driver constructor will open an empty google chrome browser
	
	public GmailAutomation() // ByDeault a Constructor of that class will be executed
	{
		System.out.println("Inside Constructor : Clear the DataBase - Delete All Temp Records");
		stdNum = 44;
		stdName = "Ram";
		driver = new ChromeDriver(); //1234
	}
	// get(url);
	//validation : expected == actual 
	String expected = "Gmail";
	@Test
	public void launchGmailApplication()
	{		
		System.out.println("Inside : Launch Gmail Application");
		driver.get("https://gmail.com");
		String actual = driver.getTitle();
		System.out.println("Actual title :"+ actual);
		Assert.assertEquals(expected, actual);
		if(expected.equals(actual))
		{
			System.out.println("Title Validation Passed");
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		
		String sessionID = driver.getWindowHandle();
		System.out.println("Current session ID :" + sessionID);
		
		String curl = driver.getCurrentUrl();
		System.out.println("Current URL :" + curl);
		
		System.out.println("End of the Test Case");
	}
	
	//Execution Flow : Instance variables  -> Constructor  -> Called Function
	
	@Test  // The method tagged with Before annotation will be executed before each test case 
	public void loginToGmailApplication()
	{
		System.out.println("Inside : Login To Application");
		launchGmailApplication();
		//enter user name
		driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
	}
	@Test
	public void createAnAccount()
	{
		System.out.println("Test Case : Create An Account");
		launchGmailApplication();
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		
	}
	//Execution Flow : Instance variables  -> Constructor  -> Called Function
	@Test
	public void composeEmail()
	{
		System.out.println("Inside : Test Case : Compose Email");
		//login
		//loginToGmailApplication();
		
		
	}
	
	@Test
	public void replyToEmail()
	{
		//login
		//loginToGmailApplication();
	}
	
	@Test
	public void forwardEmail()
	{
		//login
		//loginToGmailApplication();
	}
	
	@Test
	public void deleteEmail()
	{
		//login
		//loginToGmailApplication();
	}
	
	//if we have 40 test cases all of them need login function 

}

//Junit
class Assert1
{
	public static void assertEqual(String a, String b)
	{
		//.................
	}
}

//chromedriver

class ChromeDriver1
{
	public void get(String url)
	{
		//...........
	}
	
	public String getTitle()
	{
		return "dfffds";
	}
}























