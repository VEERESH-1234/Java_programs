package com.kodnest.inheritance.paymentmethod;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPI upi=new UPI();
		upi.bill();
		upi.offer();
		upi.pay();
		
		Wallet wt=new Wallet();
		wt.bill();
		wt.offer();
		wt.pay();
		
		Card cd=new Card();
		cd.bill();
		cd.offer();
		cd.pay();

	}

}
