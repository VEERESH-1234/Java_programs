package com.kodnest.concurrentmodification;
import java.util.concurrent.CopyOnWriteArrayList;
//concurrent modifications
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList cowal=new CopyOnWriteArrayList();
		cowal.add(10);
		cowal.add(20);
		cowal.add(30);
		int count=40;
		//performing concurrent modification in for each loop
		for(Object x:cowal)
		{
			System.out.print(x+" ");//reading
			cowal.add(count+=10);//writing
		}
		System.out.println("After performing concurrent modification");
		System.out.println(cowal);
	}

}
