package com.kodnest.comparableinterface1;

public class Student implements Comparable<Student>
{
	int rollNo;
	String name;
	float percentage;
	@Override
	public int compareTo(Student o) {
		if(this.rollNo > o.rollNo)
		{
			return 1;
		}
		else if(this.rollNo < o.rollNo)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
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

