package com.kodnest.compratorinterfaceapproach3;

public class Student 
{
	int rollNo;
	String name;
	float percentage;
	public Student(int rollNo, String name, float percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}
}
