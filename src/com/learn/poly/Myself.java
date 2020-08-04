package com.learn.poly;

public class Myself {
	
	public void talk(Partner SpeakingStyle) {
		System.out.println("Friendly");
		
	}

	public void talk(Boss SpeakingStyle) {
		System.out.println("business");
		
	}
   
	public void talk(Parent SpeakingStyle) {
		System.out.println("polite");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Myself myself = new Myself();		
		Parent parent= new Parent();
		myself.talk(parent);
		
		Boss boss = new Boss();
		myself.talk(boss);
		
		Partner partner = new Partner();
		myself.talk(partner);
			

	}

}
