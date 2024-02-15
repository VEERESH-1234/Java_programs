package com.kodnest.strings;

import java.util.Scanner;

public class StringtoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		char[] arr=str.toCharArray();
		for(char x:arr)
		{
			System.out.print(x+" ");
		}

	}

}