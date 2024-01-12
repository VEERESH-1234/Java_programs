package com.kodnest.TreeSet;

import java.util.*;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("Apple");
		ts.add(40);
		ts.add("Mango");
		ts.add(20);
		ts.add("Kiwi");
		ts.add(30);
		System.out.println(ts);//ClassCastException

		
		/*TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add("Apple");//Error,because only integers can be stored
		ts1.add(40);
		ts1.add("Mango");//Error,because only integers can be stored
		ts1.add(20);
		ts1.add("Kiwi");//Error,because only integers can be stored
		System.out.println(ts1);
		
		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add("Apple");
		ts2.add(40);//Error,because only String values can be stored
		ts2.add("Mango");
		ts2.add(20);//Error,because only String values can be stored
		ts2.add("Kiwi");
		System.out.println(ts2);*/
	}

}
