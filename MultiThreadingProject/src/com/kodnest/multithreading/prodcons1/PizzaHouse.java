package com.kodnest.multithreading.prodcons1;

public class PizzaHouse 
{
	int token;
	boolean status=false;
	synchronized public void bake(int num)
	{
		try
		{
			if(status==false)
			{
				token=num;
				System.out.println("Baked pizza for token- "+token);
				status=true;
				notify();
			}
			else
			{
				wait();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	synchronized public void eat()
	{
		try
		{
			if(status==true)
			{
				System.out.println("Eating pizza for token- "+token);
				status=false;
				notify();
			}
			else
			{
				wait();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
