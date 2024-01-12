package com.kodnest.encapsulation.studentbyconstruct;

public class Student {
	//private data members
	private int rollNo;
	private String name;
	private int age;
	private float percentage;
	//Constructor to set values to private data members
	public Student(int rollNo,String name,int age,float percentage)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	//public getter method for getting the values of private data members
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public float getPercentage()
	{
		return percentage;
	}

}
