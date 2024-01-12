package com.kodnest.bubblesorting;

import java.util.Scanner;

public class Binarysearchusingbubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		//creating an array
		int [] arr=new int[scan.nextInt()];
		//storing the elements in array
		System.out.println("Enter the "+arr.length+" numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Asking user to enter the key to be searched
		System.out.println("Enter the key");
		int key=scan.nextInt();
		//invoking the bubblesort()
		Search.bubblesort(arr,key);
		
		

	}

}
