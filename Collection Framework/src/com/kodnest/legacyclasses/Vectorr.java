package com.kodnest.legacyclasses;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vc=new Vector();
		vc.add(10);
		vc.add(20);
		vc.add(30);
		vc.add(40);
		vc.add(50);
		Enumeration en=vc.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement()+" ");
		}
	}

}
