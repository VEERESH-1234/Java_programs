package com.kodnest.arrays.searching;

import java.util.Scanner;

public class SearchingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int [] arr=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be search");
		int key=scan.nextInt();
		System.out.println("Enter the operation");
		int operation=scan.nextInt();
		switch(operation)
		{
		case 1:Search.linearsearch(arr,key);
		return;
		case 2:Search.binarysearch(arr,key);
		}
		

	}

}
