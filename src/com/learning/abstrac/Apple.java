package com.learning.abstrac;

public class Apple extends Tree {

	public void fruit() {
		System.out.println("apple fruit is red");
	}
	public void leaf() {
		System.out.println("apple leaf is small");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree apple = new Apple();
		apple.fruit();
		apple.leaf();
	}

}
