package com.kodnest.multithreading.ex2;

public class Compilation extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
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
