package com.kodnest.comparatorinterfaceapproach1;

import java.util.*;

public class Program {

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
		SortingHelper sh=new SortingHelper();
		Collections.sort(al,sh);
		System.out.println("After sorting");
		System.out.println(al);

	}

}
