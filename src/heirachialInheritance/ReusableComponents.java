package heirachialInheritance;

public class ReusableComponents
{
	protected void launchApplication()   
	{
		//write the required code to do a launch 15 or 20 lines of code
		//open browser , check internet , maximize , call gmail url , see page loaded , check the title of the page
		System.out.println("Launch Application");		
	}
	
	void loginApplication()
	{
		System.out.println("Login To Application");
	}
	
	protected void logoutFromApplication()
	{
		System.out.println("Logout From Application");
	}
	
	public void closeApplication()
	{
		System.out.println("Close Application");
	}
	
	public void compose()
	{
		System.out.println("Compose Email");
	}
	
	public void send()
	{
		System.out.println("Send Email");
	}
	
	public void open()
	{
		System.out.println("Open An Email");
	}
	
	public void reply()
	{
		System.out.println("Reply to the Email");
	}
	
	
	public void forward()
	{
		System.out.println("Forward An Email");
	}
	public void delete()
	{
		System.out.println("Delete An Email");
	}
	

}
