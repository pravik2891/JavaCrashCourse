package com.lao.learningjavacrash;

public class Returntypes {
	Integer amount = 1500;
	
	public Integer getamounttodad() {
		System.out.println("amount received is" + amount);
		return amount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Returntypes totamt = new Returntypes();
		Integer receivamt = totamt.getamounttodad();
		System.out.println("amount received and deliverd is" + receivamt);
	}

}
