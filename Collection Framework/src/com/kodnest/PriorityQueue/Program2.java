package com.kodnest.PriorityQueue;

import java.util.PriorityQueue;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add(50);
		pq.add("Orange");
		pq.add(40);
		pq.add("Apple");
		pq.add(10);
		pq.add("Kiwi");
		System.out.println(pq);//ClassCastException
		
		/*PriorityQueue<Integer> pq2=new PriorityQueue<Integer>();
		pq2.add(50);
		pq2.add("Orange");//Error,only integers can be stored
		pq2.add(40);
		pq2.add("Apple");//Error,only integers can be stored
		pq2.add(10);
		pq2.add("Kiwi");//Error,only integers can be stored
		System.out.println(pq2);
		
		
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add(50);//Error,only String values can be stored
		pq1.add("Orange");
		pq1.add(40);//Error,only String values can be stored
		pq1.add("Apple");
		pq1.add(10);//Error,only String values can be stored
		pq1.add("Kiwi");
		System.out.println(pq1);*/

	}

}
