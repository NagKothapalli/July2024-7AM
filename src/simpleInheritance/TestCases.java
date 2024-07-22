package simpleInheritance;

import org.junit.Test;
//             child                parent    -> SIMPLE INHERITANCE
public class TestCases extends ReusableComponents
{
	@Test   // Java Method must be public , non static , no return type , no arguments
	public void composeAnEmail()   // Test Case : Test Steps : 1 - 1.1 1.2  2 
	{
		//ReusableComponents.welcomeMessage();
		//body
		System.out.println("TestCase : ComposeAnEmail");
		launchApplication();
		loginApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();	
		//launch-15 , login-15 , compose , send , logout , close
	}
	@Test
	public void replyToEmail()  // Test Case   // Ram
	{
		//body
		System.out.println("TestCase : ReplyToEmail");
		//launch , login , open , reply , logout , close
		launchApplication();
		loginApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();	

	}
	@Test
	public void forwardAnEmail() // Test Case    Raj
	{
		//body
		System.out.println("TestCase : ForwardAnEmail");
		//launch , login , open , forward , logout , close
		launchApplication();
		loginApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteEmail() // Test Case    Tej
	{
		//body
		System.out.println("TestCase : DeleteEmail");
		//launch , login , open , delete , logout , close
		launchApplication();
		loginApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
