package com.kodnest.arrays.negtozero;

import java.util.Scanner;

public class ReplacingNegtoZero {
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
		//displaying the elements before replacing negative to zero
		System.out.print("Elements before replacing neg numbers are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		//Invoking the negtozero()
		int[]replacedarray=replacednumber.negtozero(arr);
		System.out.println();
		//displaying the elements after replacing negative to zero
		System.out.println("After replacing the elements neg to zeroes are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

}
}
