package com.kodnest.TreeSet;

import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(40);
		ts.add(30);
		ts.add(50);
		ts.add(10);
		ts.add(20);
		System.out.println(ts);//[10, 20, 30, 40, 50]
		
		
		TreeSet ts1=new TreeSet();
		ts1.add("Mango");
		ts1.add("Orange");
		ts1.add("Apple");
		ts1.add("Kiwi");
		ts1.add("Banana");
		System.out.println(ts1);//[Apple, Banana, Kiwi, Mango, Orange]
		
		
		TreeSet ts2=new TreeSet();
		ts2.add(40);
		ts2.add(30);
		ts2.add(30);
		ts2.add(20);
		ts2.add(30);
		ts.add(20);
		System.out.println(ts2);//[20, 30, 40]
	}

}
