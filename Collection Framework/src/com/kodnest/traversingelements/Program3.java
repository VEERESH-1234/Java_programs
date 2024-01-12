package com.kodnest.traversingelements;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);//[10, 20, 30]
		
		List list2=new LinkedList();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		System.out.println(list2);//[11, 22, 33]
		
		Queue queue1=new ArrayDeque();
		queue1.add(40);
		queue1.add(50);
		queue1.add(60);
		System.out.println(queue1);//[40, 50, 60]
		
		Queue queue2=new PriorityQueue();
		queue2.add(44);
		queue2.add(55);
		queue2.add(66);
		System.out.println(queue2);//[44, 55, 66]
		
		Set set1=new TreeSet();
		set1.add(70);
		set1.add(80);
		set1.add(90);
		System.out.println(set1);//[70, 80, 90]

	}

}
