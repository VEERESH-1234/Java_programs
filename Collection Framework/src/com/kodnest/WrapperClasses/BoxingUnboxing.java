package com.kodnest.WrapperClasses;

import java.util.ArrayList;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		//Boxing
		al.add(10);//al.add(new Integer(10));
		al.add(35.5f);//al.add(new Float(35.5f));
		al.add(true);//al.add(new Boolean(true));
		al.add('k');//al.add(new Character('k'));
		System.out.println(al);//[10, 35.5, true, k]
		
		//UnBoxing
		int a=(int) al.get(0);
		float b=(float)al.get(1);
		boolean c=(boolean)al.get(2);
		char d=(char)al.get(3);
		System.out.println(a);//10
		System.out.println(b);//35.5
		System.out.println(c);//true
		System.out.println(d);//k

	}

}
