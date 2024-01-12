package com.kodnest.encapsulation.laptop;

public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop("corei5",8);
		System.out.println(l1.getProcessorName()+" "+l1.getMemorySize());
		
		Laptop l2=new Laptop("corei7",16);
		System.out.println(l2.getProcessorName()+" "+l2.getMemorySize());


	}

}
