package com.kodnest.multithreading.joinmethod;

public class InstagramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instagram app started");
		Chatting ch=new Chatting();
		Reel rl=new Reel();
		
		ch.start();
		rl.start();
		
		try
		{
			ch.join();
			rl.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Instagram app ended");

	}

}
