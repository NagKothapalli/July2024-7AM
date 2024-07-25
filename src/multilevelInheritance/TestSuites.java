package multilevelInheritance;

import org.junit.Test;

//                  A  extends  B  extends   C   -> A inherits C
//              child             parent
public class TestSuites extends TestCases //,ReusableComponents
{
	
	/*
	 * protected void launchApplication() // within the call { //write the required
	 * code to do a launch 15 or 20 lines of code //open browser , check internet ,
	 * maximize , call gmail url , see page loaded , check the title of the page
	 * System.out.println("Launch Application  from TS"); }
	 */

    //**********************************Test Suites*************************************
	//Smoke Testing  , Regression Testing
	@Test
	public void smokeSuite()  //BVT : Build Validation Test
	{
		System.out.println("Test Suite : SMOKE");
		//composeAnEmail();
		//replyToEmail();
		launchApplication();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
	}

}
