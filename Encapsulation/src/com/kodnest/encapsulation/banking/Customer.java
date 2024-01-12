package com.kodnest.encapsulation.banking;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin=scan.nextInt();
		System.out.println("Enter the amount");
		int amount=scan.nextInt();
		Bank b=new Bank();
		//calling setter method
		b.setData(pin, amount);
		//calling getter method
		System.out.println(b.getData(pin,amount));
	}

}
