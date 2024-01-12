package com.kodnest.traversingelements;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList al=new ArrayList();
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(40);
		for(Object x:al) {
			System.out.println(x+" ");
		}*/
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(50);
		ad.add(30);
		ad.add(20);
		ad.add(10);
		ad.add(40);
		ad.addFirst("First");
		ad.addLast("Last");
		for(Object x:ad) {
			System.out.println(x+" ");
		}

	}

}
