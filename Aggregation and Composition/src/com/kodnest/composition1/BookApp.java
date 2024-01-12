package com.kodnest.composition1;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk=new Book();
		bk.read();
		bk.pg.display();
		bk=null;
		bk.read();
		bk.pg.display();
	}

}
