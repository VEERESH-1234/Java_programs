package com.kodnest.arrays.bubblesort1;

public class BubblesortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubblesort bs=new Bubblesort();
		//calling the createArr() for creating the array
		int[]arr=bs.createArray();
		//calling the bubbleSort() for sorting the array
		int[]sortedArr=bs.bubbleSort(arr);
		//calling the displayArray() for displaying the sorted array
		bs.displayArray(sortedArr);

	}

}
