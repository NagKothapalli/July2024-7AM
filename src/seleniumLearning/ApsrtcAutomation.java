package seleniumLearning;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	ChromeDriver driver; //null
	String name; // null
	
	public ApsrtcAutomation() throws InterruptedException
	{
		driver = new ChromeDriver(); // 12345
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
		//Thread.sleep(2000);
		name = "Ram";
	}
	
	//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.chrome.ChromeDriver.get(String)" because "this.driver" is null
	
	//Checked Exception or Compile time exception : InterruptedException , FileNotFoundExcption
	
	// UnChecked Exception or RunTime Exception : NullPointerException , divide by zero , UnhandledAlertException
	
	//org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please select start place.}
	

	@Before
	public void launchApsrtcAppliction()
	{
		System.out.println("RC : Launch Apsrtc Application");		
		driver.get("https://www.apsrtconline.in/");
	}
	
	//input[@size='22' and @name='source']
	
	//select empSal from Employee  where EmpID=22
	@Test
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");    //  //input[@size='22' and @name='source'] 
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");    //  //input[@size='22' and @name='source'] 
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		
		//select date of journey
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='16']")).click();
		
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void allMethodsInWebElement()
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']")); 
		boolean isd = fromCity.isDisplayed();
		boolean ise = fromCity.isEnabled();
		if(ise)
		{
			fromCity.click();
			fromCity.sendKeys("vdgfdjgfdngjfkdnj;f");
			fromCity.clear();
			fromCity.click();
			fromCity.sendKeys("HYDERABAD");		
			String txt = fromCity.getText();      System.out.println("Text on my object :"+ txt);
			String nameAttr = fromCity.getAttribute("name");     System.out.println("Name attr of my object :"+ nameAttr);
			String tag = fromCity.getTagName();     System.out.println("TagName of my object :"+ tag);
		}
		else
		{
			System.out.println("Object is not Enabled");
		}
		
		
	}
	
	@Test
	public void keyboardAndMouseOperations()
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']")); 
		Actions actions = new Actions(driver);
		actions.moveToElement(fromCity).build().perform();   // mouse hover
		
		actions.moveToElement(fromCity).click().build().perform(); // scroll down / up  to the object and perform the operation
		
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).doubleClick().contextClick().build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
