package com.kodnest.inheritance.constructor1;

public class JavaTeacher extends Teacher
{
	String subject="Java";
	void doProject()
	{
		System.out.println("JavaTeacher is doing "+subject+" project");
	}
	public JavaTeacher(String subject)
	{
		this.subject=subject;
	}
	public JavaTeacher()
	{
		
	}
}
