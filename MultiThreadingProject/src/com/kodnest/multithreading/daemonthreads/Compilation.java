package com.kodnest.multithreading.daemonthreads;

public class Compilation extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for( ; ; )//infinite loop
			{
				System.out.println("Compiling the code");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}