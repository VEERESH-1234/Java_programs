package com.kodnest.LinkedList;

import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("Mango");
		ll.add(55.5f);
		ll.add(true);
		System.out.println(ll);
		ll.add(2,99);
		System.out.println(ll);

	}

}
