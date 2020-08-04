package com.lear.overridepoly;

public class Pravin extends Parent {
	
	public void exam() {
		System.out.println("no i dont agree");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Parent aim = new Pravin();
		aim.bike();
		aim.exam();
	}

}
