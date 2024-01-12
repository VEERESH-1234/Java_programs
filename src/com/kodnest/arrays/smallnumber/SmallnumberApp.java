package com.kodnest.arrays.smallnumber;

import java.util.Scanner;

public class SmallnumberApp {

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
		smallnumber.find(arr);

	}

}
