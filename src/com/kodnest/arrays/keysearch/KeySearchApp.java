package com.kodnest.arrays.keysearch;

import java.util.Scanner;

public class KeySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int[]arr=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be search");
		int key=scan.nextInt();
		KeySearch.display(arr,key);
	}

}
