package com.kodnest.encapsulation.employee;

public class Employee {
	//providing security to datamembers of the class by using private
	private int id;
	private String name;
	private int salary;
	//public setter method for controlled access
	public void setData(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	//public getter method for controlled access
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}

}
