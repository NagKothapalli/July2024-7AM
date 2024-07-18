package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	
	@Test
	public void chanting()
	{
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
		System.out.println("JAI SRI RAM");
	}
	
	// for( iterator , condition , increment/step size) {    Task   } 
	@Test
	public void chanting_for()
	{
		for(int chant=1;chant<1000;chant++)
		{
			System.out.println("JAI SRI RAM");
		}
	}
	
	//Take a stair case 100 steps
	
	
	@Test
	public void takeStairCase()
	{
		for(int s=1;s<=100;s=s+1)    // 1<100  , ...... 90 < 100 , 98<100 , 99<100 , 100<100->F
		{   // true
			System.out.println("Take Step :"+ s);
		}
	}
	@Test
	public void applyColorToSteps()
	{
		for(int s=1;s<=100;s=s+1)
		{
			System.out.println("Apply Green color to Step :" + s);
		}
	}
	
	@Test
	public void applyGreenColorToEvenSteps()
	{
		for(int s=2;s<=100;s=s+2)
		{
			System.out.println("Apply Green color to Step :" + s);
		}
	}
	
	@Test
	public void applyRedColorToOddSteps()
	{
		for(int s=1;s<=100;s=s+2)
		{
			System.out.println("Apply Red color to Step :" + s);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
