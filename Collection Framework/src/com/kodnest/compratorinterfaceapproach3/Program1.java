package com.kodnest.compratorinterfaceapproach3;

import java.util.*;
import java.util.Comparator;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student(11,"Ajay",76.5f);
		Student st2=new Student(13,"Suraj",98.7f);
		Student st3=new Student(12,"Roshan",58.2f);
		ArrayList al=new ArrayList();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		System.out.println("Before sorting");
		System.out.println(al);
		Collections.sort(al,new Comparator<Student>()
		{
			@Override
			public int compare(Student o1,Student o2)
			{
				if(o1.rollNo > o2.rollNo)
				{
					return 1;
				}
				else if(o1.rollNo < o2.rollNo)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		});
		System.out.println("After sorting");
		System.out.println(al);

	}

}
