package seleniumLearning;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	
	//ChromeDriver : get(url) , gettitle , getcurrentUrl , findElement , findElements , getWindowHandle
	
	// WebElement :  click , clear , sendKeys , getText ,findElement , findElements , getTagName , getAttribute , isDisplayed , isEnabled , 
	
	// By :  id , name , className , tagName , linkText  ,  partialLinkText , Xpath
	
	
	
	//Execution Flow : Instance variables  -> Constructor  -> Called Function
	
	@Test  // The method tagged with Before annotation will be executed before each test case 
	public void loginToGmailApplication()
	{
		System.out.println("Inside : Login To Application");
		launchGmailApplication();
		//enter user name
		driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");		
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // = 0 , 1 ,2 
			String txt = element.getText(); // txt=Next  , Create account .......
			if(txt.equals("Next"))
			{
				element.click(); // click on i th element
				break;
			}
		}
		
	}
	@Test
	public void createAnAccount()
	{
		System.out.println("Test Case : Create An Account");
		launchGmailApplication();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // = 0 , 1 ,2 
			String txt = element.getText(); // txt=Next  , Create account .......
			if(txt.equals("Create account"))
			{
				element.click(); // click on i th element
				break;
			}
		}
		
	}
	
	// Absolute / Full / Static - xpath
		//	/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[3]/button
		
		//Relative xpath
			
			//tagName[@attribute = 'value' ]
			//tagName[text() = 'value' ]
	
	@Test
	public void forgotEmail()
	{
		System.out.println("Test Case : Forgot Email");
		launchGmailApplication();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		//List<WebElement> elements = driver.findElements(By.tagName("button"));
		/*
		 * for(int i=0;i<elements.size();i++) { WebElement element = elements.get(i); //
		 * = 0 , 1 ,2 String txt = element.getText(); // txt=Next , Create account
		 * ....... if(txt.equals("Forgot email?")) { element.click(); // click on i th
		 * element break; } }
		 */
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[3]/button")).click();
	    //driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
	    driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();

	}
	
	@Test
	public void learnAboutGuestMode()
	{
		System.out.println("Test Case : Learn more about using Guest mode");
		launchGmailApplication();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		//List<WebElement> elements = driver.findElements(By.tagName("a"));
		/*
		 * for(int i=0;i<elements.size();i++) { WebElement element = elements.get(i); //
		 * = 0 , 1 ,2 String txt = element.getText(); // txt=Next , Create account
		 * ....... if(txt.equals("Learn more about using Guest mode")) {
		 * element.click(); // click on i th element break; } }
		 */
		//driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		
		driver.findElement(By.partialLinkText("Learn more about using")).click();

	}
	
	@Test
	public void helpMenu()
	{
		System.out.println("Test Case : Footer Link Vlidation - Help");
		launchGmailApplication();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // = 0 , 1 ,2 
			String txt = element.getText(); // txt=Next  , Create account .......
			if(txt.equals("Help"))
			{
				element.click(); // click on i th element
				break;
			}
		}

	}
	@Test
	public void privacyMenu()
	{
		System.out.println("Test Case : Footer Link Vlidation - Privacy");
		launchGmailApplication();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // = 0 , 1 ,2 
			String txt = element.getText(); // txt=Next  , Create account .......
			if(txt.equals("Privacy"))
			{
				element.click(); // click on i th element
				break;
			}
		}

	}
	@Test
	public void termsAndConditions()
	{
		System.out.println("Test Case : Footer Link Vlidation - Terms");
		launchGmailApplication();
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i); // = 0 , 1 ,2 
			String txt = element.getText(); // txt=Next  , Create account .......
			if(txt.equals("Terms"))
			{
				element.click(); // click on i th element
				break;
			}
		}

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























