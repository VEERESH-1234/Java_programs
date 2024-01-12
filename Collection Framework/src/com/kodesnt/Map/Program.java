package com.kodesnt.Map;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		tm.put(1,100);
		tm.put(3, "Mango");
		tm.put(5,300);
		tm.put(2, "Apple");
		tm.put(4,500);
		System.out.println(tm);// {1=100, 2=Apple, 3=Mango, 4=500, 5=300}
		
		HashMap hm=new HashMap();
		hm.put(1,100);
	    hm.put(3, "Mango");
		hm.put("One",300);
		hm.put(2, 400);
		hm.put(8,"Apple");
		hm.put(4, 500);
		hm.put("Two", 600);
		hm.put(7, 700);
		System.out.println(hm);//{1=100, 2=400, 3=Mango, 4=500, One=300, 7=700, 8=Apple, Two=600}
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1,100);
	    lhm.put(3, "Mango");
		lhm.put("One",300);
		lhm.put(2, 400);
		lhm.put(8,"Apple");
		lhm.put(4, 500);
		lhm.put("Two", 600);
		lhm.put(7, 700);
		System.out.println(lhm);//{1=100, 3=Mango, One=300, 2=400, 8=Apple, 4=500, Two=600, 7=700}
	}

}
