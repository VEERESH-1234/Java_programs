package com.kodnest.arrays.linearsearch;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		//create an array
		int []arr=new int[scan.nextInt()];
		
		//Storing the elements in array
		System.out.println("Enter the "+arr.length+" numbers to be stored in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Asking the key from user
		System.out.println("Enter the key to be searched");
		int key=scan.nextInt();
		//Invoking the linearsearch()
		System.out.println(Search.linearsearch(arr,key));

	}

}
