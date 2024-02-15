package com.kodnest.multithreading.joinmethod;

public class Chatting extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Chatting started");
			Thread.sleep(2000);
			System.out.println("Chatting happening");
			Thread.sleep(2000);
			System.out.println("Chatting ended");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
