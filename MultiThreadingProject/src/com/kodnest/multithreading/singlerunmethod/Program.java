package com.kodnest.multithreading.singlerunmethod;

public class Program implements Runnable
{
	@Override
	public void run()
	{
		//Getting the name of the currently executing thread and checking if it is equal to
		//"Number"
		//if the thread name is Number,calling numPrinting()
		if(Thread.currentThread().getName().equals("Number"))
		{
			numPrinting();
		}
		else
		{
			charPrinting();
		}
	}
	public void numPrinting()
	{
		try
		{
			System.out.println("Number printing started");
			for(int i=1;i<=5;i++)
			{
				System.out.println("Number printing "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Number printing ended");
	}
	public void charPrinting()
	{
		try
		{
			System.out.println("Character printing started");
			for(int i='a';i<='e';i++)
			{
				System.out.println("Character printing "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Character printing ended");
	}
}
