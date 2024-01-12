package com.kodnest.ArrayDeque;

import java.util.ArrayDeque;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Mango");
		ad.add(55.5f);
		ad.add(true);
		System.out.println(ad);
		ad.addFirst("First");
		ad.addLast("Last");
		System.out.println(ad);

	}

}
