package com.kodnest.interface7;

public interface DominosRestaurant 
{
	//Abstract method
	public abstract void colorRestaurant();
	//static method
	static void maintainCleanliness()
	{
		System.out.println("Clean reataurant daily");
	}
	//default method
	default public void cook()
	{
		System.out.println("Cook tasty Pizza");
	}
	//private method
	private void recipe()
	{
		System.out.println("Recipe of s");
	}
}
