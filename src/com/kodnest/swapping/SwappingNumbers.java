package com.kodnest.swapping;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Asking the user to enter 2 numbers
		System.out.println("Enter the 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int temp;
		//Displaying the numbers before swapping
		System.out.println("Numbers before swapping : "+num1+" "+num2);
		temp=num2;
		num2=num1;
		num1=temp;
		//Displaying the numbers after swapping
		System.out.println("Numbers after swapping : "+num1+" "+num2);
		

	}

}
