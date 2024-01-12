package com.kodnest.encapsulation.student;

public class Student {
	//providing security to datamembers of the class by using private
		private int rollNo;
		private String name;
		private int age;
		private float percentage;
		//public setter method for controlled access
		public void setData(int rollNo,String name,int age,float percentage)
		{
			this.rollNo=rollNo;
			this.name=name;
			this.age=age;
			this.percentage=percentage;
		}
		//public getter method for controlled access
		public void getData()
		{
			System.out.println("Student rollNo is: "+rollNo);
			System.out.println("Student name is: "+name);
			System.out.println("Student age is: "+age);
			System.out.println("Student percentage is: "+percentage);
		}

}
