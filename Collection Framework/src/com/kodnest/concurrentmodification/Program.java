package com.kodnest.concurrentmodification;

import java.util.*;
//concurrent modifications
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		int count=40;
		//performing concurrent modification in for loop
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");//reading
			al.add(count+=10);//writing
		}
		//performing concurrent modification in for each loop
		for(Object x:al)
		{
			System.out.print(x+" ");//reading
			al.add(count+=10);//writing
		}
		//perfroming concurrent modification in iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");//reading
			al.add(count+=10);//writing
		}
	}

}
