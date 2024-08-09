package seleniumLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation
{
	ChromeDriver driver; //null
	String name; // null
	ReadProperties properties; //null
	DriverUtilities driverUtilities; //null
	public ApsrtcAutomation() throws InterruptedException
	{
		driver = new ChromeDriver(); // 12345
		driver.manage().window().maximize();
		properties = new ReadProperties();
		driverUtilities = new DriverUtilities(driver); //12345
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
	public void launchApsrtcAppliction() throws IOException
	{
		System.out.println("RC : Launch Apsrtc Application");		
		//driver.get("https://www.apsrtconline.in/"); //Hard coded value
		//properties.readInput("URL");
		String myurl = properties.readInput("URL");
		driver.get(myurl); //parameterization , passing the data dynamically by reading it from a data source
	}
	
	//input[@size='22' and @name='source']
	
	//select empSal from Employee  where EmpID=22
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		//Thread.sleep(30000);  //fixed wait / static wait / blind wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='source']"))).click();
		//WebElement sourceObj = driver.findElement(By.xpath("//input[@name='source']"));
		//wait.until(ExpectedConditions.elementToBeClickable(sourceObj)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='source']"))).sendKeys("HYDERABAD");
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");    //  //input[@size='22' and @name='source'] 
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		
		driver.switchTo().alert().accept();
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");    //  //input[@size='22' and @name='source'] 
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(30000);
		//select date of journey
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='16']")).click();
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	
	
	//Functional testing / Functionality testing
	@Test
	public void bookBusTicket_new() throws InterruptedException, IOException
	{
		System.out.println("Test Case : Book Bus Ticket"); 
		driverUtilities.giveWebElement("//input[@name='source']").sendKeys(properties.readInput("FromCity"));
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driverUtilities.giveWebElement("//input[@name='searchBtn']").click();
		driver.switchTo().alert().accept(); 
		driverUtilities.giveWebElement("//input[@name='destination']").sendKeys(properties.readInput("ToCity"));
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driverUtilities.giveWebElement("//input[@name='txtJourneyDate']").click();
		driverUtilities.giveWebElement("//a[text()='16']").click();
		driverUtilities.giveWebElement("//input[@name='searchBtn']").click();
	}
	
	//Performance Testing
	//Data Driven Testing : Executing the same test case with multiple sets of test data to check the stability of the application
	@Test
	public void bookBusTicket_dataDriven() throws InterruptedException, IOException
	{
		String fcities = properties.readInput("FromCities");
		String[] fcs = fcities.split(",");  // fcs contains 8 values
		
		String tcities = properties.readInput("ToCities");
		String[] tcs = tcities.split(",");
		
		String jdates = properties.readInput("JDates");
		String[] jds = jdates.split(",");   // jds[i]
		
		int count = fcs.length;
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Iteration Count :" + (i+1));
			System.out.println("Test Case : Book Bus Ticket"); 
			driverUtilities.giveWebElement("//input[@name='source']").sendKeys(fcs[i]); // i= 0 first from city name will be passed here
			Actions actions = new Actions(driver);
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
			driverUtilities.giveWebElement("//input[@name='searchBtn']").click();
			driver.switchTo().alert().accept(); 
			driverUtilities.giveWebElement("//input[@name='destination']").sendKeys(tcs[i]);  // i=0 fiest to city name will be passed here 
			actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
			driverUtilities.giveWebElement("//input[@name='txtJourneyDate']").click();
			driverUtilities.giveWebElement("//a[text()='"+jds[i]+"']").click();   // a[text()='18']  - Dynamic xpath
			driverUtilities.giveWebElement("//input[@name='searchBtn']").click();  // "Hare" + god + "Hare" + god = Hare Rama Hare Rama
			Thread.sleep(2000);
			driverUtilities.giveWebElement("//a[@title='Home']").click();
		}
		
	}
	
	
	//object repository - have all the xpaths separately
	
	public String srcCity = "//input[@name='source']";
	public String dstCity = "//input[@name='destination']";
	public String searchBtn = "//input[@name='searchBtn']";
	public String openCalenderBtn = "//input[@name='txtJourneyDate']";
	public String jDate = "//a[text()='16']";
	
	@Test
	public void bookBusTicket_new2() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket"); 
		driverUtilities.giveWebElement(srcCity).sendKeys("HYDERABAD"); //Hyderabad is hard coded value
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driverUtilities.giveWebElement(searchBtn).click();
		driver.switchTo().alert().accept(); 
		driverUtilities.giveWebElement(dstCity).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driverUtilities.giveWebElement(openCalenderBtn).click();
		driverUtilities.giveWebElement(jDate).click();
		driverUtilities.giveWebElement(searchBtn).click();
	}
	
	//Test Data should not be hard coded , we have to read it from a data source
	
	//Test Data : Few examples : URL - dev , qa , stage , prod server
	   // userName , passWord , FromCity , ToCity , PassengerName , Mobile , Address , Age 
	@Test
	public void readTestData() throws IOException
	{
		FileInputStream file = new FileInputStream("TestData\\DevData.properties"); // like a news paper
		Properties prop = new Properties(); //  news reader , 
		prop.load(file);  // give the news paper to the reader
		String a = prop.getProperty("URL");
		String b = prop.getProperty("FromCity");
		String c = prop.getProperty("ToCity");
		System.out.println(a  +   b    +  c );
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
	
	@Test
	public void handleMultipleWindows() throws InterruptedException
	{
		driverUtilities.giveWebElement("//a[@title='TimeTable / Track']").click();
		driverUtilities.giveWebElement(driver,"//a[text()='All services Time Table & Tracking']").click();
		Set<String> windows = driver.getWindowHandles(); // windows : contains session ids of all the windows opened in the current execution
		//ArrayList<String> mylist = new ArrayList<String>(); // mylist : an empty list object
		//As we can not get the values directly from a SET , we have to convert SET to LIST .
		ArrayList<String> mylist = new ArrayList<String>(windows); // pass the SET object as an input to the constructor of LIST class
		int count = mylist.size();
		for(int i=0;i<count;i++)
		{
			System.out.println(mylist.get(i));  // i =0 1 .....
		}
		
		System.out.println("Title of window before :"+ driver.getTitle());
		
		driver.switchTo().window(mylist.get(1));
		
		Thread.sleep(4000);
		
		System.out.println("Title of window after switching :"+ driver.getTitle());
		
		//we can close the second window
		
		driver.close(); // this function will close the current active window
		
		//driver.quit(); // this function will kill the driver object , all windows opened in the current execution will be closed
		
		//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		Thread.sleep(4000);
		
		driver.switchTo().window(mylist.get(0));
		
		Thread.sleep(4000);
		
		driverUtilities.giveWebElement(driver,"//a[@title='Home']").click();
		
		driver.quit();
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
