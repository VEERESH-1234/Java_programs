package com.kodnest.exceptionhandling.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Program execution is started");
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter numerator");
			int a=scan.nextInt();
			System.out.println("Enter denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("Division result is : "+c);
			System.out.println("Enter the size of array");
			int size=scan.nextInt();
			int[]arr=new int[size];
			System.out.println("Enter the element to be stored in the array");
			int element=scan.nextInt();
			System.out.println("Enter the index at which the element has to be stored");
			int index=scan.nextInt();
			arr[index]=element;
			System.out.println("Element is stored in the array");
		}
		//Specific catch block for handling ArithmeticException
		catch(ArithmeticException ae)
		{
			System.out.println("Dont enter denominator as 0");
		}
		//Specific catch block for handling NegativeArraySizeException
		catch(NegativeArraySizeException nase)
		{
			System.out.println("Do not enter negative size for array");
		}
		//Specific catch block for handling InputMismatchException
		catch(InputMismatchException ime)
		{
			System.out.println("Do not enter String value in int variable");
		}
		//Specific catch block for handling ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Enter valid index for array");
		}
		//Generic catch block to handle any other exceptions except mentioned above
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			System.out.println("Program execution is ended");
		}
	}
}
