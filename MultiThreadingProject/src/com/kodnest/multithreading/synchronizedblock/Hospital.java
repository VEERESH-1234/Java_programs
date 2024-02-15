package com.kodnest.multithreading.synchronizedblock;

public class Hospital 
{
	String res1="Doctor";
	String res2="Bed";
	public void tomTreatment()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println("Tom is using "+res1);
				Thread.sleep(3000);
				synchronized(res2)
				{
					System.out.println("Tom is using "+res2);
					Thread.sleep(3000);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void jerryTreatment()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println("Jerry is using "+res1);
				Thread.sleep(3000);
				synchronized(res2)
				{
					System.out.println("Jerry is using "+res2);
					Thread.sleep(3000);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
