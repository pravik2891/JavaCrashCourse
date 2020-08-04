package com.lao.learningjavacrash;
//class method object
public class Bankaccholding {
	
	Long accountnumber = 1234567890l;
	String name = "pravin";
	Integer accountbalance= 500;
	
	public void getBalance() {
		System.out.println("balance is" + accountbalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class name name = new classname;
		
		Bankaccholding holding = new Bankaccholding();
		holding.getBalance();

	}

}
