package com.kodnest.multithreading.byrannableinterface;

public class NumPrinting implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Number is started");
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Number "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Number is ended");
	}
}
