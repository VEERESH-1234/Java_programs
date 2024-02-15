package com.kodnest.multithreading.synchronizedkeyword;

public class Treatment implements Runnable
{
	synchronized public void run()
	{
		String name=Thread.currentThread().getName();
		try
		{
			System.out.println("Treatment is started in ICU for "+name);
			Thread.sleep(3000);
			System.out.println("Treatment is going on in ICU for "+name);
			Thread.sleep(3000);
			System.out.println("Treatment is completed in ICU for "+name);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
