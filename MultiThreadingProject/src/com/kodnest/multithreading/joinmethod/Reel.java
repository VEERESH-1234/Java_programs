package com.kodnest.multithreading.joinmethod;

public class Reel extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Creating the reel");
			Thread.sleep(2000);
			System.out.println("Posting the reel");
			Thread.sleep(2000);
			System.out.println("Reel uploading completed");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
