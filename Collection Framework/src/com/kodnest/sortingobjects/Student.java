package com.kodnest.sortingobjects;

public class Student 
{
	int rollNo;
	String name;
	float percentage;
	public Student(int rollNo, String name, float percentage) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public float getPercentage() {
		return percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
}
