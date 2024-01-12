package com.kodnest.traversingelements;

import java.util.ArrayList;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		//using for loop
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		//using advanced for loop
		for(Object x:al)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
