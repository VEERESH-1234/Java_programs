package com.kodnest.collframe.Arraylist1;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList fruitsList=new ArrayList();
		fruitsList.add("Mango");
		fruitsList.add("Orange");
		fruitsList.add("Apple");
		fruitsList.add("Banana");
		System.out.println(fruitsList);
		
		ArrayList vegList=new ArrayList();
		vegList.add("Brinjal");
		vegList.add("Ladyfinger");
		vegList.add("Bottleguard");
		System.out.println(vegList);
		
		ArrayList groceryList=new ArrayList();
		groceryList.addAll(fruitsList);
		groceryList.addAll(2,vegList);
		System.out.println(groceryList);

	}

}
