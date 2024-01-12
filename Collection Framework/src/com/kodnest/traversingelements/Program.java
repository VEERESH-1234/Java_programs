package com.kodnest.traversingelements;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);
		al.add(30);
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		/*ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(50);
		ad.add(40);
		ad.add(30);
		for(int i=0;i<=ad.size()-1;i++)
		{
			System.out.print(ad.get(i)+" ");//Error,cannot access the index
		}*/

	}

}
