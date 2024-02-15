package com.kodnest.multithreading.byrannableinterface;

public class CharPrinting implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Character printing started");
		try
		{
			for(char i='a';i<='e';i++)
			{
				System.out.println("Character "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Character printing ended");
	}
}
