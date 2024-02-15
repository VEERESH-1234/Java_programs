package com.kodnest.inheritance.polymorphism1;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPI upi=new UPI();
		Wallet wt=new Wallet();
		Card cd=new Card();
		Amount am=new Amount();
		am.doActivity(upi);
		am.doActivity(wt);
		am.doActivity(cd);
		
	}

}
