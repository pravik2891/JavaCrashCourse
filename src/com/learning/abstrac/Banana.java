package com.learning.abstrac;

public class Banana extends Tree {
	
	public void fruit() {
		System.out.println("banana fruit is yellow");
	}
	public void leaf() {
		System.out.println("banana leaf is yellow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree banana = new Banana();
		banana.fruit();
		banana.leaf();

	}

}
