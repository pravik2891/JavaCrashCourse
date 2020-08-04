package com.learning.abstrac;

public class Interfacechild2 extends Interfaceparent implements NewProject{
	
	 void fruit() {
		 System.out.println("fruit is method name of child2");
	 }
	 void leaf() {
		 System.out.println("leaf is method name of child2");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceparent parent2 = new Interfacechild2();
		parent2.fruit();
		parent2.leaf();

	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("im method3");
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("im method4");
		
		
	}

}
