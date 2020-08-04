package com.lao.learningjavacrash;

public class ConstrutorOverload {
	
	String drawing;
	
	ConstrutorOverload() {
		// TODO Auto-generated constructor stub
		System.out.println("Object is created");
	}
	ConstrutorOverload(String toDraw){
		drawing = toDraw;
		System.out.println("object is created " + toDraw);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstrutorOverload overload = new ConstrutorOverload();
		System.out.println(overload);
		ConstrutorOverload overload2= new ConstrutorOverload("circle");
		System.out.println();
	
	}

}
