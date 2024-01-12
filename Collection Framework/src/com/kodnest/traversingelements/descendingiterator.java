package com.kodnest.traversingelements;

import java.util.*;
import java.util.Iterator;

public class descendingiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		Iterator itr=ad.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
