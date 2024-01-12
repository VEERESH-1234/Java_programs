package com.kodnest.traversingelements;

import java.util.ArrayList;
import java.util.ListIterator;

public class Reversedirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		ListIterator litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");//50 40 30 20 10 
		}

	}

}
