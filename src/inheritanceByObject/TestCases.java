package inheritanceByObject;

import org.junit.Test;
//             child                parent    -> SIMPLE INHERITANCE
public class TestCases //extends ReusableComponents
{	
	//Modifier  DataType    name  = value ;
	
	  public     int     number = 22;
	
	//Modifier  ClassName   objName = new Constructor();
	
	public ReusableComponents   rc = new ReusableComponents();
	
	@Test   // Java Method must be public , non static , no return type , no arguments
	public void composeAnEmail()   // Test Case : Test Steps : 1 - 1.1 1.2  2 
	{
		//ReusableComponents.welcomeMessage();
		//body
		System.out.println("TestCase : ComposeAnEmail");
		rc.launchApplication();
		rc.loginApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
		
		//launch-15 , login-15 , compose , send , logout , close
	}
	@Test
	public void replyToEmail()  // Test Case   // Ram
	{
		//body
		System.out.println("TestCase : ReplyToEmail");
		//launch , login , open , reply , logout , close
		rc.launchApplication();
		rc.loginApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();

	}
	@Test
	public void forwardAnEmail() // Test Case    Raj
	{
		//body
		System.out.println("TestCase : ForwardAnEmail");
		//launch , login , open , forward , logout , close
		rc.launchApplication();
		rc.loginApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteEmail() // Test Case    Tej
	{
		//body
		System.out.println("TestCase : DeleteEmail");
		//launch , login , open , delete , logout , close
		rc.launchApplication();
		rc.loginApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
