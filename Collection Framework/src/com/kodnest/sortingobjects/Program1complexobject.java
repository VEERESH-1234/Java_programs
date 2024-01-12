package com.kodnest.sortingobjects;

import java.util.ArrayList;

public class Program1complexobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student(11,"ajya",76.5f);
		Student st2=new Student(12,"Roshan",58.2f);
		Student st3=new Student(13,"Suraj",98.7f);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		System.out.println(al);
	}

}
