package com.kodnest.exceptionhandling.custom1;

import java.util.Scanner;

public class DrivingLicenseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the age to get the driving license");
			int age=scan.nextInt();
			applyDrivingLicense(age);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	public static void applyDrivingLicense(int age) throws Exception
	{
		if(age>=18 && age<=65)
		{
			System.out.println("You are eligible to apply Driving License");
		}
		else if(age<18)
		{
			UnderAgeException uae=new UnderAgeException();
			throw uae;
		}
		else
		{
			OverAgeException oae=new OverAgeException();
			throw oae;
		}
	}

}
