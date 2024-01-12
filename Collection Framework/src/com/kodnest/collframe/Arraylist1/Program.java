package com.kodnest.collframe.Arraylist1;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Mango");
		al.add(55.5f);
		al.add(true);
		System.out.println(al);
		al.add(2,99);
		System.out.println(al);
	}
}
