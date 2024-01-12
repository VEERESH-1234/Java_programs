package com.kodesnt.Map;

import java.util.*;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, 100);
		hm.put(3, "Mango");
		hm.put("One", 300);
		hm.put(2, 400);
		hm.put("Two", 600);
		System.out.println(hm);
		//Accessing only keys using keyset method
		Set keys=hm.keySet();
		System.out.println(keys);//[1, 2, 3, One, Two]

		Collection values=hm.values();
		System.out.println(values);//[100, 400, Mango, 300, 600]

		Set keyValue=hm.entrySet();
		System.out.println(keyValue);//[1=100, 2=400, 3=Mango, One=300, Two=600]
	}

}
