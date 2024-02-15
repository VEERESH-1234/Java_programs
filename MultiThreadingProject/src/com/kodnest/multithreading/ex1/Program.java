package com.kodnest.multithreading.ex1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t);
		//changing the thread name
		t.setName("Mythread");
		//changing the priority of thread
		t.setPriority(3);
		System.out.println(t);

	}

}
