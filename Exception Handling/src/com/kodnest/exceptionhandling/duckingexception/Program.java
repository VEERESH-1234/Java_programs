package com.kodnest.exceptionhandling.duckingexception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) {
		//Handling an exception ducked by the called method
		try
		{
			System.out.println("Enter a string");
			String str=takeInput();
			System.out.println("The string is "+str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String takeInput() throws Exception//ducking an exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=br.readLine();
		return str;
	}

}
