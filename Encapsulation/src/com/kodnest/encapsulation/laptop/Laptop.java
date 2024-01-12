package com.kodnest.encapsulation.laptop;

public class Laptop {
	private String processorName;
	private int memorySize;
	
	public Laptop(String processorName,int memorySize)
	{
		this.processorName=processorName;
		this.memorySize=memorySize;
	}
	
	public String getProcessorName()
	{
		return processorName;
	}
	
	public int getMemorySize()
	{
		return memorySize;
	}

}
