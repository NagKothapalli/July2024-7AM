package heirachialInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents
{
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
