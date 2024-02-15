package com.kodnest.multithreading.program1;

public class Program extends Thread
{
	public void run()
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
	}
}
