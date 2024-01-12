package com.kodnest.sortingobjects;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		//sorting using treeset class
		TreeSet ts=new TreeSet();
		ts.add(40);
		ts.add(50);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		System.out.println("Treeset values ");
		System.out.println(ts);//[10, 20, 30, 40, 50]
		
		//sorting using Collections.sort()
		ArrayList al=new ArrayList();
		al.add(40);
		al.add(50);
		al.add(30);
		al.add(10);
		al.add(20);
		System.out.println("Before sorting ArrayList values");
		System.out.println(al);//[40, 50, 30, 10, 20]
		Collections.sort(al);
		System.out.println("After sorting ArrayList values");
		System.out.println(al);//[10, 20, 30, 40, 50]
		
				
		

	}

}
