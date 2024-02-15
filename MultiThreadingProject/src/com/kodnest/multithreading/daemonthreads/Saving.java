package com.kodnest.multithreading.daemonthreads;

public class Saving extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for( ; ; )//infinite loop
			{
				System.out.println("Saving the code");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
