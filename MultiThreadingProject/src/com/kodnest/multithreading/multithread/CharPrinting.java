package com.kodnest.multithreading.multithread;

public class CharPrinting extends Thread
{
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
