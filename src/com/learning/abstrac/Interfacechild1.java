package com.learning.abstrac;

public class Interfacechild1 extends Interfaceparent implements NewProject {
	
	void fruit() {
		 System.out.println("fruit is method name of child1");
	 }
	 void leaf() {
		 System.out.println("leaf is method name of child1");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceparent parent = new Interfacechild1();
		parent.fruit();
		parent.leaf();

	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("im method1");
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("im method2");
		
	}

}
