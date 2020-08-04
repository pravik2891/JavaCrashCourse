package com.lao.learningjavacrash;

public class ChildClass extends ParentClass {
	
	// creation
	public ChildClass() {
		
		System.out.println("child is created");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parent = new ChildClass();

		ChildClass children = new ChildClass(); 
	
	}

}
