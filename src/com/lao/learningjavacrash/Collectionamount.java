package com.lao.learningjavacrash;

public class Collectionamount {
	
	Integer amount = 200;
	
	public Integer giveTheAmtToMe() {System.out.println("amount collected"+amount);
	return amount;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collectionamount rupees = new Collectionamount();
		Integer theAmtToMe = rupees.giveTheAmtToMe();
		

		System.out.println("amount given is "+theAmtToMe);
	}

}
