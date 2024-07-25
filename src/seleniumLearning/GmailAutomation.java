package seleniumLearning;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	//Google chrome browser
	
	ChromeDriver driver = new ChromeDriver(); //1234 // Chrome driver constructor will open an empty google chrome browser
	// get(url);
	//validation : expected == actual 
	String expected = "Gmail";
	@Test
	public void launchGmailApplication()
	{
		System.out.println("Launch Gmail Application");
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
	@Test
	public void loginToGmailApplication()
	{
		launchGmailApplication();
		//enter user name
		driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
	}
	
	

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























